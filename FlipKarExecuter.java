package design.flipkar;

public class FlipkarExecutor {

    public static void main(String[] args) {

        BranchController branchController = new BranchController();
        String [] branchDetails = new String[3];
        branchDetails[0] = "1 suv for Rs.12 per hour";
        branchDetails[1] = "3 sedan for Rs.10 per hour";
        branchDetails[2] = "3 bike for Rs.20 per hour";
        branchController.addBranch("koramangala",branchDetails);

        branchDetails[0] = "1 suv for Rs.11 per hour";
        branchDetails[1] = "3 sedan for Rs.8 per hour";
        branchDetails[2] = "3 bike for Rs.8 per hour";

        branchController.addBranch("electronicCity",branchDetails);

        branchController.addVehicle("koramangala","1 bike for Rs.9 per hour");

        BookingController bookingController = new BookingController(branchController);

        bookingController.rentVehicle("suv","09:00", "10:00");


    }
}
