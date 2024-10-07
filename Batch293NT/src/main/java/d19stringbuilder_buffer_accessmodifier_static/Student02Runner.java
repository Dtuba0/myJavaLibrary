package d19stringbuilder_buffer_accessmodifier_static;

public class Student02Runner {
    public static void main(String[] args) {

        System.out.println("Student2.stdName = " + Student02.stdName); //Student2.stdName = Ali Can
        //satatıc class memberlara ulaşmak ıcın sadece class ısmı yeterlidir

        Student02 ali = new Student02();
        System.out.println("ali.age = " + ali.age); //ali.age = 18//age non statıc oldugu ıcın ona ulaşmak
        // için object olusturmak zorundayız

        Student02.staticMethod(); //Ben static bir methodum  class uzerınden ulatık
        ali.nonStaticMethod(); //Ben non-static bir methodum olusturdugumuz obje uzerınden ulaştık

    }
}
