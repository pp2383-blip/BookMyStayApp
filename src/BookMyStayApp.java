import java.util.Map;

public class BookMyStayApp {

    public static void main(String[] args) {
        System.out.println("Room Search\n");

        // 1. Initialize Inventory and Room Objects
        RoomInventory inventory = new RoomInventory();
        Room single = new SingleRoom();
        Room doubleRm = new DoubleRoom();
        Room suite = new SuiteRoom();

        // 2. Initialize the Search Service
        RoomSearchService searchService = new RoomSearchService();

        // 3. Execute Search (Read-only operation)
        searchService.searchAvailableRooms(inventory, single, doubleRm, suite);
    }
}