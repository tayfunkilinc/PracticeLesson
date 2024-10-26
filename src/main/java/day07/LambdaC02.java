package day07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaC02 {
    public static void main(String[] args) {
        //2) Bir list'teki "10'dan kucuk" olan elemanlarin "kare"lerini ayni satirda  aralarina bosluk
        //koyarak yazdiran method'u olusturunuz.

        List<Integer> mylist=new ArrayList<>(Arrays.asList(1,7,11,23,12,14,47,58,91,37,23,8));
        rakamlarinKareleri(mylist);
    }
    public static void rakamlarinKareleri(List<Integer> mylist){
        mylist.stream().filter(t-> t<10).map(t-> t*t).forEach(System.out::println); //soutc direk t yi yazdiriyor
//        1
//        49
//        64

        //---------------------
        //toplami alsaydik bu sekilde reduce eklenirdi
       // int sum = mylist.stream().filter(t-> t<10).map(t-> t*t).reduce(0,(t,u)-> t+u); // 0 baslangic degeri ikinci paremetrede islem yapilacak kisim
      //int sum = mylist.stream().filter(t-> t<10).map(t-> t*t).reduce(0, Integer::sum); //2. yol daha kisa hali
       // System.out.println("sum = " + sum); // sum = 114
    }
}
