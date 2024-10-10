package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class my {
    public static void main(String[] args) {

//        int sayi[] = {1, 4, 7, 3, 2, 8, 6, 4, 9, 4, 2, 3, 5, 1, 99, 123, 632, 213, 543, 4332, 43, 56, 7, 54, 657};
//
//        System.out.println(Arrays.toString(sayi));
//        int [] yeni = new int [sayi.length];
//
//
//        for (int i = 0; i < sayi.length; i++) {
//            for (int j = i+1; j < yeni.length; j++) {
//              if(sayi[i]>sayi[j]) {
//
//                  int temp = sayi[i];
//                  sayi[i] = sayi[j];
//                  sayi [j] = temp;
//              }
//
//            }
//        }        System.out.println(Arrays.toString(sayi));



        /*
          icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olusturun
          kullanicidan bir sayi isteyip
          listede var olup olmadigini kullaniciya yazin
         */
//
//        ArrayList<Integer> sayilar = new ArrayList<>();
//        Scanner input = new Scanner(System.in);
//        Random rndm = new Random();
//
//        int i=0;
//       while (true
//       ){
//           int sayi = rndm.nextInt(1000);
//           if (!sayilar.contains(sayi)){
//               sayilar.add(sayi);
//           }
//           if (sayilar.size()==200){
//             break;
//           }
//           i++;
//       }sayilar.sort(null);//dogal olarak sıralama yapar
//        System.out.println(sayilar);
//        System.out.println("Lutfen 1-1000 ile bir sayı giriniz ");
//        int kullanıcı = input.nextInt();
//        for (int w : sayilar
//        ){
//            if (kullanıcı == w
//            ){
//                System.out.println("sayı arrayda yer almaktadır ");
//            }
//        }

        /*
          Asagidaki multi dimensional array'in
          ic array'lerindeki tum elemanlarin toplamini birer birer bulan
          ve herbir sonucu yeni bir array'in elemani yapan
          ve yeni array'i ekrana yazdiran bir program yaziniz
          Ornek; {{1,2,3}, {4,5}, {6, 7} } ==> 1 + 2 + 3 = 6 4+5=9 6+7=13 ==> output: (6, 9, 13)
          */


//        int [][] sayılar = new int[][] {{1,2,3}, {4,5}, {6, 7} };
//        int [] yeni = new int [sayılar.length];
//        int index = 0;
//        for (int [] w : sayılar ){
//           int sum = 0;
//            for (int i = 0; i <w.length; i++) {
//                sum = sum + w[i];
//
//
//            }yeni[index]=sum;
//            index++;
//        }
//        System.out.println(Arrays.toString(yeni));
//
//        for ( int w : sumArray){
//            System.out.print(w + " , ");
//
//        }

        int[][] arr = {{1, 2, 3}, {4, 5}, {6, 7}};


        int[] sumArray = new int[arr.length];


        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            sumArray[i] = sum;
        }


        System.out.print("Output: ");
        for (int i = 0; i < sumArray.length; i++) {
            System.out.print(sumArray[i]);
            if (i < sumArray.length - 1) {
                System.out.print(", ");
            }
        }













    }
}
