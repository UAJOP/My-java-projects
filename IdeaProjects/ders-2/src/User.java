import java.util.Scanner;

public class User {

    public String isim;
    public int puan;
    public Scanner scanner = new Scanner(System.in);
    public User(String isim){
        this.isim = isim;
        this.puan = 0;
    }

    public int oyna(){
        int sonuc = 7;
        while (sonuc <0 || sonuc >2) {
            System.out.println("0 - TAS\n" +
                    "1 - KAGIT\n" +
                    "2 - MAKAS\n" +
                    "Lutfen birini seciniz :");
            sonuc = scanner.nextInt();
            if(sonuc <0 || sonuc >2)
                System.out.println("Yanlıs deger");

        }
        if(sonuc== 0)
            System.out.println(this.isim+" Tas secti");
        else if (sonuc== 1)
            System.out.println(this.isim+" KAGIT secti");
        else
            System.out.println(this.isim+" MAKAS secti");

        return sonuc;

    }
}
