package day02;

import java.util.Scanner;

public class C05_forloops {
    public static void main(String[] args) {
        /* Kullanicidan 100'den kucuk bir pozitif tamsayi isteyin.

        1'den baslayarak girilen sayiya kadar(istenen sayi dahil)
         3'un kati olan sayilari yazdirin.
        */
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen 100'den küçük pozitif sayı giriniz");
        byte sayi = input.nextByte(); //Byte wrapper class byte primitive data türüdür
        if (sayi<0||sayi>100){
            System.out.println("Lütfen 100den Küçük Sayı Girin");
        }
        else {
            //1.YOL
            // for (int i = 1; i <= sayi; i++) {
            // if(i%3==0){
            //    System.out.println(i + " ");
        //}
            //}
            for (int i = 3; i <=sayi; i+=3) {
                System.out.print(i+" ");
            }
        }

    }
}
