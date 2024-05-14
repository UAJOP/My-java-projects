public class UzayGemisi extends OyunObjesi implements Parcalanabilir,HaraketEdebilir{
    private int hiz;
    public UzayGemisi(int x, int y) {
        super(x, y);
    }
    @Override
    public void parcalanma() {
        System.out.println("BOOM! Oldun!");
    }
    @Override
    public void hareketEt() {
        System.out.println("FIYUV! hareket ediliyor!");
    }
    public void atesEt(){
        System.out.println("Pew pew pew");
    }
    public int getHiz() {
        return hiz;
    }

    public void setHiz(int hiz) {
        this.hiz = hiz;
    }



}
