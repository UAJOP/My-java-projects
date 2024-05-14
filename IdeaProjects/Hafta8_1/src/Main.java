import java.util.Random;
import java.util.Scanner;

public class Main {

    static int userScore = 0;
    static int pcScore = 0;

    public static void main(String[] args) {
        menuGoster();
    }

    private static void menuGoster() {
        Scanner sc = new Scanner(System.in);
        System.out.println("TAS - KAGIT - MAKAS");
        System.out.println("***Oyununa Hosgeldiniz***");
        while (true){
            System.out.println("1 - Oyna\n" +
                    "2 - Skor Gor\n" +
                    "3 - Cikis\n" +
                    "Lutfen bir secim yapiniz :");
            int islem = sc.nextInt();
            switch (islem){
                case 1:
                    oyunuOyna();
                    break;
                case 2:
                    skorGoster();
                    break;
                case 3:
                    System.out.println("Cikis yapiliyor...");
                    return;
                default:
                    System.out.println("Yanlis deger girdiniz !!!");
            }
        }
    }

    private static void skorGoster() {
        System.out.println("Kullanici = "+userScore);
        System.out.println("Bilgisayar = "+pcScore);
    }

    private static void oyunuOyna() {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        String[] ogeler = {"TAS","KAGIT","MAKAS"};
        int userSecim;
        do {
            System.out.println("1 - TAS\n" +
                    "2 - KAGIT\n" +
                    "3 - MAKAS\n" +
                    "birisini seciniz :");
            userSecim = sc.nextInt();
            if(userSecim == 1 || userSecim == 2 || userSecim == 3) break;
            else System.out.println("Yanlis deger!");
        }while (true);
        /*
        if(userSecim == 1) System.out.println("Kullanici : TAS");
        else if(userSecim == 2) System.out.println("Kullanici : KAGIT");
        else System.out.println("Kullanici : MAKAS");
        //Bu şekilde yapilabilir.
         */
        System.out.println("Kullanici : " + ogeler[userSecim-1] + " secti!");
        int pcSecim = r.nextInt(1,4);// 1,2,3 degerleri geriye gelsin
        System.out.println("Bilgisayar : " + ogeler[pcSecim-1] + " secti!");
        sonucGoster(userSecim,pcSecim);
    }

    private static void sonucGoster(int userSecim, int pcSecim) {
        if(userSecim == pcSecim){
            System.out.println("Berabere!!!!!!");
        }
        else if((userSecim == 1 && pcSecim == 3) || (userSecim == 2 && pcSecim == 1) ||
                (userSecim == 3 && pcSecim == 2)){
            System.out.println("Kullanici kazandi!!!");
            userScore++;
        }
        else {
            System.out.println("Bilgisayar kazandi!!!");
            pcScore++;
        }
    }
}








