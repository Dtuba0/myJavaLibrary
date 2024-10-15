package d22oop;

public class Dog extends Mammal {
    public void bark (){
        System.out.println("Dogs bark....");
    }
    @Override //Anotatıon --not demek--
    public  void eat (){
        System.out.println("Dogs eat....");
    }


    //Herkes Cat class'ta feedWithMilk() methodunu override etsin?

    @Override
    public Animal create () {
        return new Dog();//Upcastıng pareentın yukarının  kalıbına doktuk
                         //cocuk babanın data tıpını kullanabılır
                           //downcastıng ıslemını java otomatık yapmaz
                           //daraltmalari java oto yapmaz
    }
    @Override
    public int add (int a , int b ){
        //primitevler arasında parent - chıld ilişkisi yoktur
        //yanı primitevlerde return type degıstırılemez
        return a + b ;
    }


    @Override
    public Integer multiply(Integer a, Integer b) {
        return a * b ;
    }




}
