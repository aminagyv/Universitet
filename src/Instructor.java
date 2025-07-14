public class Instructor extends Person {
    String corseName;
    String subjekt;

    public Instructor(String fullName,int age,String corseName,String subjekt){
        this.fullName=fullName;
        this.age=age;
        this.subjekt=subjekt;
        this.corseName=corseName;
    }

    public Instructor() {

    }

    public boolean isCourseNameContains(String yoxlayis){

         return corseName.toLowerCase().contains(yoxlayis.toLowerCase());

    }
    public boolean isSubjectStartsWith(String yoxlayis2){
        return subjekt.toLowerCase().startsWith(yoxlayis2.toLowerCase());
    }

}

