package day05;

import java.util.Scanner;

public class C03_odev {
    public static void main(String[] args) {
        /*
        7.soru -Verilen bir array'in istenen bir elemani icerip icermedigini kontrol edip, bize
        true veya false sonucu donen bir method olusturun
         */
        //contains methodu olusturun
        String isimler[]={"furkan","veli","huseyin","hakan","ali","ece","isa","cem","ibrahim"};
        System.out.println(containsElement(isimler));

    }

    public static boolean containsElement(String[] isimler) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen kontrol etmek istediginiz kelimeyi giriniz");
        String arananIsim=input.nextLine();
        for (String w:isimler) {
            if (w.equalsIgnoreCase(arananIsim)) {
                return true;
            }
        }
        return false;
    }
}
