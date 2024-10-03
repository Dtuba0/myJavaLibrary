package day02;
import java.util.Scanner;

public class C01_switch {
    public static void main(String[] args) {
        //Toplama, Çıkarma, Çarpma, Bölme , kalan Hesaplama ve us alma
        // 2 sayi işlem yapan basit bir Hesap Makinesi oluşturun:

        //1. adım
        Scanner input=new Scanner(System.in);


        //2.adım normal koşullarda kullanıcıya bilgi verirdik
        System.out.println("Lütfen işlem yapmak istediğiniz operatoru giriniz :" +
                " \ntoplama icin : +" +
                "\ncıkarma icin : -" +
                "\ncarpma icin : *" +
                "\nbolme icin : /" +
                "\nus almak icin : ^" +
                "\nkalan hesaplama icin : %" +
                "\nfaktoriyel hesabı icin !");

        //3.adım uygun bir variable'a atamak

        char operator=input.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println("Lütfen toplamak istediginiz sayilari sırasıyla giriniz : ");
                System.out.println("sayıların toplamı : "+(input.nextDouble()+ input.nextDouble()));
                break;
            case '-':
                System.out.println("Lütfen cıkarmak istediginiz sayilari sırasıyla giriniz : ");
                System.out.println("sayıların farkı : "+(input.nextDouble()- input.nextDouble()));
                break;
            case '*':
                System.out.println("Lütfen carpmak istediginiz sayilari sırasıyla giriniz : ");
                System.out.println("sayıların carpımı : "+input.nextDouble()* input.nextDouble());
                break;
            case '/':
                System.out.println("Lütfen bolmek istediginiz sayilari sırasıyla giriniz : ");
                double sayi1= input.nextDouble();
                double sayi2= input.nextDouble();
                if (sayi2==0){
                    System.out.println("Payda 0 OLAMAZ!!!");
                }else {
                    System.out.println("sayıların bolumu : "+sayi1/ sayi2);//payda'nın 0 olma durumunu kontrol ediniz
                }
                break;
            case '%':
                System.out.println("Lütfen modunu almak istediginiz sayilari sırasıyla giriniz : ");
                System.out.println("sayıların modu : "+input.nextDouble()% input.nextDouble());//payda'nın 0 olma durumunu kontrol ediniz
                break;
            case '^':
                System.out.println("Lütfen birbirinin kuvvetini almak istediginiz sayilari sirasiyla giriniz : ");
                // System.out.println("sayilar kuvvet durumu : "+Math.pow(input.nextDouble(), input.nextDouble()));//sayi*sayi karesini alırız//aynısını for ile yapabilirsiniz bu odev!!!!!
                sayi1=input.nextDouble();
                sayi2=input.nextDouble();
                double sonuc=sayi1;
                for (int i = 1; i <sayi2 ; i++) {
                    sonuc*=sayi1;//sonuc = sonuc * 7;
                    System.out.println("sonuc : "+sonuc);
                }
                break;
            case '!':
                System.out.println("Lütfen 10'dan kucuk bir tam sayi giriniz");
                byte sayi= input.nextByte();
                if (sayi<10&&sayi>0){
                    int bosInt=1;
                    for (int i = 1; i <=sayi ; i++) {
                        bosInt*=i;//bosInt=bosInt * i;
                    }
                    System.out.println(sayi+"! = "+bosInt);
                }else {
                    System.out.println("Lütfen gecerli bir deger giriniz!!!");
                }
                break;
            default:
                System.out.println("Lütfen gecerli bir operator giriniz ☺");
                break;

        }


        System.out.println("Bizi tercih ettiginiz icin tesekkürler ☻");

    }
}
