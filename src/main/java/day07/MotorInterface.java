package day07;

public interface MotorInterface {
    // motorun gucunu getirir
    double getGuc();

    //motoru calistir
    void calistir();

    //motoru durdur
    void durdur();

    //motorun durumunu kontrol eder
    boolean durumKontrol();
}
