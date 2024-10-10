package day02;

import java.util.Scanner;

public class C01_ternary {
    public static void main(String[] args) {
            /*
Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli
ise Sesli harf olduğunu,
değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
1 karakterden fazla ise hata mesajı göstersin.
(Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
Sesli harfler: a,e,i,o,u
*/
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Kotrol Etmek İstediğniz Harfi Girin: ");

        String harf = input.next().toLowerCase();

        harf = harf.replaceAll("[^a-z]","*");
        harf = harf.replaceAll("[aeiou]", "a"); //burda çevirme işlemi yapıyoruz hepsini kontrol etmeyelim diye aeiou yu tek tek yapmaktansa sadece a yı kontrol etmek yeterli



        if(harf.contains("*") || harf.length()!=1) {// harf dışında bir yapı girdiyse
            System.out.println("hatalı giriş yaptınız");
        }
        else {
            if(harf.equals("a")){
                System.out.println("Sesli Harf");
            }
            else {
                System.out.println("Sessiz Harf");
            }
        }

        //yukardaki if else yapısını ternary'e çevirelim şimdi

       String sonuc = harf.contains("*") || harf.length()!=1 ?
                ("Girdiğiniz Karakter Geçersizdir")//true kod
                :
                (harf.equals("a")?
                 "sesli harftir"
                 :
                 "sessiz harftir"
                 );
        System.out.println("sonuc= "+sonuc);

    }
}
