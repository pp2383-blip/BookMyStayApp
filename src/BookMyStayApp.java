import java.util.Map;

public class BookMyStayApp {

    public static void main(String[] args) {
        System.out.println("Hotel Room Inventory Status\n");

        // Initialize Inventory and Rooms
        RoomInventory inventory = new RoomInventory();
        Map<String, Integer> availability = inventory.getRoomAvailability();

        // Create Room objects to get characteristics (Price/Size)
        Room single = new SingleRoom();
        Room doubleRm = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Displaying data by pulling from the Centralized Inventory
        System.out.println("Single Room:");
        single.displayRoomDetails();
        System.out.println("Available Rooms: " + availability.get("Single Room") + "\n");

        System.out.println("Double Room:");
        doubleRm.displayRoomDetails();
        System.out.println("Available Rooms: " + availability.get("Double Room") + "\n");

        System.out.println("Suite Room:");
        suite.displayRoomDetails();
        System.out.println("Available Rooms: " + availability.get("Suite Room"));
    }
}