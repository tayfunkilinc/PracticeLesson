package day03;

import java.util.Scanner;

public class C02ForLoop {
    public static void main(String[] args) {
        /*
        soru 1) belirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.
        */
        Scanner input = new Scanner(System.in);
        System.out.println(" Lutfen Carpim Tablosu Olusturacaginiz Sayiyi Giriniz");
        int sayi = input.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(sayi + "*" + i + " = " + sayi*i );
        }
        System.out.println("-----------------------------");

        //Guncelleme 10*10 luk bir carpim taplosu olusturun

        for (int i = 0; i <= 10; i++) {
            System.out.println("--------");
            for (int j = 0; j <= 10; j++) {
                System.out.print(i + " x " + j + " = " + i*j +" ");

            }
            System.out.println("");

        }

    }
}
