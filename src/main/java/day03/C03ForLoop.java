package day03;

import java.util.Scanner;

public class C03ForLoop {
    public static void main(String[] args) {

        // kullanicidan 10'dan kucuk bir tam sayi isteyin ve girilen sayinin faktoryelini bulun.

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen 10`dan kucuk bir tam sayi giriniz");

        byte sayi = input.nextByte();
        if (sayi< 10 && sayi>0) {
            int bosInt =1;
            for (int i = 0; i <= sayi; i++) {
                bosInt*=i;
            }
            System.out.println(sayi + "! =" + bosInt);
        } else{
            System.out.println("Lutfen Gecerli Deger Giriniz");
        }

    }
}
// kendi olusturdugunuz hesap makinesine guncelleme olarak ekleyiniz
