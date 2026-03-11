import java.util.Map;
/**
 * Use Case 4: Room Search & Availability Check
 * Focuses on read-only access to inventory.
 */
public class RoomSearchService {

    public void searchAvailableRooms(
            RoomInventory inventory,
            Room singleRoom,
            Room doubleRoom,
            Room suiteRoom) {

        Map<String, Integer> availability = inventory.getRoomAvailability();

        if (availability.get("Single") > 0) {
            displayRoomDetails("Single Room", singleRoom, availability.get("Single"));
        }

        if (availability.get("Double") > 0) {
            displayRoomDetails("Double Room", doubleRoom, availability.get("Double"));
        }

        if (availability.get("Suite") > 0) {
            displayRoomDetails("Suite Room", suiteRoom, availability.get("Suite"));
        }
    }

    private void displayRoomDetails(String title, Room room, int count) {
        System.out.println(title + ":");
        System.out.println("Beds: " + room.getBeds());
        System.out.println("Size: " + room.getSize() + " sqft");
        System.out.println("Price per night: " + room.getPrice());
        System.out.println("Available: " + count);
        System.out.println();
    }
}