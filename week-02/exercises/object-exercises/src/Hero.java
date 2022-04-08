public class Hero {
    private String name;
    private Power[] powers;

    public Hero(String name, Power[] powers){
        this.name = name;
        this.powers = powers;
    }

    public String toLine() {
        String result = "";

        result += this.name + ": ";

        for(int i = 0; i < powers.length; i++) {
            result += powers[i].getName() + ',';
        }

        return result.substring(0, result.length() - 1);
    }

    public String getName() {
        return name;
    }

    public Power[] getPowers() {
        return powers;
    }
}