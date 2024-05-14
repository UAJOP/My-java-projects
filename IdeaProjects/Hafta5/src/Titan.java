public class Titan extends Karakter {
    public Titan() {
        super("Titan");
        this.setCan(200);
        this.setHasar(10);
        this.setOran(10);
        this.setSavunma(60);
    }
    @Override
    public void move() {
        System.out.println("Titan saldiriyor!");
    }
}
