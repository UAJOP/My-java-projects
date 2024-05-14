public class Zombi extends Karakter{
    public Zombi(){
        super("Zombi");
        this.setCan(60);
        this.setOran(20);
        this.setHasar(20);
        this.setSavunma(40);
    }

    @Override
    public void move() {
        System.out.println("Agh, Zombi Bacağini sürüye sürüye geliyor!");
    }
}
