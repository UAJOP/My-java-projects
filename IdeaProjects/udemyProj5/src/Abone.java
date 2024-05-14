import javax.swing.*;

//Doğalgaz abonesi
public class Abone {


    public String isim;

    public int bakiye;

    public String sehir;

    public void dogalgaz_kullan(int miktar) {
        if (this.bakiye - miktar < 0) {
            System.out.println("Yetersiz Bakiye...");
        }
        else {
            this.bakiye -=miktar;
            if (this.bakiye <= 0) {
                System.out.println("Bakiyeniz bitmiştir.Lütfen en yakın abone merkezine giderek kredi yükleyin.Kredi limiti = 120TL");

            }
            else {
                System.out.println("Yeni Bakiye :"+ bakiye);
            }
        }
    }

    public void bakiye_ogren(){
        System.out.println("Bakiye =" + bakiye);

    }



}
