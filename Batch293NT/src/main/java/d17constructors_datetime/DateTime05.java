package d17constructors_datetime;

import java.time.LocalDate;
import java.time.Period;

public class DateTime05 {
    public static void main(String[] args) {

        //ornek 2: Verilen iki tarih arasindaki farki hesaplayan kodu yaziniz.
        //example 2: Write the code that calculates the difference between two given dates

        //Java'da Period class'i, tarihler arasındaki yıl, ay ve gün farklarını temsil etmek için kullanılır.
        // Bu sınıf, iki LocalDate nesnesi arasındaki zaman farkını ifade eder ve java.time paketi içinde yer alır.
        // Period sınıfı, tarihler arasındaki farkları kolayca yönetmek ve manipüle etmek için çeşitli metodlar sağlar.

        //Kullanım Alanları
        //Period sınıfı, özellikle tarihler arasındaki uzun süreli farkları hesaplamak, tarihleri manipüle etmek
        // veya tarihler arası geçiş sürelerini yönetmek için kullanışlıdır. Finans, sağlık, eğitim gibi alanlarda
        // ve tarih ile ilgili işlemlerin sık yapıldığı her türlü yazılım geliştirme projelerinde etkili bir araçtır.

        //Period.between() metodu, iki tarih arasındaki farkı hesaplamak için kullanılır.
        // Bu metod, başlangıç ve bitiş tarihleri arasındaki tam yıl, ay ve gün farkını bir Period nesnesi olarak döndürür.

        LocalDate date1 = LocalDate.of(1999,5,3);
        LocalDate date2 = LocalDate.of(2024,10,2);

         Period difference = Period.between(date1,date2);
         System.out.println(difference);//P-25Y-4M-30D 25 yıl 4 ay 30 gün

        //Ayrı ayrı gorelım
        int yearDiffrerence = difference.getYears();
        int monthDiffrerence = difference.getMonths();
        int dayDiffrerence = difference.getDays();

        System.out.println(date1 + " ve " + date2 + " arasındaki fark :"); //alınan ıkı yıl arasındakı farkı verır
        System.out.println("Yil : " + yearDiffrerence); //Yil : 25
        System.out.println("Ay: " + monthDiffrerence); //Ay: 4
        System.out.println("Gun : " + dayDiffrerence); //Gun : 30









    }
}
