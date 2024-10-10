package day03;

public class C04ForLoop {
    //B ve C Harflerini Çiz
    public static void main(String[] args) {
        /*
         *
         * *
         *****
         *     *
         *       *
         */

        int satir=9;


        for (int bulsatir = 1; bulsatir <=satir ; bulsatir++) {
            for (int bosluk = satir-bulsatir; bosluk >=1 ; bosluk--) {
                System.out.print(" ");
            }
            for (int yildiz = 1; yildiz <= bulsatir*2-1; yildiz++) {
                if (yildiz==1||yildiz==bulsatir*2-1||bulsatir==satir/2+1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------");
/*
        * * * * .
        * * * . .
        * * . . .
        * . . . .
        . . . . .
*/

        int satir1 = 5;
        for (int bulunanSatir = 1; bulunanSatir <= satir1; bulunanSatir++) {
            for (int yildizSayisi = satir1-bulunanSatir; yildizSayisi > 0 ; yildizSayisi--) {
                System.out.print("* ");
            }
            for (int nokta = 1; nokta <= bulunanSatir; nokta++) {
                System.out.print(". ");
            }
            System.out.println();
        }



    }
}
