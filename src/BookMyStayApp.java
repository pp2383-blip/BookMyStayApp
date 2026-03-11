public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("Hotel Room Initialization\n");

        Room single = new SingleRoom();
        Room doubleRm = new DoubleRoom();
        Room suite = new SuiteRoom();

        int singleAvail = 5;
        int doubleAvail = 3;
        int suiteAvail = 2;

        System.out.println(single.getRoomType());
        single.displayRoomDetails();
        System.out.println("Available: " + singleAvail + "\n");

        System.out.println(doubleRm.getRoomType());
        doubleRm.displayRoomDetails();
        System.out.println("Available: " + doubleAvail + "\n");

        System.out.println(suite.getRoomType());
        suite.displayRoomDetails();
        System.out.println("Available: " + suiteAvail);
    }
}