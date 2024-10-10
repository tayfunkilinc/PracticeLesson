package day05;

public class C01Odev {
    public static void main(String[] args) {
  /*        *******
            *
            *
            *******
            *
            *
            *******
  */
        int satir =5;

        for (int bulsatir = 1; bulsatir <= satir; bulsatir++) {
            if (bulsatir ==1 || bulsatir==satir/2+1 || bulsatir==satir) {
                for (int i = 1; i <= satir; i++) {
                    System.out.print("x");
                }
            }
            else {
                System.out.print("x");
            }
            System.out.println();
        }

    }
}
