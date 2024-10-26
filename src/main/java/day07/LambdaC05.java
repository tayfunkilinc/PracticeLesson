package day07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaC05 {
     /*
        5)bir listedeki tekrarsiz elemanlardan 4'e tam bolunenlerin karekoklerinin carpimini yazdirin
         */
     public static void main(String[] args) {
         List<Integer> mylist=new ArrayList<>(Arrays.asList(4,8,16,64,16,64));
         dordeTamBolunenKarekokCarpimi(mylist);
     }

    private static void dordeTamBolunenKarekokCarpimi(List<Integer> mylist) {
        double carpim = mylist.stream().distinct().filter(t-> t % 4 ==0).map(Math::sqrt).reduce(1.0, (t,u)-> t*u); // burda 1.0 yazmamin sebebi artik degerlerin double olarak islem gormesinid
        // ve donus degeri double olarak tanimlanmali
        System.out.println("carpim = " + String.format("%.2f", carpim)); //carpim = 181.02 // String.format bunuda formatli yazmak icin kullandik
    }
}
