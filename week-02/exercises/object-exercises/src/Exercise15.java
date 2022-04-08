public class Exercise15 {

    // 1. Create a new method in the Hero class.
    // Name: toLine
    // Inputs: none
    // Output: String
    // Description: returns the Hero's name and powers as a single line of text.

    // { } - Define a block of code.
    public static void main(String[] args) {
        Power[] sPowers = { new Power("Strength"), new Power("Webs"), new Power("Stickiness") };

        // [] define an index of an array
        //sPowers[0].getName()

        Hero spiderman = new Hero("Spiderman", sPowers);

        //"." define a method connected to a class.
        String desc = spiderman.toLine();

        //() define a list of arguments going into a method
        System.out.println(desc);

        // 2. Instantiate your three favorite super heroes with appropriate powers.
        // 3. Use the `toLine` method to print each hero's details to the console.
    }
}
