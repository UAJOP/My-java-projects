public class Vampir extends Karakter{
    public Vampir() {
        super("Vampir");
        this.setCan(100);
        this.setHasar(65);
        this.setOran(30);
        this.setSavunma(40);
    }
    @Override
    public void move() {
        System.out.println("Vampir belirdi!");
    }
    @Override
    public int atak() {
        int vurulanHasar = super.atak();
        double canYenile = vurulanHasar*0.07;
        int canMiktari = getCan() + (int)canYenile;
        if(canMiktari > 100) canMiktari = 100;
        setCan(canMiktari);
        return vurulanHasar;
    }
}









