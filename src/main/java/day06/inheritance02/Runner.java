package day06.inheritance02;

public class Runner {
    public static void main(String[] args) {
        Corsa araba1 = new Corsa();
        System.out.println("araba1.hareket = " + araba1.hareket); // bu bilgiyi sadece en ust parentta oldugu icin Araba clasindan bu bilgiyi ceker
        System.out.println("araba1.hiz = " + araba1.hiz); // Corsa clasindan yazdirir.
        System.out.println("araba1.marka = " + araba1.marka); //oplel clasindan yazdirir
        System.out.println("araba1.yakit = " + araba1.yakit);//corsa clasindan yazdirir

        //filed lar referance data tipinden baslar yoksa parentina bakar ilk buldugu degeri getirtir.

        araba1.motor();//corsa dan gelri
        araba1.yakitTuketimi(); //opel classindan gelir

        //------------
        Opel araba2= new Corsa();
        // Opel in tum aktif ve pasif ozelliklerini tasir fakat
        //aktif ozelliklerden daha guncel hali varsa guncel halini alir --  burda atif olanlar method pasif olanlar variable dir
        System.out.println("araba2.hareket = " + araba2.hareket); // araba2.hareket = Arabalar Tekerlek Ile haraket Eder
        System.out.println("araba2.hiz = " + araba2.hiz);
        System.out.println("araba2.yakit = " + araba2.yakit); //  burda dikkat et opelden yazdir di cunku referance turu opeldir


        araba2.yakitTuketimi(); // opel clasindan yazdirir
        araba2.motor(); // corsa clasindan yazdirdi opel clasinda olmasina ragmen child da override
        // edildigi icin opel diyorki benim cocugumda daha guncel hali var gir onu kullan deyip bizi cocuguna gonderiyor

        //methodlarda referans data tipine bakılır
        //metod varsa constructor data tipine kadar
        //child classlarda override edilmişse
        //en son hali çağırılır.Override edilmediyse
        //mevcut metod çağrılır.


    }
}
