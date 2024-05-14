import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        oyunaBasla();

    }

    private static void oyunaBasla() {
        System.out.println("1 - oyuna başla");
        System.out.println("2 - çıkış");
        Scanner sc = new Scanner(System.in);
        int secim = sc.nextInt();
        switch (secim){
            case 1:
                oyun();
                break;
            case 2:
                System.out.println("ÇIKIŞ YAPIYORUM....");
                return;
            default:
                System.out.println("YANLIŞ DĞEER!!1");
        }

    }

    private static void oyun() {
        Random r = new Random();

        int userZar1 = r.nextInt(1,7);
        System.out.println("Kullanıcının 1. zarı :" + userZar1);

        int userZar2 = r.nextInt(1,7);
        System.out.println("Kullanıcının 2. zarı :" + userZar2);

        int pcZar1 = r.nextInt(1,7);
        System.out.println("Bilgisayarın 1. zarı :" + pcZar1);

        int pcZar2 = r.nextInt(1,7);
        System.out.println("Bilgisayarın 2. zarı :" + pcZar2);

            if (userZar2+userZar1 > pcZar2+pcZar1){
                System.out.println("KAZANDINIZZ!!!");
            } else if (pcZar1+pcZar1 > userZar2+userZar1) {
                System.out.println("KAYBETTİNİZ");
            }
            else {
                System.out.println("BERABERE SOLDA AKP GİBİ AĞLAYABİLİRSİNİZ :)");
            }


    }




}


