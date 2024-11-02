package day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01Lambda {
    public static void main(String[] args) {
        //1) bir listedeki elemanlardan 5'e tam bolunenleri yazdiran bir method olusturun
        List<Integer> mylist=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11));
        besebolunen(mylist);

    }

    private static void besebolunen(List<Integer> mylist) {
        mylist.stream().filter(t->t%5==0).forEach(System.out::println);
    }
}
