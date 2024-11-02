package day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03Lambda {
    public static void main(String[] args) {
        //3)Verilen List'teki "maksimum değeri" bulmak için bir method oluşturun
        List<Integer> mylist=new ArrayList<>(Arrays.asList(1,7,11,23,12,14,9,47,58,91,37,37,23,8,11,1,23,23,8));
        maksimum(mylist);
    }

    private static void maksimum(List<Integer> mylist) {
        System.out.println(mylist.stream().distinct().reduce(Math::max).get()); //91
    }


    //-------------VARARGS -----------
    /*public static void main(String[] args) {
        toplam(5,6,7,8,9,0,12,13,14,15,16,17,18,43,43,5476,78,76,6,54);
    }
    public static void toplam(int... a){ // data turu int olan istedigim kadar degisken alabilirim
        int toplam =0;
        for (int w : a){
            toplam += w;
        }
        System.out.println("toplam = " + toplam);
    }*/
}
