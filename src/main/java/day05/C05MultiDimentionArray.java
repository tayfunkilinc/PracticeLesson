package day05;

import java.util.Arrays;

public class C05MultiDimentionArray {
    public static void main(String[] args) {
        /*
        Asagidaki multi dimensional array'in ic array'lerindeki tum elemanlarin toplamini birer birer bulan
        ve herbir sonucu yeni bir array'in elemani yapan ve yeni array'i ekrana yazdiran bir program yaziniz
        Ornek; {{1,2,3}, {4,5}, {6, 7} } ==> 1 + 2 + 3 = 6 4+5=9 6+7=13 ==> output: (6, 9, 13)
        */

        //---------------
        Integer[] array1 = {1, 3, 5, 7, 9, 11, 13};
        String[] array2 = {"ali", "veli", "huseyin", "can", "omer"};
        Double[] array3 = {1.0, 2.4, 6.5, 8.7, 5.6, 4.3, 7.8, 9.8};

        Object[][] arrays = {array1, array2, array3}; // burda array degerlerinin degiskenleri wrpper turde olmali
        System.out.println(Arrays.deepToString(arrays));
        // [[1, 3, 5, 7, 9, 11, 13], [ali, veli, huseyin, can, omer], [1.0, 2.4, 6.5, 8.7, 5.6, 4.3, 7.8, 9.8]]
        //---------------

        int[][] arrays1 = {{1,2,3}, {4,5}, {6, 7}};
        int[]yeniArrays = new int[arrays1.length];
        int toplam = 0;
        for (int i = 0; i < arrays1.length; i++) {
            for (int w : arrays1[i]){
                toplam += w;
            }
            yeniArrays[i]=toplam;
            toplam=0;
        }

        }
}
