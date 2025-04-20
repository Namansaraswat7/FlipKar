package design.flipkar;

import java.util.HashMap;
import java.util.Map;

public interface BookingStrategy {

    BookingStatus booking(String vehicleType, String bookingStartTime, String bookingEndTime, Map<String, Branch> branchMap);
}
