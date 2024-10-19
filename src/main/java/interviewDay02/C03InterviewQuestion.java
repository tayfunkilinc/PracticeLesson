package interviewDay02;

import java.util.ArrayList;
import java.util.Scanner;

public class C03InterviewQuestion {
    public static void main(String[] args) {
   /* Kullanıcıdan bir pozitif tam sayı alın. Bu sayı, Fibonacci dizisinin kaç terimini üreteceğinizi belirleyecek.
      Fibonacci dizisini hesaplayın ve dizinin elemanlarını ekrana yazdırın.
      Fibonacci dizisinin toplamını hesaplayın ve ekrana yazdırın.
     Fibonacci dizisindeki en büyük terimi ve en küçük terimi bulun ve bunları ekrana yazdırın.//Ödev!!!
   */
        Scanner input=new Scanner(System.in);
        System.out.println("Kaç fibonacci terimi üreteceksiniz");
        int count= input.nextInt();
        //Fibonacci dizisi, 0 ve 1 ile başlar ve sonraki terimler, önceki iki terimin toplamı olarak hesaplanır.
        ArrayList<Integer>fibbonacciList=new ArrayList<>();
        //ilk iki terimi ekleyelim
        fibbonacciList.add(0);//1.sayi //0. index
        fibbonacciList.add(1);//2.sayi //1. index

        //fibbonici dizisini olusturalım
        for (int i = 2; i <count ; i++) {
            int nextTerim=fibbonacciList.get(i-1)+fibbonacciList.get(i-2);
            fibbonacciList.add(nextTerim);
        }
        //fibbonici dizisini yazdıralım
        System.out.println(fibbonacciList);

        //fibbonici dizisinin toplamını bulalım
        int sum=0;
        for (int num:fibbonacciList
             ) {
            sum+=num;
        }
        System.out.println("toplam : "+sum);
    }
}


