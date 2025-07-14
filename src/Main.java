public class Main {
    public static void main(String[] args) {

        Person person=new Person();
        person.fullName="Amin Agayev";
        person.age=20;

        person.printInfo();
        person.countVowelsInName();

        person.isNameLongerThan(5);

        Student student=new Student();
        student.studentId=1;
        student.course="riyaziyyat";
        student.studentInfo();

        Instructor instructor=new Instructor();
        instructor.fullName="Elcin Mammadov";
        instructor.age=30;
        instructor.corseName="Riyaziyyat";
        instructor.subjekt="hendese";
        System.out.println(instructor.isCourseNameContains("fizika"));
        System.out.println(instructor.isSubjectStartsWith("hen"));






    }
}
