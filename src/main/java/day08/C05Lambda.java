package day08;

import java.util.ArrayList;
import java.util.List;

public class C05Lambda {
    public static void main(String[] args) {
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
        //5) Bir List'teki A ile baslayanlar haric tum elemanlari
        //console'a yazdiran method'u olusturunuz.
        aHaricYazdir(mylist);
        System.out.println("-----------------");
        aHaricYazdir1(mylist);
        System.out.println("-----------------");

    }

    private static void aHaricYazdir(List<String> mylist) {
        mylist.stream().filter(t-> !t.toLowerCase().startsWith("a")).forEach(System.out::print); // eger kucuk buyuk onemsiz ise
        //BayramBerkhanEmineFarukFeyzaHulikaİlayMustafaLeventKubilayNesibe
    }
    private static void aHaricYazdir1(List<String> mylist) {
        mylist.stream().filter(t-> t.toLowerCase().charAt(0) != 'a').forEach(System.out::print);
        //BayramBerkhanEmineFarukFeyzaHulikaİlayMustafaLeventKubilayNesibe
    }
}
