package interviewDay02;

import java.util.Scanner;

public class C02InterviewQuestion {
    public static void main(String[] args) {
        //bir cümlenin kelimelerini sayacak, her kelimeyi ters çevirecek kodu yazınız
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String str = input.nextLine();

        String[] words = str.split(" "); //kelimelere ayirdim  dizi icine kabul ettim
        System.out.println("cumledeki kelime sayisi: " + words.length);

        //her kelimeyi ters cevirelim
        System.out.println("Ters Cevrilmis Kelimeler : ");

        for (String word : words){
            System.out.println(new StringBuilder(word).reverse());
            // burda StringBuilder reverse methodunu kullanabilmek icin StringBuilder olusturup kelimelerimiz icine kaydetti
        }

        //son kelimeden baslayarak ters cevirseydik ne olur
        System.out.println();
        for (String word:words
        ) {
            StringBuilder sb=new StringBuilder(word);
            System.out.print(sb.reverse()+" ");
        }


    }
}
