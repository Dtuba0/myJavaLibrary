package day03;

public class C04_ForLoop {
    public static void main(String[] args) {

         /*
        * * * * .
        * * * . .
        * * . . .
        * . . . .
        . . . . .
        */

        int satir=10;
        for (int bulunSatir = 1; bulunSatir <=satir ; bulunSatir++) {
            for (int yildizSayisi = satir-bulunSatir; yildizSayisi >0 ; yildizSayisi--) {
                System.out.print("* ");
            }
            for (int nokta = 1; nokta <=bulunSatir ; nokta++) {
                System.out.print(". ");
            }
            System.out.println();
        }


        /*
                     *
                    * *
                   *****
                  *     *
                 *       *
         */

        int satır = 5;

        for (int bulsatır  = 1; bulsatır  <=satır; bulsatır ++) {
            for (int bosluk = satır - bulsatır; bosluk >=1; bosluk--) {
                System.out.print(" ");
            }
            for (int yıldız = 1; yıldız <= bulsatır*2-1 ; yıldız++) {
               if (yıldız == 1||yıldız == bulsatır*2-1||bulsatır==satır/2+1){
                   System.out.print("*");
               }else {
                   System.out.print(" ");
               }

            }
            System.out.println();
        }


    }
}
