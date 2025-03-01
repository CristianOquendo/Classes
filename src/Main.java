import javax.lang.model.element.Name;

public class Main {

    public static void main(String[] args) {
        Student Cristian  = new Student("Cristian", "000562863", 17, 'm'  );
        Student Diego = new Student();
        System.out.println(Cristian);
        System.out.println(Diego);
        System.out.println(Cristian.studentId);
        System.out.println(Diego.studentId);
    }
}
