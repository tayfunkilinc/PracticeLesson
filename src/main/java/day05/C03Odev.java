package day05;

import java.util.Scanner;

public class C03Odev {
    public static void main(String[] args) {
        //7.soru -Verilen bir array'in istenen bir elemani icerip icermedigini kontrol edip, bize
        // true veya false sonucu donen bir method olusturun

        //contains methodu olusturun
        String isimler[]={"furkan","veli","huseyin","hakan","ali","ece","isa","cem","ibrahim"};
        containsElement(isimler);


    }

    public static boolean containsElement(String[] isimler) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Kotrol Kelimesini Giriniz: ");
        String arananKelime = input.nextLine();

        for (String w : isimler){
            if (w.equalsIgnoreCase(arananKelime)) { //equalsIgnoreCase bu eşitlikte büyük küçüğü fark etmeden arıyor
                System.out.println("kelime listede var");
                return true;
            }
        }
        return false;
    }
}
