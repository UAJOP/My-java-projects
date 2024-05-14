import java.util.Random;
public class oyun {
    int pistUzunlugu =100;
    Random rnd = new Random();
    public  void  oyunuBaslat(){
        tavsan t =  new tavsan("ÖZGÜR");
        kaplumbaga k = new kaplumbaga("SABRİ");
        while (true){
            t.kos(zarAt());
            k.kos(zarAt());
            if(t.konum >= 100 && k.konum >=100){
                System.out.println("BERABERE!");
                return;
            } else if (t.konum >= 100) {
                System.out.println("TAVŞAN KAZANDI");
                break;

            } else if (k.konum >=100) {
                System.out.println("KAPLUMBAĞA KAZANDI");

            }
            else {
                System.out.println("Tavsanın konumu :" +t.konum);
            System.out.println("Kaplumbağanın konumu :" +k.konum);
            }

        }


    }

    public int zarAt(){
        return rnd.nextInt(6)+1;
    }
}
