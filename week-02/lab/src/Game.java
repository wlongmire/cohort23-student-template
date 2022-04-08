import java.util.Random;
import java.util.Scanner;

public class Game {
    //Making a custom game size:
    //  game.java
    //      add in height
    //      remove final for height and width
    //      make height and width instance (remove static)
    //      Let user define our height and width
    //          1. in run, ask the user for height and width and assign there.
    //          2. make a constuctor and pass in height and width from App.
    //      in setup:
    //          set randomization to take in height or width
    //      in printWorld:
    //          make sure we loop to height or width
    //      in move:
    //          make sure that we loss when hitting height or width

    // constants
    private final static int WIDTH = 10;
    private final static String WALL_CHARACTER = "M";
    private final static String EMPTY_CHARACTER = " ";

    private final Scanner console = new Scanner(System.in);

    private Hero hero;
    private Treasure treasure;
    private Trap trap;

    private boolean isOver;

    public void run() {
        setUp();
        while (!isOver) {
            printWorld();
            move();
        }
        printWorld();
    }

    private void setUp() {
        System.out.print("What is the name of your hero?: ");
        String name = console.nextLine();

        System.out.print("What symbol should  the user be?: ");
        char symbol = console.nextLine().charAt(0);

        Random rand = new Random();
        int x = rand.nextInt(WIDTH);
        int y = rand.nextInt(WIDTH);

        hero = new Hero(name, x, y, symbol);

        do {
            x = rand.nextInt(WIDTH);
            y = rand.nextInt(WIDTH);
        } while (x == hero.getX() && y == hero.getY());
        //put it anywhere but where the hero

        treasure = new Treasure(x, y);

        do {
            x = rand.nextInt(WIDTH);
            y = rand.nextInt(WIDTH);
        } while((x == hero.getX() && y == hero.getY()) || (x == treasure.getX() && y == treasure.getY()));
        //put it anywhere but where the hero or the treasure

        trap = new Trap(x, y);
    }

    private void printWorld() {
        // top wall border
        System.out.println(WALL_CHARACTER.repeat(WIDTH + 2));

        for (int row = 0; row < WIDTH; row++) {
            // left wall border
            System.out.print(WALL_CHARACTER);
            for (int col = 0; col < WIDTH; col++) {
                if (row == hero.getY() && col == hero.getX()) {
                    System.out.print(hero.getSymbol());
                } else if (row == treasure.getY() && col == treasure.getX()) {
                    System.out.print("T");
                } else if (row == trap.getY() && col == trap.getX()){
                    System.out.print(trap.getSymbol());
                }else {
                    System.out.print(EMPTY_CHARACTER);
                }
            }

            // right wall border
            System.out.println(WALL_CHARACTER);
        }

        // bottom wall border
        System.out.println(WALL_CHARACTER.repeat(WIDTH + 2));
    }

    private void move() {

        System.out.print(hero.getName() + ", move [WASD]: ");
        String move = console.nextLine().trim().toUpperCase();

        if (move.length() != 1) {
            return;
        }

        switch (move.charAt(0)) {
            case 'W':
                hero.moveUp();
                break;
            case 'A':
                hero.moveLeft();
                break;
            case 'S':
                hero.moveDown();
                break;
            case 'D':
                hero.moveRight();
                break;
        }

        //Win and Loss Check
        if (hero.getX() < 0 || hero.getX() >= WIDTH
                || hero.getY() < 0 || hero.getY() >= WIDTH) {
            System.out.println(hero.getName() + " touched lava! You lose.");
            isOver = true;
        } else if (trap.isTouching(hero.getX(), hero.getY())) {
            System.out.println(hero.getName() + " touched trap!!! You lose.");
            isOver = true;
        } else if (hero.getX() == treasure.getX() && hero.getY() == treasure.getY()) {
            System.out.println(hero.getName() + " found the treasure! You win.");
            isOver = true;
        }
    }
}
