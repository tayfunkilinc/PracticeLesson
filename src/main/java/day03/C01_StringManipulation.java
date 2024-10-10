package day03;

public class C01_StringManipulation {
    public static void main(String[] args) {

        //bir string de benzersiz tekrarsiz karekterler yazdirmak icin kod yaziniz

        String str = "Java her zaman guzeldir";
        String bosStr= "";

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                bosStr +=str.charAt(i);

            }
        }
        System.out.println("Sonuc: " + bosStr);

    }
}
