public class Person {


    String fullName;
    int age;


    public Person(String fullName, String field, int age) {

        this.fullName = fullName;
        this.age = age;
    }

    public Person() {

    }

    public void printInfo() {
        System.out.println("fullName: " + fullName);
        System.out.println("age: " + age);
    }
    public int countVowelsInName() {
        int sait = 0;
        String saitler = "aoueəiöü";
        fullName=fullName.toLowerCase();
        for (int i=0;i<fullName.length();i++) {
            int addakiSait = fullName.charAt(i);
                for (int a = 0; a < saitler.length(); a++) {
                    if (addakiSait==saitler.charAt(a)){
                        sait++;
                    }
                }
        }
        System.out.println("countVowelsInName:"+sait);
        return sait;
    }

    public void isNameLongerThan(int a){
        if (a>fullName.length()){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }


}



