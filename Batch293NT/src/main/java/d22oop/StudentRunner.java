package d22oop;

public class StudentRunner {
    public static void main(String[] args) {

        Student s = new Student();
        System.out.println(s.name);//Ali Can

        System.out.println(s.getAge());//13
        System.out.println(s.isSuccessful());//true

        s.setAge(25);//set ıle degıstır
        System.out.println(s.getAge());//get ıle oku 25 oldu

        s.setSuccessful(false);
        System.out.println(s.isSuccessful());




    }
}
