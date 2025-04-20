package design.flipkar;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookingService {

    BranchController branchController;

    List<Booking> bookings = new ArrayList<>();

    int bookingCount = 0;

    public BookingService(BranchController branchController){
        this.branchController = branchController;
    }

    public BookingStatus createBooking(String vehicleType, String bookingStartTime, String bookingEndTime) {

        Map<String,Branch> branchMap = branchController.getBranches();

        Booking booking = new Booking(new LowestPriceBooking());
        booking.setBookingId(bookingCount++);
        booking.setBookingEndTime(bookingEndTime);
        booking.setBookingStartTime(bookingStartTime);
        BookingStatus bookingStatus = booking.getBookingStrategy().booking(vehicleType,bookingStartTime,bookingEndTime,branchMap);
        booking.setStatus(bookingStatus);

        bookings.add(booking);

        return bookingStatus;

    }
}
