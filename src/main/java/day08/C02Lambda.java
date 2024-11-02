package day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02Lambda {
    public static void main(String[] args) {
        //2) Bir list'teki "3'e tam bolunmeyen" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda
        //aralarina bosluk koyarak yazdiran method'u olusturunuz.

        List<Integer> mylist=new ArrayList<>(Arrays.asList(1,7,11,23,12,14,47,58,91,37,37,23,8,11,1,23,23,8));
        uceBolunmeyenKupler(mylist);
    }

    private static void uceBolunmeyenKupler(List<Integer> mylist) {
        mylist.stream().distinct().filter(t-> t % 3 != 0).map(t-> t*t*t).forEach(t-> System.out.print(t + " "));
        //1 343 1331 12167 2744 103823 195112 753571 50653 512
    }
}
