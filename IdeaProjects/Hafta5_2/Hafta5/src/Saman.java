public class Saman extends Karakter{
    public Saman() {
        super("Saman");
        this.setCan(120);
        this.setOran(15);
        this.setHasar(35);
        this.setSavunma(70);
    }

    @Override
    public void move() {
        System.out.println("Karsidan yuruyerek bir Saman geliyor!");
    }

    @Override
    public int blok() {
        int blokDegeri = super.blok();
        double canYenileme = getCan()*0.1;
        int canMiktari = getCan() + (int)canYenileme;
        if(canMiktari > 120) canMiktari = 120;
        setCan(canMiktari);
        return blokDegeri;
    }
}








