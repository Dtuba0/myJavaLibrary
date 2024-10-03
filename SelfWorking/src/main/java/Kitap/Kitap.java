package Kitap;

public class Kitap {
    //1-variable'lar olusturalim (pasif ozellikler)
    //2-method'lar olusturalim (aktif ozellikler)
    //3-CarRunner yani main'li class'i olusturalim
    //6-Constructor nedir?
    //7-Constructor nasil olusturulur?
    // Access Modifier + Class ismi + () + {}
    //8-Parametreli constructor’i olusturdugumuzda Java default olani sildi, CarRunner’dakiler o yuzden
    //hataya dustu. Duzeltmek icin CarRunner’a gidelim
    //12- toString uretelim
    //13- CarRunner’a gidip tekrar Run edelim
    //14- Farkli parametreli constructor olusturalim
    //15- CarRunner’a gidip bu constructor’lari kullanalim


    String tur;
    String ders;
    int soruSayisi;
    int fiyat;

    public void kacGun ()
    {
        if (soruSayisi%100==0) {
            System.out.println("Gunde 100 soru cozersen " + soruSayisi / 100 + " gunde bitirebilirsin.");
        }else {
            System.out.println("Gunde 100 soru cozersen " + (soruSayisi / 100 +1) + " gunde bitirebilirsin.\n" +
                    " sadece son gün "+ (soruSayisi%100)+ " soru çözersin");
        }
    }


    public Kitap(String tur, String ders, int soruSayisi, int fiyat)
    {
        this.tur = tur;
        this.ders = ders;
        this.soruSayisi = soruSayisi;
        this.fiyat = fiyat;
    }


    public Kitap(String ders, int soruSayisi)
    {
        this.ders = ders;
        this.soruSayisi = soruSayisi;
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "tur='" + tur + '\'' +
                ", ders='" + ders + '\'' +
                ", soruSayisi=" + soruSayisi +
                ", fiyat=" + fiyat +
                '}';
    }

}
