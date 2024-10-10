package day03;

import java.util.Scanner;

public class C05WhileLoop {
    public static void main(String[] args) {
        // kullanicidan toplamak istedigi sayilari alin
        // ve kullanici 0'a basincaya kadar devam edin
        // kullanici 0'a bastiginda
        // girdigi tum sayilarin toplamini yazdirin

        Scanner input = new Scanner(System.in);


        double sayi;
        double toplam =0;
        do {
            System.out.println("lutfen toplamak istediginiz sayilari giriniz siz sifira basana kadar devam edilecek");
            sayi = input.nextDouble();
            toplam+=sayi;

        }while (sayi!=0);  //bu sayiya erisemiyorum bunun icin yukarda tanimlayip icere deger atadik
        System.out.println("toplam: " + toplam);
    }
}
