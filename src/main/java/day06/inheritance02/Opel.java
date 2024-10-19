package day06.inheritance02;

public class Opel extends  Araba{
    //Arabadan gelen variable ve method lar = harekt, hiz, yakit, marka, motor, yakitTuketimi
    public String marka = "Opel"; // markada guncellemeye gittik artik bu ozellik objeye atanacak
    public String yakit = "Opel Arabalarda Dizel Yakit Turu Kullanillir";
    public String sirketMerkezi="Almanya";

    public void motor(){//override // burda cocugumda daha gunceli var chil imdan git kullan diye uyari veriyor
        System.out.println("Opel arabalari opel marka motor kullanmaktadir");
    }
    public void yakitTuketimi(){//override
        System.out.println("Opel arabalari cok az yakıt tüketir");
    }
    public void fren(){
        System.out.println("Opel arabalar abs özelligine sahip fren sistemi kullanırlar");
    }


}
