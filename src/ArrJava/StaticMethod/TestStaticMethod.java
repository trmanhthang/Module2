package ArrJava.StaticMethod;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student st1 = new Student(1, "Thắng");
        Student st2 = new Student(2, "Thắng 2");

        st1.display();
        st2.display();
    }
}
