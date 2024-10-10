package day03;

import java.util.Random;
import java.util.Scanner;

public class C07Odev {
    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        // Random rnd=new Random();
        // int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur
        // odev!!!kullaniciya 5 tahmin hakkı verin bulursa tebrik edin bulamazsa exit atip tekrar oynamasini isteyin
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        int rndSayi = rnd.nextInt();

        int tahminHakki = 5;
        while (tahminHakki>0){
            System.out.println("Lütfen Tahminde Bulunmak İçin 1-100 Arası Sayı Giriniz");
            int sayi = input.nextInt();
            if (sayi>100 || sayi<0){
                System.out.println("Lütfen Verilen Aralıkta Değer Girin");
            }
            if(rndSayi>sayi){
                System.out.println("Daha Büyük Sayı Girin: ");
            } else if (rndSayi<sayi) {
                System.out.println("Daha Küçük Bir Sayi Girin");
            }else {
                System.out.println("Tebrikler Bildiniz");
                break;
            }
            tahminHakki--;
            System.out.println("Kalan Hakkınız: " + tahminHakki);
            if (tahminHakki == 0) {
                System.out.println("Tahmin Hakkınız Bitti 3 Tahmin Hakkı Almak İçin e İstemiyorsanız h 'ye basın ");
                String str = input.next();
                if (str == "e") {
                    tahminHakki += 3;
                } else if(str == "h"){
                    System.out.println("By BY");
                }
            }

        }
    }
}
