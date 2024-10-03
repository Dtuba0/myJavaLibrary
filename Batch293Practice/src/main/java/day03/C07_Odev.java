package day03;

import java.util.Random;
import java.util.Scanner;

public class C07_Odev {
    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        // Random rnd=new Random();
        // int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur
        // odev!!!kullaniciya 5 tahmin hakkı verin bulursa tebrik edin bulamazsa exit atip tekrar oynamasini isteyin


        //hangi dongu
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        int rndsayi = rnd.nextInt(100);

        int tahminHakki = 5;
        while (tahminHakki > 0) {
            System.out.println("Lütfen tahminde bulunmak icin 1-100 arasında bir sayi giriniz ☺");
            int sayi = input.nextInt();
            if (sayi > 100 || sayi < 0) {
                System.out.println("Lütfen verilen aralıkta bir deger giriniz");
            } else {
                if (rndsayi > sayi) {
                    System.out.println("daha büyük bir sayi giriniz");
                } else if (rndsayi < sayi) {
                    System.out.println("daha küçük bir sayi giriniz");
                } else {
                    System.out.println("Tebrikler, dogru tahmin!");
                    break;
                }
                tahminHakki--;
                System.out.println("Kalan tahmin hakkınız : " + tahminHakki);
                if (tahminHakki == 0) {
                    System.out.println("Tahmin hakkınız bitmiştir eğer dilerseniz 3 tane daha alabilirsiniz almak e almamak icin h tuşuna basınız");
                    String str = input.next();
                    if (str.equals("e")) {
                        tahminHakki += 3;
                    } else {
                        System.out.println("Görüşmek üzere tekrar bekleriz...");
                    }
                }


            }
        }

    }
}

