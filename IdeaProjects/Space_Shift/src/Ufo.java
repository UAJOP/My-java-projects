public class Ufo extends Oyun implements HareketEdebilir{
    private int can;
    public Ufo(int x, int y, int can) {
        super(x, y);
        this.can = can;
    }

    public int getCan() {
        return can;
    }

    public void setCan(int can) {
        this.can = can;
    }

    @Override
    public void hareketEt() {
        System.out.println(" UFO hareket ediyor");
    }
}
