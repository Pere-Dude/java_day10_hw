public class Hogwards {
    private String name;
    private int magic;
    private int transgression;

    public Hogwards(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public void printInfo() {
        System.out.print("Колдовство: " + magic + "\n" +
                "Трансгрессия: " + transgression + "\n");
    }

    public String getName() {
        return name;
    }

    public int getMagic() {
        return magic;
    }

    public int getTransgression() {
        return transgression;
    }
}
