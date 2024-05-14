public class Vampir extends Karakter{
    public Vampir() {
        super("Vampir");
        this.setCan(100);
        this.setOran(35);
        this.setHasar(65);
        this.setSavunma(30);
    }

    @Override
    public int atak() {
        int vurulanHasar = super.atak();
        double canYenileme = vurulanHasar*0.07;
        int canMiktari = (getCan()+(int)canYenileme);
        if(canMiktari > 100) canMiktari = 100;
        setCan(canMiktari);
        return vurulanHasar;
    }

    @Override
    public void move() {
        System.out.println("Vampir belirdi!");
    }
}














