package design.flipkar;

public class Booking {
    Integer bookingId;
    String bookingStartTime;
    String bookingEndTime;
    BookingStatus status;
    BookingStrategy bookingStrategy;

    public Booking(BookingStrategy bookingStrategy) {
        this.bookingStrategy = bookingStrategy;
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public String getBookingStartTime() {
        return bookingStartTime;
    }

    public void setBookingStartTime(String bookingStartTime) {
        this.bookingStartTime = bookingStartTime;
    }

    public String getBookingEndTime() {
        return bookingEndTime;
    }

    public void setBookingEndTime(String bookingEndTime) {
        this.bookingEndTime = bookingEndTime;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }

    public BookingStrategy getBookingStrategy() {
        return bookingStrategy;
    }

    public void setBookingStrategy(BookingStrategy bookingStrategy) {
        this.bookingStrategy = bookingStrategy;
    }
}
