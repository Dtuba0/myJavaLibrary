package Socrative;

public class loops {

    public static void main(String[] args) {

/*

    int j = 1;



while(j<=10){



        System.out.println(j);

        j++;

    }

*/
/*

//Asagidakilerden hangisi soruyla ayni ciktiyi verir?

    int j = 1;


while (j < 10) { //9 kadar yazdırır



        System.out.println(j);

        j++;



    }
*/
        //-------------------------
/*
    int j = 10;



while (j >= 1) {



        System.out.println(j);

        j++;//++ oldugu için sonsuz dongu olustu j>= kosulunu sagladıgı için -- olsaydı 10 dan gerıye ol



    }
*/
        /*

    int j = 1;



while(j<11){



        System.out.println(j);

        j++;



    }
*/

 /*
    int j = 10;



while(j>=1){



        System.out.println(j);

        j--;



    }
*/
        /*

    String s = "Apex";

    String result = "";



for (int i = s.length() - 1; i >= 0; i--) {

        result = result + s.charAt(i);

    }



System.out.println(result);

*/
/*
//Cikti asagidakilerden hangisidir?

    Ape
    Apex
            xepA//N
    epA
*/
/*
    int y = 1;



for (int i = 0; i < 4; i++) {

        y = y + i;//1+0--1+1--2+2--4+3

    }

System.out.println(y);
*/
/*
//Cikti asagidakilerden hangisidir?

8
6
5
7//N
*/
/*
    String result = "";


//1-2-3
for (int i = 1; i < 4; i++) {



        for (int j = (5 - i); j > 1; j--) { //

            result = result + (i + j);//543

        }



        System.out.println(result);

        result = "";

    }
*/
/*
//Cikti asagidakilerden hangisidir?

    5
    4
    3
            432
            43
            4

    4
    3
    2

    543
    54
    5//N

    */
/*
    int i = 1;

    int product = 1;

while (i <= 4) {


//1*1=1----2*1=2-------3*2=6-------4*6=24  i=5 oldugunda dongudewn cıktı
        product = product * i;

        i++;

        System.out.println(product);

    }
*/
/*
//Cikti asagidakilerden hangisidir?

    24
    6

    1
    2
    6
    24//N

    2
    6
    24

    1
    2
    6
*/
/*
    String s = "Marra";



for (int i = s.length() - 1; i >= 0; i--) {//arraM



        String c = s.substring(i, i + 1);



        if (s.indexOf(c) == s.lastIndexOf(c)) {//harf tekrarı yapıldımı kontrolu

            System.out.println(c);//M

        }

    }

*/
/*
//Cikti asagidakilerden hangisidir?

    arra
    M//N
    ar
    Mar
*/
/*
    int m = 10;

    int n = 2;

    int sum = 0;


    while(m>n){



        m--;//9

        n = n + 2;//2+2=4

        sum = sum + m + n;//0+9+4=13
                           //13+8+6=27
                            //27+7+8=42  m>n degerını saglayana kadar whıle dongusunu yaptık



    }


    System.out.println(sum);
*/
    /*

//Cikti asagidakilerden hangisidir?

46
44
42//N
40
*/
/*
    int num = 0;//0/2----2/4----4/6-------8


do {//kontrol etmeden işleme alır bu sebepten bır sefer calıstırır daha sonrasında kontrolu saglar

        if (num % 2 == 0) {

            num += 2;              // num = num + 2 demektir

        }



    } while (num < 7);



System.out.println(num);
*/
/*
//Cikti asagidakilerden hangisidir?

6
4
10
8//N
*/
        /*

    int i = 758;

    int s = 0;



do {

        s = s + i % 10; //758/10=8==s    //75/10=5  8+5=13==s     // 7/10=7  13+7=20

        i = i / 10;//758/10=75==i      //75/10=7==i               //7/10=0.7  dongu kırıldı


    } while (i!= 0);



System.out.println(s);
*/

/*
//Cikti asagidakilerden hangisidir?


20//N
13
8
15
*/
        /*

        for(int j=10; j>0; j++){qqq

        System.out.println("Hello");

    }
    */

/*
//Hello console'a kac kez yazilir?

10
0
11
SONSUZ DONGUYE GIRER
*/

    }
}

