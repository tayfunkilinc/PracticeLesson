package day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04Lambda {
    public static void main(String[] args) {
        List<Integer> mylist=new ArrayList<>(Arrays.asList(1,7,11,23,12,14,9,47,58,91,37,37,23,8,11,1,23,23,8));
        //4)Verilen List'ten 12’den buyuk en kucuk sayiyin karesini bulmak için bir method oluşturun
        method(mylist);
    }
    private static void method(List<Integer> mylist) {
        System.out.println(mylist.stream().distinct().filter(t -> t > 12).sorted().findFirst().map(t -> t * t).get()); // 196
    }
}
