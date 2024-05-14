public class Kaya extends OyunObjesi implements Parcalanabilir{
    private int hacim;
    public Kaya(int x, int y) {
        super(x, y);
    }
    @Override
    public void parcalanma() {
        System.out.println("PUUFF! Toz bulutuna donustu!!");
    }
    public int getHacim() {
        return hacim;
    }

    public void setHacim(int hacim) {
        this.hacim = hacim;
    }


}
