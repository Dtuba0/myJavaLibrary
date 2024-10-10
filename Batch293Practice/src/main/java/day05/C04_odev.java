package day05;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C04_odev {
    public static void main(String[] args) {
         /*
        icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olusturun
        kullanicidan bir sayi isteyip
        listede var olup olmadigini kullaniciya yazin
        */
        Random rnd=new Random();
        int sayi=0;
        List<Integer>mylist=new ArrayList<>();

        for (int i = 0; i <200 ; i++) {//totalde 200 tane dön
            sayi=rnd.nextInt(1000);
            if (!mylist.contains(sayi)){
                mylist.add(sayi);
            }

        }

        System.out.println(mylist.size());

        while (mylist.size()<400){//200 tane
            sayi=rnd.nextInt(1000);
            if (!mylist.contains(sayi)){
                mylist.add(sayi);
            }
        }
        System.out.println(mylist.size());

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen listede var olup olmadıgını kontrol etmek istediginiz sayiyi giriniz");
        sayi= input.nextInt();
        if (mylist.contains(sayi)){
            System.out.println("Evet aramış oldugunuz sayi listede bulunmaktadir");
            System.out.println(mylist.indexOf(sayi));
        }else {
            System.out.println("Hayır aramış oldugunuz sayi listede bulunmamaktadir");
        }
    }
}
