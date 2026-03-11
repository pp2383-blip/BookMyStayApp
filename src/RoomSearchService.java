import java.util.Map;

/**
 * CLASS - RoomSearchService
 * Version: 4.0
 */
public class RoomSearchService {

  /**
   * Displays available rooms along with their details and pricing.
   * This method performs read-only access to inventory and room data.
   */
  public void searchAvailableRooms(
          RoomInventory inventory,
          Room singleRoom,
          Room doubleRoom,
          Room suiteRoom) {

    Map<String, Integer> availability = inventory.getRoomAvailability();

    // Check and display Single Room availability
    if (availability.get("Single Room") > 0) {
      System.out.println("Single Room:");
      singleRoom.displayRoomDetails();
      System.out.println("Available: " + availability.get("Single Room") + "\n");
    }

    // Check and display Double Room availability
    if (availability.get("Double Room") > 0) {
      System.out.println("Double Room:");
      doubleRoom.displayRoomDetails();
      System.out.println("Available: " + availability.get("Double Room") + "\n");
    }

    // Check and display Suite Room availability
    if (availability.get("Suite Room") > 0) {
      System.out.println("Suite Room:");
      suiteRoom.displayRoomDetails();
      System.out.println("Available: " + availability.get("Suite Room") + "\n");
    }
  }
}