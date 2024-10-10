package day05;

import java.time.LocalDate;
import java.util.Scanner;

public class c07DateTime {
    public static void main(String[] args) {
           /*
       soru 1)
       -bugunun tarihini obje olusturarak yazdirin
       -bugun yilin kacinci gunu oldugunu yazdirin
       -hangi gunde oldugumuzu yazdirin
       -yılın bitmesine kac gun kaldıgını yazdırın
       -bugunden itibaren 3yil 5 ay 7gun sonraki tarihi yazdirin
       -bugunden itibaren 2yil 2 ay 2 gun sonraki tarihin ayin kacinci gunu oldugunu yazdirin
       -bugunden itibaren 7yil 7 ay 7 gun sonraki tarihin haftanin hangi gunu oldugunu yazdirin
       -ikinci bir tarih objesi olusturun ve iki tarihi karsilastirin ve bize eski olan tarihi dondurun
*/
        //LocalDate   ---> sadece tarih
        //LoaclTime   ---> sadece saat
        //LocalDateTime ---> hem tarih hem saat

        LocalDate tarih = LocalDate.now(); // now() methodu lacal tarih olarak ne bulunuyor ise onu getirmeye saglar
        System.out.println(tarih); // 2024-10-10
        System.out.println("Yilin Gunu:  " + tarih.getDayOfYear()); // Yilin Gunu:  284

        System.out.println("Haftanin Gunu:  " + tarih.getDayOfWeek()); //Haftanin Gunu:  THURSDAY
        System.out.println("Kalan Gun sayisi: " + (365-tarih.getDayOfYear())); //Kalan Gun sayisi: 81 // burda artik yil kontrolu yapmadik bunu altta if-else ile kontrolunu yapmamiz gerekli

        if (tarih.isLeapYear()) { // isLeapYear() burda artik yilmi diye kontroleden bir methoddur. true - false gonderir
            System.out.println(366- tarih.getDayOfYear());
        }
        else {
            System.out.println(365-tarih.getDayOfYear()); //82
        }
        //2.kalan gun sayisini yapmak icin tamamen gun sayisini bulup bu gunden cikartabilriz
        System.out.println(tarih.lengthOfYear() - tarih.getDayOfYear());  //82
        //ileri tarihe nasil gidilir
        System.out.println(tarih.plusYears(3).plusMonths(4).plusDays(9)); //2028-02-19

        //bugunden itibaren 2yil 2 ay 2 gun sonraki tarihin ayin kacinci gunu oldugunu yazdirin
        System.out.println(tarih.plusYears(2).plusMonths(2).plusDays(2).getDayOfMonth());
        //-bugunden itibaren 7yil 7 ay 7 gun sonraki tarihin haftanin hangi gunu oldugunu yazdirin
        System.out.println(tarih.plusYears(7).plusMonths(7).plusDays(7).getDayOfWeek());

        //-ikinci bir tarih objesi olusturun ve iki tarihi karsilastirin ve bize eski olan tarihi dondurun

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Bir Gun Girin");
        int day = input.nextInt();
        System.out.println("Lutfen Bir Ay Girin");
        int month = input.nextInt();
        System.out.println("Lutfen Bir Yil Girin");
        int year = input.nextInt();
        LocalDate yeniTarih = LocalDate.of(year,month,day);
        System.out.println(yeniTarih); // 19xx/xx/xx

        if (yeniTarih.isBefore(tarih)){ //yeniTarih tarihten once midir
            System.out.println(" Eski tarih Onde" + tarih);
        } else if (tarih.isBefore(yeniTarih)) {
            System.out.println(" Yeni Tarih onde" + yeniTarih);

        }else {
            System.out.println("Tarihler Aynidir");
        }

        //soru 2)
        //-suanin saatini dakikasini ve saniyesini bize dondurun
        //-suanin saniyesini bize dondurun
        // -10000 saniye sonrasini bize dondurun
        //-200 dakika onceki saati bize dondurun
        //-bize saati 3 yapip yazdirin(dakika ve saniye degismeden)
        //Odev!!!!

        ///*
        //        soru 3)
        //        bize bugunun tarihini ve su anki saati dondurun
        //        bize 3 ay 100 saat sonraki tarih ve saati dondurun
        //        bize 100 gun once 100 saat sonraki tarihi dondurun
        //        bize 3 yil 5 ay 10 gün 1000 saat sonraki tarihin haftanin hangi günü oldugunu dondurun
        //        bize sadece bugunun tarihi dondurun
        //        LocalDateTime kullanarak yapın tum hepsini
        //         */
        // Odev!!!
    }
}
