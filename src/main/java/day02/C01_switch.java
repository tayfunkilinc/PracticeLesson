package day02;

import java.util.Scanner;

public class Co1_switch {
    public static void main(String[] args) {
        //Toplama, Çıkarma, Çarpma, Bölme , kalan Hesaplama ve us alma
        // 2 sayi işlem yapan basit bir Hesap Makinesi oluşturun:
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfrn İşlem Operatörünü Giriniz:\n çarpma: * \n bölme: / \n toplama: + \n çıkartma: - \n üst alma: ^ \n Modu: % \n");

        char operator = input.next().charAt(0); //burda

        switch (operator){
            case '+':
                System.out.println("Lütfen Toplamak İstediğiniz 2 Sayıyı Girin: ");
                System.out.println("Sayıların Toplamı: "+ (input.nextDouble() + input.nextDouble()));
        break;
            case '-':
                System.out.println("Lütfen Çıkartmak İstediğiniz 2 Sayıyı Girin: ");
                System.out.println("Sayıların Çıkarımı: "+ (input.nextDouble() - input.nextDouble()));
        break;
            case '*':
                System.out.println("Lütfen Çarpmak İstediğiniz 2 Sayıyı Girin: ");
                System.out.println("Sayıların Çarpımı: "+ (input.nextDouble() * input.nextDouble()));
        break;
            case '/':
                System.out.println("Lütfen Bölmek İstediğiniz 2 Sayıyı Girin: ");
                System.out.println("Sayıların Bölümü: "+ (input.nextDouble() / input.nextDouble()));
                //ödev: paydanın 0 olması durumunu kontrol altına alın
        break;
                case '%':
                System.out.println("Lütfen Modunu İstediğiniz 2 Sayıyı Girin: ");
                System.out.println("Sayıların Modu: "+ (input.nextDouble() % input.nextDouble()));
                //ödev: ikinci sayının 0 olması durumunu kontrol altına alın
        break;
            case '^':
                System.out.println("Lütfen Üst Almak İstediğiniz 2 Sayıyı Girin: ");
                System.out.println("Sayıların Kuvvetleri: "+ Math.pow(input.nextDouble(), input.nextDouble()));
        break;
                //ödev: üst alma işlemini for ile yapın
            default:
                System.out.println("Lütfen Geçerli Oparatör Girin: ");
        break;
        }
        System.out.println("Bizi Tercih Ettiğiniz İçin Teşekkürler");
    }
}
