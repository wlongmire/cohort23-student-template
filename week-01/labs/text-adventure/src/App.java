import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
//        String input;
//        int roomsVisited = 0;
//        boolean isRunning = true;
//        String location = "courtyard";
//
//        // Show Greeting
//        System.out.println("Welcome to Adventure.");
//        System.out.println("-".repeat(30));
//
//        while(isRunning) {
//            // Display current location
//            System.out.printf("You are currently in the %s.%n", location);
//            System.out.printf("You have traveled through %d rooms.%n", roomsVisited);
//
//            // Display options for next location
//            System.out.println("-".repeat(30));
//            System.out.println("Here are your options:");
//            switch(location) {
//                case("courtyard"):
//                    System.out.println("\tNorth of you there is a path.");
//                    break;
//                case("doorway"):
//                    System.out.println("\tNorth of you is a stately livingroom");
//                    System.out.println("\tWest lies a evil looking garage...");
//                    System.out.println("\tSouth, the courtyard waits...");
//                    break;
//                case("garage"):
//                    System.out.println("\tSouth of you is that lovely doorway");
//                    System.out.println("\tNorth of you, there is some in that firely looking hole?");
//                default:
//                    System.out.println("You are confused and don't know where to go.");
//            }
//
//            // Get new user direction
//
//            System.out.print("\nWhere do you want to go: ");
//            input = console.nextLine();
//
//            //find next user location
//            switch (location) {
//                case ("courtyard"):
//                    if (input.equalsIgnoreCase("north")) {
//                        location = "doorway";
//                    }
//                    break;
//                case ("doorway"):
//                    if (input.equalsIgnoreCase("north")) {
//                        location = "livingroom";
//                    } else if (input.equalsIgnoreCase("west")) {
//                        location = "garage";
//                    } else if (input.equalsIgnoreCase("south")) {
//                        location = "courtyard";
//                    }
//                    break;
//                case ("garage"):
//                    if (input.equalsIgnoreCase("north")) {
//                        //User losses
//                        System.out.println("You stumbled, somehow, into hades....");
//                        isRunning = false;
//                    } else if (input.equalsIgnoreCase("south")) {
//                        location = "doorway";
//                    }
//            }
//
//            roomsVisited ++;
//        }
//
//
//        // Show Parting Words
//        System.out.println("Want to play again.");

        String value;
        boolean isNotValid;
        do {
            System.out.println("Give me a value:");
            value = console.nextLine();
            if (value.equalsIgnoreCase("yes")){
                System.out.println("This is what we want.");
                isNotValid = false;
            } else {
                isNotValid = true;
            }
        } while(isNotValid);

    }
}

// Maze
// courtyard
//      north - doorway

// doorway
//      south - courtyard
//      north - living room
//      west - garage

// living room
//      south - doorway
//      north - kitchen - winning

// garage
//     south - doorway
//     north - hell - losing