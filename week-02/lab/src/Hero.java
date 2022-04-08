public class Hero {

    private final String name;
    private char symbol = '@';
    private int x;
    private int y;

    // Create a hero with a name and an initial position.
    public Hero(String name, int x, int y, char symbol) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.symbol = symbol;
    }

    // getters

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // setters

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    // movement
    public void moveLeft() {
        x--;
    }

    public void moveRight() {
        x++;
    }

    public void moveUp() {
        y--;
    }

    public void moveDown() {
        y++;
    }
}
