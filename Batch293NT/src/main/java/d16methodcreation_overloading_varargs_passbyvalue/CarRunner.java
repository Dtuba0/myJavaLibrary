package d16methodcreation_overloading_varargs_passbyvalue;

public class CarRunner {
    public static void main(String[] args) {
        //4- Car class’indan bir object uretelim

        Car c1 = new Car();
        System.out.println(c1.brand);//Audi
        System.out.println(c1.model);//A3 Allstreet
        System.out.println(c1.year);//2024
        System.out.println(c1.hybrid);//true

        c1.action();//Audi hizli hareket eder
        c1.stop();//Audi guvenli bir sekilde durur

        //5- Car class’a donup, constructor olusturalim















    }
}
