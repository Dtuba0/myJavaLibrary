package day04;

public class C01_arrays {

    public static void main(String[] args) {
        /*
    1.soru bir array olusturun ve olusturdugunuz arraydeki tum elemanları yazdırın
     */
        //girecegimiz datayi yazalim
        String[] isimler = {"Ali Can", "Muhammet", "Sinan", "Esra", "Kerim", "Tuba"};
        System.out.println(isimler);
        for (String a : isimler
        ) {
            System.out.print(a + " ,");
        }
    }
}
