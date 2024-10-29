package d31lambda;

import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {
        //Ornek: Rastgele sayi ureten bir method olusturunuz.
        //Example: Create a method that generates random numbers.

        Supplier<Double>randomSupplier = ()-> Math.random();
        System.out.println("Random number : " + randomSupplier.get());// 0.8305570761797179
        //0-1 arası kendılıgınden sayılar urettı () bır deger almadan sayılar urettı

        Supplier <Integer>contantNumber = ()-> 421124556;
        System.out.println(contantNumber.get());



    }
}
