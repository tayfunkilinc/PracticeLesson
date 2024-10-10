package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C04Odev {
    public static void main(String[] args) {
        /*
        icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olusturun
        kullanicidan bir sayi isteyip listede var olup olmadigini kullaniciya yazin
        */
        Random rnd = new Random();
        int sayi = 0;
        List<Integer> myList = new ArrayList<>();
        while (myList.size()<200){ // burda for ile yapsak kontrol yapmasak esit sayilarda yuklenecegi icin 200 sayi elde edemezdik
            sayi = rnd.nextInt(1000);
            if (!myList.contains(sayi)) { // burda esit sayilarin yuklenmesini engellemek icin bu yontemi kullandik
                myList.add(sayi);
            }
        }
        System.out.println(myList.size());
        for (int i = 0; i <200 ; i++) {//totalde 200 tane dön
            sayi=rnd.nextInt(1000);
            if (!myList.contains(sayi)){
                myList.add(sayi);
            }
        }
        System.out.println(myList.size());
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Sayi giri; ");

        sayi =input.nextInt();
        if (myList.contains(sayi)){
            System.out.println("sayi listede");
            System.out.println(myList.indexOf(sayi));
        }
        else {
            System.out.println("sayi icermiyor");
        }


    }
}
