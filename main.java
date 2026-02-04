public class Main {
    public static void main(String[] args) {
        System.out.println("Student Information");
        System.out.println("-------------------");

        Student student1 = new Student();
        student1.name = "Riri Tempest";
        student1.age = 21;
        student1.course = "BSIT";

        Student student2 = new Student();
        student2.name = "Princess Maggie";
        student2.age = 22;
        student2.course = "BSIT";

        student1.displayInfo();
        student2.displayInfo();
    }
}
