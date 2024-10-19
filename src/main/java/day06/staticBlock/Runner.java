package day06.staticBlock;

public class Runner {
    public static void main(String[] args) {
        Memur memur1=new Memur();
        System.out.println("memur1.id = " + memur1.id);//3568
        System.out.println("memur1.sira = " + memur1.sira);//1234

        Memur memur2=new Memur();
        System.out.println("memur2 = " + memur2.id);//3569
        System.out.println("memur2.sira = " + memur2.sira);//1234

        Memur memur3=new Memur();
        System.out.println("memur3.id = " + memur3.id); //3570
        // id static blok oldugu icin her Memur clasindan nesne olusturdugumuzda
        // tum hersey static olarak degisti ver eklenen deger uzerinden devam edildi
        //id Class a bagli hale geldigi icin
        System.out.println("memur3.sira = " + memur3.sira);//1234
        //sira intance oldugu icin her seferinde ilk atanan degeri donderdi obje bagli halde her zaman ayni degeri aldi

    }
}