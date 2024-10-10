package day05;

public class C06_mda {
    public static void main(String[] args) {
         /*
        Verilen bir multi dimensional array'in
        her array'ini ayri ayri ele alarak inner indexindeki elamanlarinin ortalamasından
        büyük elemanlari yazdıran bir kod yazınız.
         */
        int sayilar[][]={{8,57,37},{99,88,11},{32,34,15,12},{2,3,5,1}};
        double toplam=0;
        double ort=0;
        for (int []a:sayilar
        ) {
            for (int w:a) {//toplamı bulabilmek icin
                toplam+=w;
            }
            ort=toplam/a.length;
            System.out.println("Bu Arraydeki ort : "+ort);
            for (int w:a) {//kontrol
                if (ort<w){
                    System.out.println(w+" Bu sayi ortalamadan büyüktür");
                }
            }

            ort=0;
            toplam=0;
            System.out.println("Sıradaki array'e gecis yapılmıstır");
        }


    }
}
