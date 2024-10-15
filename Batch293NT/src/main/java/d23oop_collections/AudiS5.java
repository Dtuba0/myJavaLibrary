package d23oop_collections;

public class AudiS5 {

    public void eco(){
        System.out.println("Audi S5 ekonomik motor kullanir");
    }

    public void turbo(){
        System.out.println("Audi S5 turbo motor kullanir");
    }

    public void gas(){
        System.out.println("Audi S5 benzinli motor kullanir");
    }

    //-----------------------------------------------
    //AC interface’inden override edilenler
    public void analog(){
        System.out.println("Audi S5 analog klima kullanir");
    }
    public void dijital(){
        System.out.println("Audi S5 dijital klima kullanir");
    }

    //---------------------------------------
    //Brake interface'inden override edilenler


    public void abs(){
        System.out.println("Audi S5 abs fren sistemi kullanir");
    }
    public void esp(){
        System.out.println("Audi S5 esp fren sistemi kullanir");
    }
}