package day05;

import java.util.Arrays;

public class C05_odev {
    public static void main(String[] args) {
        // Integer[]array1={1,3,5,7,9,11,13};
        // String[] array2={"ali","veli","huseyin","can","omer"};
        // Double[] array3={1.0,2.4,6.5,8.7,5.6,4.3,7.8,9.8};

        // Object [][] arrays={array1,array2,array3};

        // System.out.println(Arrays.deepToString(arrays));

        /*
         Asagidaki multi dimensional array'in
         ic array'lerindeki tum elemanlarin toplamini birer birer bulan
         ve herbir sonucu yeni bir array'in elemani yapan
         ve yeni array'i ekrana yazdiran bir program yaziniz
         Ornek; {{1,2,3}, {4,5}, {6, 7} } ==> 1 + 2 + 3 = 6 4+5=9 6+7=13 ==> output: (6, 9, 13)
         */
        int [][]arrays={{1,2,3}, {4,5}, {6, 7} };
        int []yeniArray=new int[arrays.length];
        int toplam=0;
        for (int i = 0; i <arrays.length ; i++) {

            for (int a:arrays[i]) {
                toplam+=a;
            }
            yeniArray[i]=toplam;
            toplam=0;
        }
        System.out.println(Arrays.toString(yeniArray));


    }
}



