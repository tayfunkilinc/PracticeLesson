package interviewDay01;

import java.util.Scanner;

public class C06interviewQuestion {
    public static void main(String[] args) {
        // check no is Armstrong or not in java program
        //  454 -->  4^3+5^3+4^3 = 253  non-Armstrong
        //  407 -->  4^3+0^3+7^3 = 407  Armstrong
        // her sayinin basamak sayisi kadar ustunu alip topluyoruz cikan sonuc sayiya esitse Armstrongtur

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen Amstrong Sayi Kontrolu Yapilacak Sayiyi Girin: ");
         int sayi = input.nextInt();

         int sayac =0; // kuvvetini bulacagiz burda
        for (int i = sayi; i > 0 ; i/=10) {
            sayac++;
        }
       // System.out.println("sayac = " + sayac);
        int sum =0;  // burdada her basamagin kuvvetini alip sum icinde toplayacagiz
        for (int i = sayi; i > 0 ; i/=10) {
            sum += power(i%10, sayac); // kuvvet almayi Math.pow ilede yapardik ama biz yazdik
        }
        if (sayi == sum) {
            System.out.println("Sayi Amstrong Sayidir");
        }else
        {
            System.out.println("Sayi Amstrong Sayi Degildir");
        }

    }
    public static int power (int a, int b){
        int c =1;
        for (int i = 1; i <b ; i++) {
            c*=a;
        }
        return c;
    }
}
