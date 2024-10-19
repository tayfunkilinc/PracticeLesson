package day06.encapsulation;

public class Runner {
    public static void main(String[] args) {
       // Student std=new Student();
       // System.out.println(std.getIsim());//alican
       // std.setIsim("Veli Can");
       // System.out.println(std.getIsim());
       // Student std1=new Student();
       // System.out.println(std1.getIsim());//ali can



      //Mete, Han, 25 ozelliklerine sahip bir obje olusturunuz ve yazdiriniz
      //objenin yasinı 30 olarak guncelleyin
      //paranetresiz cons kullanarak 2. bir obje olusturun
      //Ayse, Yilmaz, 40 degerlerini atayin
      //yas’ı -5 olarek guncelleyin
      //yas negatif deger olamayacak sekilde set methodunu quncelleyin
      //isim ve soyismin sadece ilk harfi okunsun diğerleri * olsun,
      //getter metodunda gerekli düzeltmeyi yapınız.

        Stundent std = new Stundent("Mete", "Han", (byte) 25); // 25 i byte
        System.out.println(std); // Ogrenci{isim='Mete', soyIsim='Han', yas=25} // burda Class icinde to string oldugu icin direk yazdirdik toString bu ise yariyor
        // to string olmasaydi get methodlariyla teker teker yazdirmamiz gerekir

        std.setYas((byte)30); // sayilar default olarak int kabul edilir byte degiskene atarken casting yapmak gerekir
        System.out.println(std); //Ogrenci{isim='Mete', soyIsim='Han', yas=30}

        //paremetresi constructor ile obje olusturalim
        Stundent std1 = new Stundent(); //degersiz olusturdugumuz icin ekrana null olarak degerleri cekti
        System.out.println(std1); // Ogrenci{isim='null', soyIsim='null', yas=0}

        std1.setIsim("Ayse");
        std1.setSoyIsim("Yilmaz");
        std1.setYas((byte) 40);
        System.out.println(std1); // Ogrenci{isim='Ayse', soyIsim='Yilmaz', yas=40}

        std1.setYas((byte) (-5)); //Yas Degeri Negatif Olamaz
        System.out.println(std1); //Ogrenci{isim='Ayse', soyIsim='Yilmaz', yas=40} -- goruyorsunuz -5 atanmadieski deger kaldi negatif oldugu icin







    }

}
