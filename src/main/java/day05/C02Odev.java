package day05;

public class C02Odev {
    public static void main(String[] args) {
        /*
        6.Soru -Verilen String bir array'de en uzun ve en kisa String'leri yazdıran bir method olusturun
        */
        String isimler[]={"veli","ali","furkan","hasan","huseyin"};
        enUzunVeEnKisa(isimler);
    }
    public static void enUzunVeEnKisa(String[] isimler){
        String min = isimler[0];
        String max = isimler[0];
        for (String w : isimler){
            if (max.length() < w.length()) {
                max = w;
            }
            if (min.length() > w.length()){
                min = w;
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
