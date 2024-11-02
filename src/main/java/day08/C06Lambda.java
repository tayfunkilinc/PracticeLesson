package day08;

import java.util.ArrayList;
import java.util.List;

public class C06Lambda {
    public static void main(String[] args) {
        //6) Bir List'te karakter sayisi 7’den az olan tum elemanlari
        // tekrarsiz olarak console'a Buyuk harflerle yazdiran method'u olusturunuz.
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

        yedidenAzHarf(mylist);
    }

    private static void yedidenAzHarf(List<String> mylist) {
        mylist.stream().distinct().filter(t-> t.length() < 7).map(String::toUpperCase).forEach(System.out::println);
    }
}
