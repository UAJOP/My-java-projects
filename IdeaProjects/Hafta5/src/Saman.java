public class Saman extends Karakter{
    public Saman() {
        super("Saman");
        this.setCan(120);
        this.setHasar(20);
        this.setOran(15);
        this.setSavunma(65);
    }
    @Override
    public int blok() {
        int blokDegeri = super.blok();
        int canYenile = (int) (getCan()*0.1);
        int canMiktari = getCan() + canYenile;
        if(canMiktari > 120) canMiktari = 120;
        setCan(canMiktari);
        return blokDegeri;
    }

    @Override
    public void move() {
        System.out.println("Yuruyerek gelen bir Saman var!");
    }
}







