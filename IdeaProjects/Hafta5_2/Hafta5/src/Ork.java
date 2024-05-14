import java.util.Random;

public class Ork extends Karakter{
    public Ork() {
        super("Ork");
        this.setCan(150);
        this.setOran(20);
        this.setHasar(35);
        this.setSavunma(80);
    }

    @Override
    public int atak() {
        int vurulanHasar= super.atak();
        //özel saldırılar
        return vurulanHasar;
    }

    @Override
    public int blok() {
        int blokDegeri = super.blok();
        //özellikler
        return blokDegeri;
    }

    @Override
    public void move() {
        System.out.println("Ork uzerine kosuyor");
    }
}





