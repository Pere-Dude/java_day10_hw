public class Kogtevran extends Hogwards{
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public Kogtevran(String name, int magic, int transgression, int mind, int wisdom, int wit, int creation) {
        super(name, magic, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public void printInfo() {
        System.out.println("==" + super.getName() + "==");
        super.printInfo();
        System.out.println("Ум: " + mind + "\n" +
                "Мудрость: " + wisdom + "\n" +
                "Остроумие: " + wit + "\n" +
                "Творчество: " + creation);
    }

    public void bestStudent(Kogtevran otherStudent) {
        int studentOnePoints = this.getMagic() + this.getTransgression() + this.mind + this.wisdom + this.wit
                + this.creation;
        int studentTwoPoints = otherStudent.getMagic() + otherStudent.getTransgression() + otherStudent.mind
                + otherStudent.wisdom + otherStudent.wit + this.creation;

        if(studentOnePoints == studentTwoPoints) {
            System.out.println("У студентов одинаковое количество баллов");
        } else {
            if (studentOnePoints > studentTwoPoints) {
                System.out.println("Лучший ученик факультета Когтевран: " + this.getName());
            } else {
                System.out.println("Лучший ученик факультета Когтевран: " + otherStudent.getName());
            }
        }
    }
}
