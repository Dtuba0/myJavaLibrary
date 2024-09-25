package d11loops;

import java.util.Scanner;

public class ForLoops04 {
    public static void main(String[] args) {

        /* Ornek 2:  Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz.
            Example 2:  Create the code that prints the following figure to the console.

             X X X X X
             X X X X X
             X X X X X    */

        Scanner input = new Scanner(System.in);
        System.out.println("Sutun sayısını gırınız ");
        int row = input.nextInt();

        System.out.println("Sutun sayısını gırınız ");
        int column = input.nextInt();

        for (int i = 1 ; i <= row ; i++) {
            for (int k =1 ; k <= column;k++){
                System.out.print("X ");
            }
            System.out.println();//print yanyana yazar pointerı bır alta aldık

        }
        System.out.println("--------------------------");
        //ÖDEV

           /*Odev : Asagidaki sekli for-loop kullanarak çizdiriniz. ( SATIR 4 SUTUN DEGISKEN  1. SATIR 1 SUTUN  2 SATIR 2 SUTUN
           3 SATIR 3 SUTUN

           Homework: Draw the following figure using for-loop.

	       *
	       * *
	       * * *
	       * * * *

*/

        System.out.println("----------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen sayısal değeri giriniz: ");
        int r = scanner.nextInt();
        for (int i = 1; i <=r ; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }







    }
}
