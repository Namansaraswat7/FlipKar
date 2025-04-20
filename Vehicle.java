package design.flipkar;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Vehicle {

    VehicleType vehicleType;

    int VehicleNo;
    int price;
    // slots of a vehicle in a month for each day hour wise

    // here key is each month date -> 10th April -> key would be 10
    // as we are storing slots for current month
    Map<Integer,Slot> monthSlotMap = new HashMap<>();

    public Vehicle() {

    }


    public Vehicle(String vehicleName, int price) {
        this.price = price;
        this.vehicleType = VehicleType.valueOf(vehicleName);
        for(int i =1; i< 31; i++){
            monthSlotMap.put(i,new Slot());
        }
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleType=" + vehicleType +
                ", price=" + price +
              //  ", monthSlotMap=" + monthSlotMap +
                '}';
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Map<Integer, Slot> getMonthSlotMap() {
        return monthSlotMap;
    }

    public void setMonthSlotMap(Map<Integer, Slot> monthSlotMap) {
        this.monthSlotMap = monthSlotMap;
    }
}
