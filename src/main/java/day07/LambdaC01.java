package day07;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaC01 {
    public static void main(String[] args) {
        //Lambda Coklu yapilarda kullanilir elimizdeki verini ilk once coklu yapi olmali degilse coklu yapiya cevirip kullanabiliriz
        //1) Bir list'teki tek elemanlari ayni satirda aralarina bosluk koyarak
        // yazdiran method'u olusturunuz.

        List<Integer> mylist =new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11));
       // tekYazdiran1(mylist); //1 3 5 7 9 11
        tekYazdiran2(mylist); //1 3 5 7 9 11


    }
    private static void tekYazdiran1(List<Integer> myList){
        for (int a : myList){
            if (a % 2 != 0){
                System.out.println(a + " ");
            }
        }
    }
    private static void tekYazdiran2(List<Integer> myList){
        myList.stream().filter(t-> t % 2 != 0).forEach(t-> System.out.print(t + " "));

    }
}
