public class Griffindor extends Hogwards {
    private int nobolity;
    private int honor;
    private int bravery;

    public Griffindor(String name, int magic, int transgression, int nobolity, int honor, int bravery) {
        super(name, magic, transgression);
        this.nobolity = nobolity;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void printInfo() {
        System.out.println("==" + super.getName() + "==");
        super.printInfo();
        System.out.println("Благородство: " + nobolity + "\n" +
                "Честь: " + honor + "\n" +
                "Храборость: " + bravery);
    }

    public void bestStudent(Griffindor otherStudent) {
        int studentOnePoints = this.getMagic() + this.getTransgression() + this.nobolity + this.honor + this.bravery;
        int studentTwoPoints = otherStudent.getMagic() + otherStudent.getTransgression() + otherStudent.nobolity +
                otherStudent.honor + otherStudent.bravery;

        if(studentOnePoints == studentTwoPoints) {
            System.out.println("У студентов одинаковое количество баллов");
        } else {
            if (studentOnePoints > studentTwoPoints) {
                System.out.println("Лучший ученик факультета Гриффиндор: " + this.getName());
            } else {
                System.out.println("Лучший ученик факультета Гриффиндор: " + otherStudent.getName());
            }
        }
    }
}
