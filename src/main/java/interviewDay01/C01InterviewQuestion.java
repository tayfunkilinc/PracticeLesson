package interviewDay01;

import java.util.Scanner;

public class C01InterviewQuestion {
    public static void main(String[] args) {
        /*How to convert Fahrenheit  to Celsius Program in java */
        // javada fahrenhit nasil celcius`a cevrilir

        double derece;
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Fahrenhit Cinsinden Dereceyi Giriniz");
        derece = input.nextDouble();
        derece = (derece -32)*5/9;
        System.out.println("Celsius cinsinden derece: " + derece);


    }
}
