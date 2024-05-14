import java.util.Random;

public class Karakter {
    private String isim;
    private int can;
    private int oran;
    private int hasar;
    private int savunma;
    private int level;
    public Karakter(String isim) {
        this.isim = isim;
        this.level = 1;
    }
    public void move(){}
    public int atak(){
        Random r = new Random();
        int vurulanHasar = r.nextInt(getHasar()/2,getHasar());
        if(r.nextInt(100) < getOran()){
            System.out.println(this.isim+" kritik vurdu");
            vurulanHasar = vurulanHasar*2;
        }
        return vurulanHasar;
    }
    public int blok(){
        Random r= new Random();
        int blokDegeri = r.nextInt(getSavunma()/3,getSavunma());
        return blokDegeri;
    }
    public void levelUp() {}

    public int getCan() {
        return can;
    }

    public void setCan(int can) {
        this.can = can;
    }

    public int getOran() {
        return oran;
    }

    public void setOran(int oran) {
        this.oran = oran;
    }

    public int getHasar() {
        return hasar;
    }

    public void setHasar(int hasar) {
        if(hasar > 0 && hasar <= 100)
            this.hasar = hasar;
        else
            this.hasar = 0;
    }

    public int getSavunma() {
        return savunma;
    }

    public void setSavunma(int savunma) {
        this.savunma = savunma;
    }

    public int getLevel() {
        return level;
    }

    public void addLevel() {
        this.level++;
    }
}



