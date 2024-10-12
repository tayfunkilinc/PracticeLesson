package interviewDay01;

public class C02interviewQuestion {
    public static void main(String[] args) {
        /*
     Java'da 2 degisken nasıl değiştirilir?
     How to swap 2 variables in Java?
     */
        //1.yol
        int a = 6;
        int b = 10;
        a = a+b;
        b = a-b;
        a=  a-b;
        System.out.println("a:" + a);
        System.out.println("b:" + b);

        //2.yol  XQR ile cozmus
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
