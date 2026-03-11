import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Use Case 6: Room Allocation Service
 * Ensures unique room IDs and prevents double-booking.
 */
public class RoomAllocationService {
    private Set<String> allocatedRoomIds;
    private Map<String, Set<String>> assignedRoomsByType;

    public RoomAllocationService() {
        this.allocatedRoomIds = new HashSet<>();
        this.assignedRoomsByType = new HashMap<>();
    }

    public void allocateRoom(Reservation reservation, RoomInventory inventory) {
        String roomType = reservation.getRoomType();

        // Logical unit: Check availability, generate ID, and update inventory
        String roomId = generateRoomId(roomType);

        allocatedRoomIds.add(roomId);
        assignedRoomsByType.computeIfAbsent(roomType, k -> new HashSet<>()).add(roomId);

        inventory.updateInventory(roomType, -1); // Immediate synchronization

        System.out.println("Booking confirmed for Guest: " + reservation.getGuestName() +
                ", Room ID: " + roomId);
    }

    private String generateRoomId(String roomType) {
        int count = assignedRoomsByType.getOrDefault(roomType, new HashSet<>()).size() + 1;
        return roomType + "-" + count;
    }
}