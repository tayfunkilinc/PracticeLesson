package day06.inheritance;

public class Child extends Parent{ // burda extend diye bir sey daha var buna dikkat miras aldiran extends keywordudur.

    int yas = 5 ;
    public static String isim = "Veli";
    public void method4(){
        System.out.println("Child method4  --> " + this.yas);
    }

    public static void main(String[] args) {
        System.out.println(isim); //Ali ustteki Veli kodu olmadan Ali yazar sonrasinda Veli Yazar. 5. satira dikkat et ora olmasa direk parenttakine ulasirdik
        System.out.println(Parent.isim); //Ali
        method1();// Parent classtaki static method1 //Parent extends edilmeseydi Parent.method1(); olarak kodu guncellememiz gerekliydi.

        Parent p =new Parent();
        System.out.println(p.yas); //22

        Child c = new Child();
        System.out.println(c.yas); //5 // Child kendi degerini yazdi

        Parent parent = new Child(); // constructor i Child yaparak Parent tipinde nesne olusturduk
        System.out.println(parent.yas); //22 //nesne hangi turdeyse ona ulasim saglar

        parent.method4(); //Child method4  --> 5
        p.method4(); //Parent classtaki intance method4
    }

}
