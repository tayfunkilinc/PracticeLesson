package interviewDay01;

public class C03interviewQuestion {
    public static void main(String[] args) {
        //Find the Largest Number in Java Program
        int a= 160;
        int b=160;
        int c=25;
        if (a>b && a>c) {
            System.out.println("En Buyuk: " + a);
        }
        else if (b>a && b>c) {
            System.out.println("En Buyuk: " + b);
        }
        else if (c>a && c>b) {
            System.out.println("En Buyuk: " + c);
        }
        else {
            System.out.println("Bu Sayilardan Ayni Olanlar Var");
        }


    }
}
