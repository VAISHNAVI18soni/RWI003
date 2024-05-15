package Java8;

public class Student {

    public static void main(String[] args) {
        // This should be your test or driver code, not within the Student class
        Student student = new Student(1, "John");
        System.out.println(student);
    }

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name; // Corrected assignment operator
    }

    @Override
    public String toString() {
        return this.id + ":" + this.name;
    }
}
