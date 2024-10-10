package day04;

public class C04Arrays {
    public static void main(String[] args) {
        //4.soru Verilen bir int array'deki en buyuk sayiyi yazdiran bir method olusturun.

        int[] sayi = {1,4,7,3,2,8,6,4,9,4,2,3,5,1,99,123,632,213,543,4332,43,56,7,54,657};
        maxSayiYazdir(sayi);
    }
    public static void maxSayiYazdir(int[] sayilar){
        int max = sayilar[0];
        for (int w : sayilar){
            if (w > max ) {
                max = w;
            }
        }
        System.out.println(max);
    }
    //ODEV   6.Soru -Verilen String bir array'de en uzu ve en kisa String'leri yazdıran bir method olusturun
    // ODEV  7.soru -Verilen bir array'in istenen bir elemani icerip icermedigini kontrol edip, biz true veya false sonucu donen bir method olusturun

}
