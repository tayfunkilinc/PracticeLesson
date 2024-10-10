package day04;

import java.util.ArrayList;
import java.util.Arrays;

public class C06List {
    public static void main(String[] args) {
        // verilen bir listede tekrar eden sayilari sadece 1 tane yapan
        // bir method olusturun
        // orn : [1, 3, 5, 3, 5, 6, 1, 7]  bu listi
        //       [1, 3, 5, 6, 7] bu hale donusturun
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 5, 3, 5, 6, 1, 7));
        // asList verdiğimiz sayıları List e çevirir kısa yoldan list oluşturduk
        //asList list gibi davran methodudur
        System.out.println(myList); //[1, 3, 5, 3, 5, 6, 1, 7]
        myList.add(5);
        myList.add(7);
        System.out.println(myList); //[1, 3, 5, 3, 5, 6, 1, 7, 5, 7]
        tekrarsizList(myList); // sağ tık show contex action deyip method oluştur diyerek direk methodu oluşturuyor IntelliJ
    }

    private static void tekrarsizList(ArrayList<Integer> myList) {
        ArrayList<Integer> tekrarsizList = new ArrayList<>();
        for (Integer w : myList){
            if (!tekrarsizList.contains(w)) {
                tekrarsizList.add(w);
            }
            else {
                System.out.println("Bu sayıdan Birden Fazla Var: " + w);
            }
        }
        System.out.println(tekrarsizList);
    }
}
