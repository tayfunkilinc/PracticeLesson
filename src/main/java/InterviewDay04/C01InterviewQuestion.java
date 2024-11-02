package InterviewDay04;

import java.util.Arrays;
import java.util.Scanner;

public class C01InterviewQuestion {
     // Bir metin içinde kullanıcıdan alınan bir kelimenin kaç kez geçtiğini sayan bir Java metodu yazın.
    // Metin büyük/küçük harf duyarlı olmamalıdır.
   // Örnek girdi olarak 'Java, Java, and java!' verildiğinde kullanıcı java girerse, çıktı olarak 3 verilmelidir

    public static void main(String[] args) {
        String str = "Java, Java, and java!";
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Aramak Istediginiz Kelimeyi Giriniz");
        String word = input.next();
       // countWordOccurences(str, word);
        splitWithCountWordOccurences(str, word);
    }

    //1.YOL
    private static void countWordOccurences(String cumle, String arananKelime) {
        cumle = cumle.toLowerCase();
        arananKelime = arananKelime.toLowerCase();
        // direkt kuculttum cunku duyarsiz olarak arama yapacagim

        int count = 0;
        int index = 0;

        while ((index=cumle.indexOf(arananKelime,index))!=-1){ // cumlenin icinde olmayan bir deger indexOf a verilirse bize -1 donderir
        //arananKelime,index burda arana index e gelen sayi indexinden sonra ramaya baslayacak
            count++;
            index += arananKelime.length();
        }
        System.out.println("bu kelimeden toplam : " + count + " tane kullanilmistir.");
    }
    //2.YOL split ile array'e cevirip yapsak ne olur du

    private static void splitWithCountWordOccurences(String cumle, String arananKelime){
        cumle = cumle.toLowerCase().replaceAll("[^a-z]","");
        arananKelime = arananKelime.toLowerCase();

        String[] arr = cumle.split(" ");
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("------------------------");
        //System.out.println("arr.length = " + arr.length);

        int sayac =0;
        for (String a : arr){
            if (a.equals(arananKelime)){
                sayac++;
            }
        }
        System.out.println("bu kelimeden toplam : " + sayac + " tane kullanilmistir.");
    }

}
