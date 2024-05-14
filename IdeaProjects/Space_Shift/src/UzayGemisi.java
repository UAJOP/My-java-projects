public class UzayGemisi extends Oyun implements  Parcalanabilir,HareketEdebilir
{
    private  int hiz;
    public UzayGemisi(int x, int y) {
        super(x, y);
    }
    public void  atesEt(){
        System.out.println("peo peo peo");
    }

    public int getHiz() {
        return hiz;
    }

    public void setHiz(int hiz) {
        this.hiz = hiz;
    }

    @Override
    public void parcalanma() {
        System.out.println("BOOM ! öldün");

    }

    @Override
    public void hareketEt() {
        System.out.println("fiuuuuuuu hareket ediyor");

    }
}