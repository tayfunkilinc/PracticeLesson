package day03;

import java.util.Scanner;

public class C06WhileLoop {
    public static void main(String[] args) {
        // kullanicidan istedigi kadar pozitif sayi girmesini isteyin
        // kullanicinin girdigi sayilarin toplami 500'u gecerse
        // artik yeter cok sayi girdin, toplam.... oldu yazsin

        Scanner input = new Scanner(System.in);

        int sayi;
        int toplam =0;

        while (toplam<=500) {
            System.out.println(" Lutfen toplamak istediginiz sayilari giriniz");
            sayi = input.nextInt();
            toplam+=sayi;
        }
        System.out.println("artik yeter cok sayi girdin toplam =" +toplam);
    }
}
