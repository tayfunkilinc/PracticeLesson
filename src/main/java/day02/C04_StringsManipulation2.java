package day02;

public class C04_StringsManipulation2 {
    public static void main(String[] args) {
            /*
Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri
hariç 3 isimdeki karakter sayısının toplamını yazdırınız.
*/
        String isim1 = "Ali Can";
        String isim2 = "Ömer Faruk Can";
        String isim3 = "Veli Can";

        isim1 = isim1.replace(" ","");
        System.out.println("isim 1: "+ isim1);

        isim2 = isim2.replace(" ","");
        System.out.println("isim 2: "+ isim2);

        isim3 = isim3.replace(" ","");
        System.out.println("isim 3: "+ isim1);

        int length1= isim1.length();
        int length2= isim2.length();
        int length3= isim3.length();

        System.out.println("Toplam: " + (length1+length2+length3));

    }
}
