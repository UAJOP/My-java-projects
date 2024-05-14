public class kedi extends  hayvan {
    public kedi(String isim,int yas){
        super(isim, yas);
        System.out.println("Kedinin ismi :"+this.isim);

    }
    @Override
    public void hareket(){
        System.out.println("KEDİ YÜRÜYOR");
    }


}
