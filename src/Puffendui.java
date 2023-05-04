import javax.print.attribute.standard.PrinterInfo;

public class Puffendui extends Hogwards{
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Puffendui(String name, int magic, int transgression, int industriousness, int loyalty, int honesty) {
        super(name, magic, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void printInfo() {
        System.out.println("==" + super.getName() + "==");
        super.printInfo();
        System.out.println("Трудолюбие: " + industriousness + "\n" +
                "Верность: " + loyalty + "\n" +
                "Честность: " + honesty);
    }

    public void bestStudent(Puffendui otherStudent) {
        int studentOnePoints = this.getMagic() + this.getTransgression() + this.industriousness + this.loyalty +
                this.honesty;
        int studentTwoPoints = otherStudent.getMagic() + otherStudent.getTransgression() +
                otherStudent.industriousness + otherStudent.loyalty + otherStudent.honesty;

        if(studentOnePoints == studentTwoPoints) {
            System.out.println("У студентов одинаковое количество баллов");
        } else {
            if (studentOnePoints > studentTwoPoints) {
                System.out.println("Лучший ученик факультета Пуффендуй: " + this.getName());
            } else {
                System.out.println("Лучший ученик факультета Пуффендуй: " + otherStudent.getName());
            }
        }
    }
}
