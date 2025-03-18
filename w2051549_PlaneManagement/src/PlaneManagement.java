import java.util.Scanner;
public class PlaneManagement {
    private static final int ROWS = 4;
    private static final int[] SEATS = {12, 14, 12, 14};
    private static final int[][] seatsAvailability = new int[ROWS][];

   // private static Ticket[] soldTickets = new Ticket[ROWS * 14]; // Maximum possible tickets

    public static void main(String[] args) {
        System.out.println(" ********************************************************");
        System.out.println(" ");
        System.out.println("*      Welcome to the Plane Management application       *");
        System.out.println(" ");
        System.out.println(" ******************************************************** ");
        System.out.println(" ");
        initializeSeats();

        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            displayMenu();
            System.out.print("Please select an option: ");
            option = scanner.nextInt();
            switch (option) {
                case 0:
                    System.out.println("Exiting...");
                    break;
                case 1:
                    buySeat(scanner);
                    break;
                case 2:
                    cancelSeat(scanner);
                    break;
                case 3:
                    findFirstAvailable();
                    break;
                case 4:
                    showSeatingPlan();
                    break;
                case 5:
                    printTicketsInfo();
                    break;
                case 6:
                    searchTicket(scanner);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 0);
        scanner.close();
    }

    private static void initializeSeats() {
        for (int i = 0; i < ROWS; i++) {
            seatsAvailability[i] = new int[SEATS[i]];
            for (int j = 0; j < SEATS[i]; j++) {
                seatsAvailability[i][j] = 0; // 0 indicates available seat
            }
        }
    }

    private static void displayMenu() {
        System.out.println("Main Menu:");
        System.out.println("1. Buy a ticket");
        System.out.println("2. Cancel a ticket");
        System.out.println("3. Find first available seat");
        System.out.println("4. Show seating plan");
        System.out.println("5. Print tickets info");
        System.out.println("6. Search for a ticket");
        System.out.println("0. Exit");
    }

    private static void buySeat(Scanner scanner) {
        // Implement buy_seat method as described in Task 3
    }

    private static void cancelSeat(Scanner scanner) {
        // Implement cancel_seat method as described in Task 4
    }

    private static void findFirstAvailable() {
        // Implement find_first_available method as described in Task 5
    }

    private static void showSeatingPlan() {
        // Implement show_seating_plan method as described in Task 6
    }

    private static void printTicketsInfo() {
        // Implement print_tickets_info method as described in Task 10
    }

    private static void searchTicket(Scanner scanner) {
        // Implement search_ticket method as described in Task 11
    }
}
