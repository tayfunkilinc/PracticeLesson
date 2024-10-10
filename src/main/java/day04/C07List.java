package day04;

import java.util.List;

public class C07List {
    public static void main(String[] args) {
        // bir listede ortalama üstünde olan element sayisini bulunuz
        //list.of mehodu kısa sürede list oluşturlayı sağlar fakat arrayListlerde kullanılamaz
        List<Double> sayilar=List.of(1.5,3.14,1.8,57.57,37.0,13.5); // array listlerde kullanılamaz

        //toplam
        double sum =0;
        for (Double w : sayilar){
            sum += w;
        }
        //ortalama
        double ortalama = sum/sayilar.size();
        System.out.println(ortalama); //19.085
        //ortalama üstündeki elementleri bulalım
        int sayac= 0;
        for (double w : sayilar){
            if (w > ortalama) {
                sayac++;
                System.out.print(w + " ");
            }
        }
        System.out.println("\n" +sayac);
    /* ODEV 2
    icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olusturun kullanicidan bir sayi isteyip
    listede var olup olmadigini kullaniciya yazin
    */
    /* ODEV 2
    Asagidaki multi dimensional array'in
    ic array'lerindeki tum elemanlarin toplamini birer birer bulan
    ve herbir sonucu yeni bir array'in elemani yapan
    ve yeni array'i ekrana yazdiran bir program yaziniz
    Ornek; {{1,2,3}, {4,5}, {6, 7} } ==> 1 + 2 + 3 = 6 4+5=9 6+7=13 ==> output: (6, 9, 13)
    */


    }
}
