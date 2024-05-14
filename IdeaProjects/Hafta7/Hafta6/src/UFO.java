public class UFO extends OyunObjesi implements HaraketEdebilir{
    private int can;
    public UFO(int x, int y) {
        super(x, y);
    }
    @Override
    public void hareketEt() {
        System.out.println("UFO Hareket ediyor!");
    }
    public int getCan() {
        return can;
    }

    public void setCan(int can) {
        this.can = can;
    }


}
