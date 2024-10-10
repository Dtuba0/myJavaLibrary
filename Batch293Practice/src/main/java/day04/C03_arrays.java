package day04;

import java.util.Arrays;

public class C03_arrays {
    public static void main(String[] args) {

         /*
        3.soru Verilen array
        in tum elemanlarini bir soldaki konuma tasiyacak
        bir program yazin. Ornek; array ((1,2,3,4,5)) ise output (2, 3,4,5, 1) olacak
        */
        int array[] = {1, 2, 3, 4, 5};
        //1.yol
        //int arr[] = {2, 3, 4, 5, 1};//--HARDCODİNG
        //2.yol dınamık
        int temp = array[0];
        System.out.println(Arrays.toString(array));
        //ne zaman for ne zaman foreach dongusu kullanıcaz?         indexlerle
        // işimiz varsa for dongusu yoksa foreach birde eleman sayisi degisiyor daima for dongusu kulllanılır

        for (int i = 0; i < array.length-1 ; i++) {
            array[i]=array[i+1];
            System.out.println(Arrays.toString(array));
        }
        array[array.length-1]=temp;
        System.out.println(Arrays.toString(array));

    }
}
