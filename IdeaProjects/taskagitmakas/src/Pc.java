import java.util.Random;

public class Pc {
    public String isim;
    public int puan;
    public Random rnd = new Random();
    public Pc(String isim){
        this.isim = isim;
        this.puan = 0;
    }
    public int oyna(){
        int sonuc = rnd.nextInt(3);
        if (sonuc == 0)
            System.out.println(this.isim+"Taş seçti");
        else if (sonuc == 1)
            System.out.println(this.isim + "Kağıt seçti");
        else
            System.out.println(this.isim+"Makas seçti");

        return sonuc;


    }

}
