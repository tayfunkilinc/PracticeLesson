package day04;

import java.util.ArrayList;

public class C05List {
    public static void main(String[] args) {
        //soru 1) bir list olusturup eleman ekleyin ve yazdirin
        ArrayList<Integer> myList = new ArrayList<>(); // Listler içine Class lar kabul eder primitive data türü(int, char) girilemez wraper class(Integer, Character) girilebilir
        myList.add(3);
        myList.add(5);
        myList.add(7);
        myList.add(9);
        myList.add(11);
        myList.add(3,12); //3. index'e 12 eklendi  3. index' ekleme yapıp geri kalanlar birer index kaydırıldı

        System.out.println(myList);
    }
}
