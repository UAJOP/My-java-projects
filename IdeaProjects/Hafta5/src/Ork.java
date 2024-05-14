import java.util.Random;

public class Ork extends Karakter{
    public Ork() {
        super("Ork");
        this.setCan(150);
        this.setHasar(50);
        this.setOran(20);
        this.setSavunma(80);
    }
    @Override
    public void move() {
        System.out.println("Ork uzerine kosuyor!");
    }
    @Override
    public int atak() {
        int hasar = super.atak();
        // yapılcak ekstra özellikler
        return hasar;
    }
    @Override
    public int blok() {
        int blokDegeri  =super.blok();
        // ekstra işlemler
        return blokDegeri;
    }
}





