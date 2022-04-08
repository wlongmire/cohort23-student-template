public class Trap {
    final private char symbol = '~';
    final private int x;
    final private int y;

    public Trap(int x, int y) {
        this.x = x;
        this.y = y;
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

    public boolean isTouching(int x, int y) {
        return(x == this.getX() && y == this.getY());
    }
}
