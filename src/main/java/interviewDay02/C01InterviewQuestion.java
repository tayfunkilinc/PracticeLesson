package interviewDay02;

public class C01InterviewQuestion {
    public static void main(String[] args) {
        // Bir String'in tum substringlerini bulan kodu yaziniz
        String str = "Java bugun cok guzel";
        int sayac = 0;
        for (int i = 0; i < str.length(); i++) { // baslangic indexini temsil ediyor
            for (int j = 1; j <= str.length()-i; j++) { // bitis indexini temsil ediyor
                System.out.println(str.substring(i, j + i));
                sayac++;
            }
        }
        System.out.println("sayac = " + sayac);


    }
}
