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


        //En kucuk ve En buyk Terimi Bul
        //1.YOL
        Integer minTerm = fibbonacciList.get(0);
        Integer maxTerm = fibbonacciList.get(0);

        for (int i = 0; i < count; i++) {
            if (fibbonacciList.get(i) < minTerm){
                minTerm = fibbonacciList.get(i);
            }
            if(fibbonacciList.get(i) > maxTerm){
                maxTerm = fibbonacciList.get(i);
            }
        }

        //2.YOL
        int minTerm2 = fibbonacciList.get(0);
        int maxTerm2 = fibbonacciList.get(0);
        for (int w : fibbonacciList) {
            if (w > maxTerm2){
                maxTerm2 = w;
            }
            if (minTerm2 > w){
                minTerm2 = w;
            }
        }
        System.out.println("minTerm2 = " + minTerm2);
        System.out.println("maxTerm2 = " + maxTerm2);

    }
}


