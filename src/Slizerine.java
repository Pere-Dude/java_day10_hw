public class Slizerine extends Hogwards {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slizerine(String name, int magic, int transgression, int cunning, int determination, int ambition,
                     int resourcefulness, int lustForPower) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public void printInfo() {
        System.out.println("==" + super.getName() + "==");
        super.printInfo();
        System.out.println("Хитрость: " + cunning + "\n" +
                "Решительность: " + determination + "\n" +
                "Амбициозность: " + ambition + "\n" +
                "Находчивость: " + resourcefulness + "\n" +
                "Жажда власти: " + lustForPower );
    }

    public void bestStudent(Slizerine otherStudent) {
        int studentOnePoints = this.getMagic() + this.getTransgression() + this.cunning + this.determination
                + this.ambition + this.resourcefulness + this.lustForPower;
        int studentTwoPoints = otherStudent.getMagic() + otherStudent.getTransgression() + otherStudent.cunning
                + otherStudent.determination + otherStudent.ambition + this.resourcefulness + this.lustForPower;

        if(studentOnePoints == studentTwoPoints) {
            System.out.println("У студентов одинаковое количество баллов");
        } else {
            if (studentOnePoints > studentTwoPoints) {
                System.out.println("Лучший ученик факультета Слизерин: " + this.getName());
            } else {
                System.out.println("Лучший ученик факультета Слизерин: " + otherStudent.getName());
            }
        }
    }
}
