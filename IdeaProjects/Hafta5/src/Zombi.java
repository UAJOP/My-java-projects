public class Zombi extends Karakter{
    public Zombi() {
        super("Zombi");
        this.setCan(60);
        this.setHasar(25);
        this.setOran(20);
        this.setSavunma(40);
    }

    @Override
    public void move() {
        System.out.println("Zombi surunerek geliyor!");
    }
}
