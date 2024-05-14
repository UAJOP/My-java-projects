public class Titan extends Karakter{
    public Titan() {
        super("Titan");
        this.setCan(200);
        this.setOran(10);
        this.setHasar(15);
        this.setSavunma(70);
    }

    @Override
    public void move() {
        System.out.println("Dikkat edin! Titan Saldiriyor!");
    }

}
