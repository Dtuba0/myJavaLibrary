package d26maps_exceptions;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.HashMap;

public class Maps03 {
    public static void main(String[] args) {
        //meşhur bir interview sorusu
        //ornek 1: Size verilen bir String'deki her kelimenin, o String'de kac defa kullanildigini
        //gosteren kodu yaziniz.(Case insensitive (Büyük/küçük harfe duyarsız olsun)
        //example 1: Given a String, count the number of times each word is used in that String
        // write the code that displays.(Case insensitive)


        String s = "Ali nasilsin Ali.";
        s = s.replaceAll("\\p{Punct}", "").toLowerCase();
        System.out.println(s); //ali nasilsin ali

        String[] words = s.split(" ");
        //System.out.println(words);//[Ljava.lang.String;@378bf509 referance yazdırdı arraylar dogrudan yazdırılmaz
        System.out.println(Arrays.toString(words));//[ali, nasilsin, ali] arraylar tostrıng methodu ıle cagrılır

        HashMap<String, Integer> myMap = new HashMap<>();
        System.out.println(myMap); //{}

        for (String w : words) {
            Integer isThere = myMap.get(w);//ilk dongude w'nun ıcınde ali var . map'te ali olmadıgından null gelıcek

            if (isThere == null) {
                myMap.put(w, 1);
            } else {
                myMap.put(w, isThere + 1);

            }
        }
        System.out.println(myMap);//{nasilsin=1, ali=2}

        //ODEV: Size verilen bir String'deki her harfin o String'de kac defa kullanildigini gosteren kodu yaziniz.
        //example 2: Write the code that shows how many times each letter in a given String is used in that String.
        //           "Hello" ==> H=1, e=1, l=2, o=1













    }
}













