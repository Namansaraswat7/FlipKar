package design.flipkar;

import java.util.Map;

public class LowestPriceBooking implements BookingStrategy {
    @Override
    public BookingStatus booking(String vehicleType, String bookingStartTime, String bookingEndTime, Map<String, Branch> branchMap) {

        // search all booking vehicles based on start and end time availability and filter with lowest price
            Vehicle lowestPricedVehicle = null;
            Branch selectedBranch = null;

            for (Map.Entry<String, Branch> entry : branchMap.entrySet()) {
                Branch branch = entry.getValue();
                for (Vehicle vehicle : branch.getVehicleList()) {
                    if (vehicle.getVehicleType().toString().equalsIgnoreCase(vehicleType)) {

                        Map<String,SlotStatus> daySlots = vehicle.getMonthSlotMap().get(1).getSlots();
                        // check if slot is available or not
                        if(daySlots.get(bookingStartTime+"-"+bookingEndTime).equals(SlotStatus.AVAILABLE)) {

                            if (lowestPricedVehicle == null || vehicle.getPrice() < lowestPricedVehicle.getPrice()) {
                                lowestPricedVehicle = vehicle;
                                selectedBranch = branch;
                            }
                        }
                    }
                }
            }

        System.out.println("Lowest Price Vehicle is from branch " + selectedBranch.getName());
        System.out.println("Vehile selected" + lowestPricedVehicle);

        if(lowestPricedVehicle != null) {
            // book slot for this vehicle
            lowestPricedVehicle.getMonthSlotMap().get(1).bookSlot(bookingStartTime+"-"+bookingEndTime);
            return BookingStatus.CONFIRMED;
        }
        return BookingStatus.DECLINED;
    }
}
