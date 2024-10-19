package day06.inheritance02;

public class Araba {
        // Araba, Opel, Corsa adinda farkli class'lar olusturunuz.
    // Opel class'ı:Araba class'ina baglı olacak
    // Corsa class'a Opel class'ina baglı olacak
    // Araba class'ina genel bilgileri, variable ve method olarak yaziniz.
    // Opel class'ina gerekli bilgileri, variable ve method olarak yaziniz.
    // Corsa class'ına en spesifik bilgileri, variable ve method olarak yaziniz.
    // Corsa class'indan obje olusturarak variablelara ve methodlara yazdiriniz.

    public String hareket = "Arabalar Tekerlek Ile haraket Eder";
    public String hiz ="Arabalar Motor Gucune Gore Hizlanir";
    public String yakit = "Arabalar Farkli Turde Yakit Turune Sahip olabilir";
    public String marka ="Arabalar uretildikleri Firmanin Markasina Sahiptir";

    public void motor(){
        System.out.println("Arabalar Farkli markalarda motorlara sahiptir");
    }
    public void  yakitTuketimi(){
        System.out.println("Arabalar Motor Gucune Gore Yakit Tuketir");
    }

}
