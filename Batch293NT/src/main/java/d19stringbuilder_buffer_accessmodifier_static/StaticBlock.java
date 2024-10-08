package d19stringbuilder_buffer_accessmodifier_static;

public class StaticBlock {

    /*
      “static” blok, bir class’in yüklenmesi sırasında otomatik olarak çalışan ve class’in başlatılmasını
       veya başlangıç ayarlarını yapmayı sağlayan bir özelliktir. Statik blok, yalnızca bir kez çalıştırılır.

        Bu bloklar örneğin, veritabanı (JDBC Java veri tabanı gıbı) bağlantıları için kullanılır.
        Bu, uygulamanın herhangi bir bölümünde veritabanına erişim gerektiğinde bağlantının hızlı
        bir şekilde hazır olmasını sağlar.
      */

    //Bir variable olusturup deger atamazsaniz o variable'i initialize -başlatmak deger atamak _ etmediniz demektir
    static double pi; //global variable

    //-------------------
    static { //static block
        //static bloklar içinde yerel değişkenler tanımlanamaz ama deger atanir

        pi = 3.14;
        System.out.println("Static block 1");
    }
    //-------------------

    public static void main(String[] args) {


        System.out.println(pi);
        System.out.println("main method ici");

    }
}
