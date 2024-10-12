package interviewDay01;

import java.util.Scanner;

public class C04interviewQuestion {
    public static void main(String[] args) {
        // print reverse number in java program  714 -- 417

        Scanner input = new Scanner(System.in);

        // Stiring ile cozum
        System.out.println("Lutfen Ters Cevirmek Istediginiz Sayii Yaziniz");

        String ters = "";

        for (int sayi = input.nextInt(); sayi > 0 ; sayi/=10) { // bu tur kullanimlari guzel nede olsa ; aralarinda islem yapiyor
            ters = ters + sayi %10;
        }
        System.out.println("ters = " + ters);

        //2.YOL int ile cozum
        System.out.println("Lutfen Ters Cevirmek Istediginiz Sayii Yaziniz");

        int reverse = 0;

        for (int sayi = input.nextInt(); sayi > 0 ; sayi/=10) { // bu tur kullanimlari guzel nede olsa ; aralarinda islem yapiyor
            reverse = reverse * 10;
            reverse = reverse + sayi %10;

        }
        System.out.println("reverse = " + reverse);

    }

}
