package d23oop_collections;

public class AudiRunner {
    public static void main(String[] args) {
       // Engine e = new Engine() ;//HATA , interface'lerden object uretilmez
        AudiA4 a4 =new AudiA4();
        a4.turbo(); //Audi A4 turbo motor kullanir
        a4.esp(); //Audi A4 esp fren sistemi kullanir
        a4.dijital(); //Audi A4 dijital klima kullanir

        a4.run();//Audi A4 hava yastıgı calıstırır
        System.out.println(Engine.fiyat);//300
        System.out.println(AC.fiyat);//200
        System.out.println(Brake.fiyat);//100

        Engine.speed();//Saatte 300km --
        a4.power();//200HP---obje uzerınden ulasılıyor

        AudiS5 s5 = new AudiS5();
        s5.abs();//Audi S5 abs fren sistemi kullanir
        s5.dijital();//Audi S5 dijital klima kullanir
        s5.turbo();//Audi S5 turbo motor kullanir






    }
}
