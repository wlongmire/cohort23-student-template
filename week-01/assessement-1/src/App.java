import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //Startup
//        Welcome to Capsule-Capsule.
//                ===========================
//        Enter the number of capsules available: 100
//
//        There are 100 unoccupied capsules ready to be booked.
        //      Print Welcoming message
        //      Allow user to enter number of capsules
        //      Initialize the capsule array to the size indicated by user.
        //      Message for unoccupied capsules.
        System.out.println("Welcome Message.");
        int numCapsules = console.nextInt();
        String[] guests = new String[numCapsules];
        System.out.println("Enter the number of capsules avalible: " + numCapsules);

        //Main Menu
        //      Print all menu items
        //      Get user input on menu selection
        //      Execute the selection given

        //Check in
        //      Show Checkin Message
        //      Get name for user
        //      Get checkin capsule
        //          check if it's occupied. (guest[checkinNumber] == null)
        //      Assign name to capsule

        //Check out

        //View Guests

        //Exit
    }

}
