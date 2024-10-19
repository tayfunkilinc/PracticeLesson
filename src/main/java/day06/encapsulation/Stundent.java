package day06.encapsulation; // burada nokta ile yazilan yer farkli bir packega gectigini soyluyor
//ic ice pakcege oldugunu belirtiyor

public class Stundent {
//encapsulation : data hiding olarak da adlandirilir veri gizlemek anlamina gelir
            /*
        bir class oluşturalım.
        private access modifiera sahip variablelar oluşturun: isim, soyisim, yas seklinde
        parametreli ve parametresiz constructor oluşturun
        toString metodunu oluşturun
        */
    //private = gizli , protected = ev , default= oda(sadece ayni package icinden erisim) , public = kutuphane
    private String isim; // bu ornegin instance variable dir
    private  String soyIsim;
    private byte yas ;
    //static class a ait ve class ismi ile cagrilan yapilardir -- bunlar genelde yardimci class larda kullanilirlar
    //noArgument constructor parametresiz constructor


    public String getIsim() {
        return isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public byte getYas() {
        return yas;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public void setYas(byte yas) {
        if (yas < 0) {
            System.out.println("Yas Degeri Negatif Olamaz");
        }else{ // burda else eklemmessek - olan degerleri atardi
            this.yas = yas;
        }
    }

    public Stundent() {
    }

    public Stundent(String isim, String soyIsim, byte yas) { // bu constructor bize hizli deger atamayi saglar
        //allargument constructor olusturuldu
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.yas = yas;
    }

    @Override
    public String toString() { // bu ise hizli gorunttuleme saglar burda ekrana yazdi
        return "Ogrenci{" +
                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", yas=" + yas +
                '}';
    }
}
