package design.flipkar;

import java.util.LinkedHashMap;
import java.util.Map;

public class Slot {

    SlotStatus slotStatus;

    private Map<String, SlotStatus> slots;

    public Slot() {
        slots = new LinkedHashMap<>();
        initializeSlots();
    }

    private void initializeSlots() {

        int startHour = 0; // Start at 12:00 AM
        int endHour = 24; // End at 11:00 PM

        for (int hour = startHour; hour < endHour; hour++) {
            String slot = String.format("%02d:00-%02d:00", hour, hour + 1);
            slots.put(slot, SlotStatus.AVAILABLE);
        }
    }

    public Map<String, SlotStatus> getSlots() {
        return slots;
    }

    public void bookSlot(String slot) {
        if (slots.containsKey(slot) && slots.get(slot) == SlotStatus.AVAILABLE) {
            slots.put(slot, SlotStatus.BOOKED);
        } else {
            throw new IllegalArgumentException("Slot is either invalid or already booked.");
        }
    }
    public void releaseSlot(String slot) {
        if (slots.containsKey(slot) && slots.get(slot) == SlotStatus.BOOKED) {
            slots.put(slot, SlotStatus.AVAILABLE);
        } else {
            throw new IllegalArgumentException("Slot is either invalid or not booked.");
        }
    }

    @Override
    public String toString() {
        return "Slot{" +
                "slotStatus=" + slotStatus +
                ", slots=" + slots +
                '}';
    }
}
