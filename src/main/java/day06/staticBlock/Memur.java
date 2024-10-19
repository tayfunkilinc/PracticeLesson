package day06.staticBlock;

public class Memur {
    public int id;
    public int sira;

    //intance block
    {
        sira = 1234;
    }

    static { //static blok
        sayac=3568;
    }
    public Memur(){
        id=sayac;
        sayac++;
    }

    private static int sayac;



}
