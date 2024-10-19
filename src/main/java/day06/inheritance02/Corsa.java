package day06.inheritance02;

public class Corsa extends Opel{
    //gelen variable  = hareket, hiz ,yakit, marka, sirketMerkezi(Bu Opelden geldi digerleri arabadan)
    // gelem methodlar = fren(Bu Opelden geldi digerleri arabadan) , motor, yakitTuketimi
    public String hiz = "Corsa Arabalar Max hiz 200km";
    public String yakit = "Corsa Aarabalar LPG'lidir";
    public String model = "Corsa";
    public void motor(){
        System.out.println("Corsa Arabalar Cervreci Motor Kullanmaktadir");
    }
    public void vitesSayisi(){
        System.out.println("Corsa Arabalar Otomatik Viteslidir");
    }
}
