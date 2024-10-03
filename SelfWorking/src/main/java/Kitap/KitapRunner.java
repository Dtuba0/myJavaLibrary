package Kitap;

public class KitapRunner {
    //4- Car class'indan bir object uretelim
    //5- Car class'a donup, constructor olusturalim
    //9- Default Car() icine parametre girelim
    //10- Baska bir object uretelim ve direkt objeyi yazdiralim
    //11- Reference durumunu duzeltmek icin Car class’a tostring methodu ekleyelim
    //Java’da toString metodu genellikle bir nesnenin içeriğini okunabilir bir String olarak döndürmek için kullanılır.
    //16- Yeni bir object uretelim
    public static void main(String[] args)
    {
        Kitap k1 = new Kitap("soru bankası", "matematik", 1200, 350);
        System.out.println(k1.ders);
        System.out.println(k1.soruSayisi);

        Kitap k2 =new Kitap("etkinlik", "türkçe" , 775, 300);
        System.out.println(k2);

        Kitap k3 = new Kitap("fen",800);
        System.out.println(k3);

        k2.kacGun();
        System.out.println();





    }
}
