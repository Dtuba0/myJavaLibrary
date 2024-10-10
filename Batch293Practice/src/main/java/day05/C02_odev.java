package day05;

public class C02_odev {
    public static void main(String[] args) {
        /*
         6.Soru -Verilen String bir array'de en uzun
         ve en kisa String'leri yazdıran bir method olusturun
        */
        String isimler[]={"veli","ali","furkan","hasan","huseyin"};
        enUzunVeEnKısa(isimler);

    }
    public static void enUzunVeEnKısa(String[]isimler){
        String min = isimler[0];
        String max = isimler[0];

        for (String w:isimler){
            if(min.length()>w.length()){
                    min=w;
        }
            if (max.length()<w.length()){
                max=w;
            }
        }

        System.out.println("Arraydeki en uzun kelime : "+max);
        System.out.println("Arraydeki en kısa kelime : "+min);
    }

}
