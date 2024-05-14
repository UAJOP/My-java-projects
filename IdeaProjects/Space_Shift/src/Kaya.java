public class Kaya extends  Oyun implements  Parcalanabilir{
    private int hacim;

    public Kaya(int x, int y, int hacim) {
        super(x, y);
        this.hacim = hacim;
    }

    public int getHacim() {
        return hacim;
    }

    public void setHacim(int hacim) {
        this.hacim = hacim;
    }

    @Override
    public void parcalanma() {
        System.out.println("Puff! TOZ bulutuna dçnüştü");
    }
}
