package d27exceptions;

public class E03 {
    public static void main(String[] args) {

        //3) StringIndexOutOfBoundsException, bir String nesnesinin, karakter dizisindeki
        // geçersiz bir indekse erişmeye çalışıldığında ortaya çıkan bir istisna türüdür.

        String s = "Java";
        //selectChar(s, 2); //v
        selectChar(s, 5);

    } //main disi

    public static void selectChar(String s, int idx) {

        try {
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("olmayan index kullanmayiniz : " + e.getMessage()); //serr yaparak yaptık
            //olmayan index kullanmayiniz : String index out of range: 4
            e.printStackTrace(); //kod yazan hatayi gormek isterse yazar, exception'i gosterir ama firlatmaz
            //developer ayrıntıları gormek ıcın kullanır exception'i gormek istersek kullaniriz
        }

       System.out.println("App calisiyor");

    }
}
