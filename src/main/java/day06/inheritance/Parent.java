package day06.inheritance;

public class Parent {
        /*
        - isim ve soyisim static değişkenleri oluşturalım.
        - method1 ve method2 static method'ları oluşturalım.
        - yas isimli bir instance variable oluşturalım.
        - method3 ve method4 isimli instance method'lar oluşturalım.
        - Oluşturduğumuz değişken ve method'ları, Child class'tan inheritance yaparak çağıralım.
        - bir parametreli birde parametresiz iki tane cons ekleyin
    */
    public static String isim= "Ali";
    public static String soyIsim = "Can";

    public static void method1(){
        System.out.println("Parent classtaki static method1");
    }
    public static void method2(){
        System.out.println("Parent classtaki static method2");
    }
    public int yas =22; // intance static olmayan demektir buda intance bir degisken

    public void method3(){
        System.out.println("Parent classtaki intance method3");
    }
    public void method4(){
        System.out.println("Parent classtaki intance method4");
    }

    public Parent() {
    }
    //static obje olusturmayi gerektirmez class ismi ile calistirilir
    // bu sebeple constructor icine sadece intace variablellar eklenir

    public Parent(int yas) {
        this.yas = yas;
    }
}
