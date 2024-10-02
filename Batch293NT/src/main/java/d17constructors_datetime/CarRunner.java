package d17constructors_datetime;



public class CarRunner {
    public static void main(String[] args) {

        //4- Car class'indan bir object uretelim

        //9- Default Car() icine parametre girelim

        Car c1 = new Car("Audi", "Q3", 2025, false);
        System.out.println(c1.brand); //Audi //Audi
        System.out.println(c1.model); //A3 Allstreet  //Q3
        System.out.println(c1.year); //2024//2025
        System.out.println(c1.hybrid); //true//false

        c1.action(); //Audi hizli hareket eder
        c1.stop(); //Audi guvenli bir sekilde durur

        //5- Car class'a donup, constructor olusturalim

         //10- Baska bir object uretelim ve direkt objeyi yazdiralim

        Car c2 = new Car ("Audi","A4",2023,false);
        System.out.println(c1);//referance alındı  d17constructors_datetime.Car@2d98a335
        System.out.println(c2);//referance alındı   d17constructors_datetime.Car@16b98e56

        //11- Reference durumunu duzeltmek icin Car class’a tostring methodu ekleyelim
        //Java’da toString metodu genellikle bir nesnenin içeriğini okunabilir bir String olarak döndürmek için kullanılır.


        //16- Yeni bir object uretelim - SON
        Car c3 = new Car("Tofaş","Şahin");
        System.out.println(c3);//Car{brand='Tofaş', model='Şahin', year=2024, hybrid=true}



























    }//main dışı
}