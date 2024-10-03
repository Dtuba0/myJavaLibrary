package d8stringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {

        /*Ornek 1: Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.

        i)En az 8 karakter olsun
        ii)Space karakteri password'de olmasin
        iii)En az bir tane buyuk harf olsun
        iv)En az bir tane kucuk harf olsun
        v)En az bir tane rakam olsun */

         /*Example 1: Check the password entered by the user according to the following rules.

         i) At least 8 characters
         ii)Space character should not be in password
         iii) At least one capital letter
         iv) At least one lowercase letter
         v)At least one number */


//------------------------------------------


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sıfrenızı giriniz");
        String pwd = input.nextLine();


        // i)En az 8 karakter olsun
        boolean lenghtControl = pwd.length() > 7;
     //   System.out.println("lengthControl = " + lenghtControl);

        //ii)Space karakteri password'de olmasin
        // boolean spaceControl = pwd.replaceAll("[^ ]","").length()==0;  // istemıyorsam 0 a esıtlerız
        // boolean spaceControl = pwd.replaceAll("[^ ]","").isEmpty();//hiçliği kontrol eder
        boolean spaceControl = !pwd.contains(" ");

    //    System.out.println("spaceControl = " + spaceControl);


        //----------------------
        //iv)En az bir tane kucuk harf olsun

        boolean upperCaseControl = pwd.replaceAll("[^A-Z]","").length() > 0 ; // en az bıt tane olsun
     //   System.out.println("upperCaseControl = " + upperCaseControl);

        //iv)En az bir tane kucuk harf olsun

        boolean lowerCaseControl = pwd.replaceAll("^a-z","").length() > 0;
    //    System.out.println("lowerCaseControl = " + lowerCaseControl);

       // v)En az bir tane rakam olsun

        boolean digitControl = pwd.replaceAll("[^0-9]", "").length() > 0;
     //   System.out.println("digitControl = " + digitControl);

        if (!digitControl){
            System.out.println("Şifre en az bir rakam içermelidir");
        }

//ODEV: En az 1 sembol icermeli

        boolean isValid = lenghtControl && spaceControl && upperCaseControl && lowerCaseControl && digitControl;
        if ( isValid){
            System.out.println("şifre gecerlidir");

        }else{
            System.out.println("şifre gecersizdir");
        }

    }
}