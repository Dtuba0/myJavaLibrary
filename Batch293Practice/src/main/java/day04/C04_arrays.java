package day04;

public class C04_arrays {
    public static void main(String[] args) {
        /*
           4.soru Verilen bir int array'deki
           en buyuk sayiyi yazdiran bir method olusturun.
         */

        int sayi[] = {1, 4, 7, 3, 2, 8, 6, 4, 9, 4, 2, 3, 5, 1, 99, 123, 632, 213, 543, 4332, 43, 56, 7, 54, 657};
        maxSayiYazdir(sayi);

    }
    public static void maxSayiYazdir(int []sayi){
        int max = sayi[0];
        for (int a : sayi
        ){
         if (a>max) {
             max=a;
         }
        }
        System.out.println("Max sayi :" +max );
    }



}
