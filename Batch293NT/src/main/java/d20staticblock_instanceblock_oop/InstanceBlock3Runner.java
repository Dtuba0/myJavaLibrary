package d20staticblock_instanceblock_oop;

public class InstanceBlock3Runner {
    public static void main(String[] args) {
        InstanceBlock3 car1 = new InstanceBlock3();

        //Araba rengi: Siyah
        //Araba yakit turu: Benzin

        InstanceBlock3 car2 = new InstanceBlock3();

        //Araba rengi: Siyah
        //Araba yakit turu: Benzin


        //Bir veya daha cok object(instance) daha uretsem, o da siyah ve benzin olur
        //Ancak constructor'larla ozellestirilebilir

        InstanceBlock3 car3 = new InstanceBlock3("Kırmızı","Dizel");
        System.out.println("Araba rengi : " + car3.color);//Araba rengi : Kırmızı
        System.out.println("Araba yakıt turu : " + car3.fuelType);//Araba yakıt turu : Dizel

        InstanceBlock3 car4 = new InstanceBlock3();
        //Araba rengi : Siyah
        //Araba yakıt turu : Benzin

    }
}
