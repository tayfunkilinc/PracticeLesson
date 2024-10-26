package day07;

public class Araba implements FrenInterface, MotorInterface, SaseInterface {
    // interfaceleri nerede kullaniyoruz
    //genelde hali hazirda bulunan interfaceleri kullaniyoruz
    @Override
    public boolean isAbs() {
        return false;
    }

    @Override
    public String getYagDurumu() {
        return "Motorun Yagi Max tadir";
    }

    @Override
    public void servoFrenUygulama() {
        System.out.println("Araba Normal Freden Yaklasik 5 Kat Daha Iyi Fren Uyguluyor");
    }

    @Override
    public void motorFreniUygula() {
        System.out.println("Normal Firen Kullanilamadigi icin Motor Freni Uygulaniyor");
    }

    @Override
    public double getGuc() {
        return 2.0;
    }

    @Override
    public void calistir() {
        System.out.println("Motor Calistirilmistir");
    }

    @Override
    public void durdur() {
        System.out.println("Motor Durudurulmustur");
    }

    @Override
    public boolean durumKontrol() {
        return true;
    }

    @Override
    public String getBoyaTuru() {
        return "Sase Metalik Gri Boye Ile Kaplidir";
    }

    @Override
    public String getKabortaTuru() {
        return "steysin";
    }

    @Override
    public boolean farCalisiyorMu() {
        return true;
    }

    @Override
    public boolean sunRoofVarMi() {
        return true;
    }
}
