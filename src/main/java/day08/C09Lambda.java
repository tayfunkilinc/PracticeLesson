package day08;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class C09Lambda {
    public static void main(String[] args) {
        //9) Bir List'teki elemanlari tekrarsiz olarak, uzunluklarina gore
        // kucukten buyuge siralayarak console'a yazdiran method'u olusturunuz.
        List<String> mylist=new ArrayList<>();
        mylist.add("Bayram");
        mylist.add("Berkhan");
        mylist.add("Emine");
        mylist.add("Faruk");
        mylist.add("Feyza");
        mylist.add("Hulika");
        mylist.add("İlay");
        mylist.add("Mustafa");
        mylist.add("Levent");
        mylist.add("Kubilay");
        mylist.add("Nesibe");
        mylist.add("Ahmet");
        mylist.add("arda");
        tekrarsizuzunlukSiraliYazdir(mylist);
    }

    private static void tekrarsizuzunlukSiraliYazdir(List<String> mylist) {
        mylist.stream().distinct().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    }
}
