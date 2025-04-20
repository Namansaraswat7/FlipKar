package design.flipkar;

public class BookingController {

    BookingService bookingService;
    BranchController branchController;

    public BookingController(BranchController branchController) {
        this.branchController = branchController;
        this.bookingService = new BookingService(branchController);
    }

    BookingStatus rentVehicle( String VehicleType, String bookingStartTime, String bookingEndTime ) {
        BookingStatus bookingStatus = bookingService.createBooking(VehicleType,bookingStartTime,bookingEndTime);

        return bookingStatus;
    }

}
