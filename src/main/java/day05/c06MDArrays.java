package day05;

public class c06MDArrays {
    public static void main(String[] args) {
        /*
        Verilen bir multi dimensional array'in
        her arrayini ayri ayri ele alarak inner indexindeki
        indexindeki elementlerinin ortalamasından
        büyük elementleri yazdıran bir kod yazınız.
         */
        int sayilar[][] = {{8, 57, 37}, {99, 88, 11}, {32, 34, 15, 12}, {2, 3, 5, 1}};
        int toplam = 0;
        double ort = 0;
        for (int[] a : sayilar) {
            for (int w : a) { // ortalama bulmak icin eleman toplamini bulduk
                toplam += w;
            }
            ort = toplam / a.length;
            System.out.println("Bu Array Ort: " + ort);
            for (int w : a) {//kontrol icin olusturduk
                if (ort < w) {
                    System.out.println(w + " Bu sayi ortalamadan Buyuktur");
                }
            }
            toplam = 0;
            System.out.println("Siradaki Arraye Gecildi");
        }
    }
}
