import java.util.Scanner;

public class Exercise08 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // 1. Rewrite the following as a `do/while` statement.
        // Run the code before you make changes to better understand current behavior.
        // The transformation from `while` to `do/while` should not change behavior.

        System.out.println("Enter a name (Required): ");
        String name = console.nextLine();

        while (name.isBlank()) {
            System.out.println("Enter a name (Required): ");
            name = console.nextLine();
        }

        System.out.println("Name: " + name);
    }
}
