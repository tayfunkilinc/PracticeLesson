package day04;

import java.util.Arrays;

public class C03Arrays {
    public static void main(String[] args) {
        //3.soru Verilen arrayin tum elemanlarini bir soldaki konuma tasiyacakbir program yazin.
        // Ornek; array (1,2,3,4,5) ise output (2,3,4,5,1) olacak
        int[] array = {1,2,3,4,5,6,7,8};

        int temp = array[0];
        //ne zaman for ne zaman for each döngüsü kullanılır dikkat eleman sayısı değişmeyecekse for each kullanılır
        for (int i = 0; i <array.length-1 ; i++) {
            array[i] = array[i+1];
            System.out.println(Arrays.toString(array));
        }
        array[array.length-1] = temp;
        System.out.println(Arrays.toString(array));


    }
}
