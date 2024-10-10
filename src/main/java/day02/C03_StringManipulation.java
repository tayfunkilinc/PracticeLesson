package day02;


import java.util.Scanner;

public class C03_StringManipulation {
    public static void main(String[] args) {
          /*
    Kullanicidan email adresini girmesini isteyin,
    mail @gmail.com icermiyorsa "Lutfen gmail adresi giriniz",
    @gmail.com ile bitiyorsa "Email adresiniz kaydedildi "
    @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
    odev!! bosluk karakteri varsada hata mesaji verin
*/
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen E mail Adresi Giriniz");

        String email = input.nextLine(); // next line boşluklarıda kabul ediyor
        //next() olarak yapabiliriz fakat kullanıcı hatalı girerse örneğin boşluk girerse next()
        //bu işi çözemez o nedenle nextLine() kullanmalıyız
        System.out.println("email= "+ email);

        if(!email.contains("@gmail.com")){
            System.out.println("Lütfen gmail adresinizi giriniz");
        }
        else if(email.endsWith("@gmail.com")) {
            System.out.println("Email Adresiniz Kaydedildi");
        }
        else {
            System.out.println("Lütfen Yazımı Kontrol Ediniz");
        }

    }
}
