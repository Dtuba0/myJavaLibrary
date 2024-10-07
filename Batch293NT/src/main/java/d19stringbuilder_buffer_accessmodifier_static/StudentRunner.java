package d19stringbuilder_buffer_accessmodifier_static;

public class StudentRunner {
    public static void main(String[] args) {

        //Student Class'tan bir instance -obje- olusturalim
        Student ali = new Student();

        // System.out.println(ali.stdName); //Ali Can
      //  System.out.println(ali.email); //alican@gmail.com
      //  System.out.println(ali.address); //Istanbul
        //tcKimlik'e baska class'tan ulasilmaz cunku private



        System.out.println("ali.stdName = " + ali.stdName); //ali.stdName = Ali Can
        System.out.println("ali.email = " + ali.email); //ali.email = alican@gmail.com
        System.out.println("ali.address = " + ali.address);//ali.address = Istanbul

        System.out.println(ali);  // burada tostrıng kullandık prıvate olan tckımlıgı de acıga cıkardık verı
        // sızıntısı olmus oldu

    }
}
