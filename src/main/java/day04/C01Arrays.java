package day04;

import java.util.Arrays;

public class C01Arrays {
    public static void main(String[] args) {

        //1.soru bir array olusturun ve olusturdugunuz arraydeki tum elemanları yazdırın
        //gireceğimiz datayı yazalım
        String[] isimler = {"Ali Can", "Kemal", "Sinan", "Esra", "Kerim", "Tuba"}; //dizilere sonradan değer eklenemez
        System.out.println(Arrays.toString(isimler)); // [Ali Can, Kemal, Sinan, Esra, Kerim, Tuba]
        for (String w : isimler){
            System.out.print(w + " "); //Ali Can Kemal Sinan Esra Kerim Tuba
        }

    }
}
