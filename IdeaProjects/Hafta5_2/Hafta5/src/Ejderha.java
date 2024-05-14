public class Ejderha extends Karakter{
    public Ejderha(){
        super("Ejderha");
        this.setCan(350);
        this.setOran(30);
        this.setHasar(60);
        this.setSavunma(50);
    }

    @Override
    public void move() {
        System.out.println("Üüfff, Ejderha uçarak ateş saçıyor!");
    }

    //!Ejderha canı azalınca Kritik atacak

    @Override
    public int atak() {
        int vurulanHasar = super.atak();
        if(getCan()> 100 && getCan() < 200) {
            vurulanHasar = (int)(vurulanHasar * 1.5);
            System.out.println("Ejderha Delirdi!");

        }else if(getCan() < 100){
            vurulanHasar = (int)(vurulanHasar * 2.0);
            System.out.println("Ejderha Cildiriyor!");
        }
        return vurulanHasar;
    }
}
