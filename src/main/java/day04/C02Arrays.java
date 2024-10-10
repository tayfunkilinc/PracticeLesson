package day04;

import java.util.Arrays;

public class C02Arrays {
    public static void main(String[] args) {
        //2.soru bir array olusturun ve olusturdugunuz arraydeki sayilari kucukten buyuge siralayin
        int[] sayi = {1,4,7,3,2,8,6,4,9,4,2,3,5,1,99,123,632,213,543,4332,43,56,7,54,657};
        Arrays.sort(sayi);
        System.out.println(Arrays.toString(sayi));
    }
}
