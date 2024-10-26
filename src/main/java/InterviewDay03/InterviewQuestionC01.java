package InterviewDay03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InterviewQuestionC01 {
    public static void main(String[] args) {
        /*Kullanıcıdan bir pozitif tamsayı alın.
                Bu sayıya kadar olan sayılardan asal sayıları bulmak için bir döngü kullanın.
                Bulduğunuz asal sayıları bir diziye veya listeye kaydedin.
                Programın sonunda, asal sayıları ve toplam asal sayı miktarını yazdırın.
                Ek olarak, asal sayılar arasındaki en büyük asal sayıyı da belirleyin ve yazdırın.*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Bir Pozitif Tam Sayi Giriniz");
        int sayi = input.nextInt();

        if (sayi <= 2){
            asalSayi(sayi);
        } else if (sayi == 1) {
            System.out.println("1 Asal Sayi Degil");
        }else {
            System.out.println("Lutfen Gecerli Bir Sayi Giriniz");
        }
    }

    private static void asalSayi(int sayi) {
        List<Integer> asalSayi = new ArrayList<>();
        int sayac =0; // kendinden ve 1'den baska kac tane boleni var bunu sayiyyor
        for (int i = 2; i < sayi; i++) { // baslangictan girilen sayiya kadar calisacak
            for (int j = 0; j < i; j++) { // sayinin carpanlarini kontrol edecek
                if ( i % j == 0){ // tam bolenlerin tamamini almamizi saglar
                    sayac++;
                }
            }
            if (sayac == 0){
                asalSayi.add(i);
            }
            sayac=0;
        }
        System.out.println(asalSayi);
        System.out.println("" + asalSayi.size());
        System.out.println("listedeki en buyuk asal sayi" + asalSayi.get(asalSayi.size()-1));
    }
}
