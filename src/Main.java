import javax.lang.model.element.Name;

public class Main {

    public static void main(String[] args) {
        Student cristian  = new Student("Cristian", " 000562863", 17, 'm'  );
        Student diego = new Student();
        System.out.println(cristian);
        System.out.println(diego);
        System.out.println(cristian.studentId);
        System.out.println(diego.studentId);

        System.out.println("Has cumplido años, si o no ");
        String respuesta = cristian.studentId;

        if (respuesta.equals("Cristian")) {
            cristian.haveBirthday();
            System.out.println(" Feliz cumpleaños " + cristian.studentId + "ahora tienes" + cristian.studentAge);
        }

        cristian.tellInfo();
        cristian.repeatAfter("Haw are you");
        cristian.haveBirthday();

        String cristianEmail = cristian.getEmail();
        System.out.println(cristianEmail);


    }
}
