import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input;
        boolean isRunning = true;
        String location = "courtyard";

        // Show Greeting
        System.out.println("Welcome to Adventure");

        while(isRunning) {
            // Display current location
            System.out.printf("You are currently in the %s.%n", location);

            // Display options for next location
            switch(location) {
                case("courtyard"):
                    System.out.println("You see a path north of you...");
                    break;
                case("doorway"):
                    System.out.println("North of you is a stately livingroom");
                    System.out.println("To the west lies a evil looking garage...");
                    System.out.println("Behind you, the courtyard waits...");
                    break;
                case("garage"):
                    System.out.println("South of you is that lovely doorway");
                    System.out.println("But what in that firely looking hole to the north?");
                default:
                    System.out.println("You are confused and don't know where to go.");
            }

            // Get new user direction
            System.out.println("Where do you want to go?");
            input = console.nextLine();

            //find next user location
            switch(location) {
                case("courtyard"):
                    if (input.equalsIgnoreCase("north")){
                        location = "doorway";
                    }
                    break;
                case("doorway"):
                    if (input.equalsIgnoreCase("north")) {
                        location = "livingroom";
                    } else if (input.equalsIgnoreCase("west")) {
                        location = "garage";
                    } else if (input.equalsIgnoreCase("south")) {
                        location = "courtyard";
                    }
                    break;
                case("garage"):
                    if (input.equalsIgnoreCase("north")) {
                        //User losses
                        System.out.println("You stumbled, somehow, into hades....");
                        isRunning = false;
                    } else if (input.equalsIgnoreCase("south")) {
                        location = "doorway";
                    }
            }
        }

        // Show Parting Words
        System.out.println("Want to play again.");
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