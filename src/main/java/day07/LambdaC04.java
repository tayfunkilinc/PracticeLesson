package day07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaC04 {
    public static void main(String[] args) {
        /*
        4)bir listedeki elemanlardan 3'e bolunenlerin ilk once kupunu alıp sonra bunlarin toplamını bulan bir method olusturun
        */
        List<Integer> mylist=new ArrayList<>(Arrays.asList(1,7,11,23,12,14,47,58,91,37,37,23,8,11,1,23,23,8));
        uceBolunenlerinKupToplami(mylist);
    }

    private static void uceBolunenlerinKupToplami(List<Integer> mylist) {
        double sum = mylist.stream().filter(t-> t%3 ==0).map(t-> Math.pow(t,3)).reduce(0.0,Double::sum);
        System.out.println("sum = " + sum); // sum = 1728.0
    }
}
