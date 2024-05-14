import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rnd = new Random();
/*
        for (int i = 0; i < 10; i++) {
            int rastgeleSayi = rnd.nextInt(10);
            System.out.println(rastgeleSayi);
        }
*/
        /*
        int sayi = rnd.nextInt(10,18);
        System.out.println(sayi);
        */
        //Aynı işlemi yapan 2. bir yol :
        /*
        int ustSinir = 18;
        int altSinir = 10;
        int x = altSinir + rnd.nextInt(ustSinir-altSinir);
        System.out.println(x);*/

        // %60 ihtimalle kazandığınız bir oyun var. Jetonu atıp bekliyorsunuz.
        /*
        int sonuc = rnd.nextInt(100);
        if(sonuc < 60) {
            System.out.println("Kazandiniz!");
        }
        else {
            System.out.println("Kaybettiniz !!!");
        }
         */
/*
        // % 65 ihtimal ile dersi geçecek şekilde bir not tanımlayınız.

        int sonuc = rnd.nextInt(100);
        if(sonuc < 65) System.out.println("Gectiniz!");
        else System.out.println("kaldiniz!");

        // 65 üzeri geçer not ise ???
        int not = rnd.nextInt(101);
        System.out.println("Ogrenci notu : " + not);
        if (not < 65) System.out.println("Kaldi!");
        else System.out.println("Gecti");
*/

        // Kullanıcı ve PC ikişer zar atıyor. Toplam değeri büyük olan kazanıyor.
        // Bunu sağlayacak bir örnek uygulama yazalım.
        // Bir skor tablosu oluşturmak sizin ödeviniz.

        oyunaBasla();


    }

    private static void oyunaBasla() {
        //menü, genel bilgiler ve oyunun başlaması
        Scanner sc = new Scanner(System.in);
        while (true) {
            // sout içerisinde skor göstersin : Örnek : Kullanici : 2 - PC : 1
            System.out.println("1 - Oyunu Oyna\n2 - Cikis");
            int islem = sc.nextInt();
            switch (islem) {
                case 1:
                    oyunOyna();
                    break;
                case 2:
                    System.out.println("Oyun sonlaniyor!!!");
                    return;
                default:
                    System.out.println("Yanlis deger!");
            }
        }
    }
    private static void oyunOyna() {
        // oyunun temel mekaniği
        Random r = new Random();
        int userZar1 = r.nextInt(1,7);
        System.out.println("Kullanicinin birinci zari : "+userZar1);
        int userZar2 = r.nextInt(1,7);
        System.out.println("Kullanicinin ikinci zari : "+userZar2);
        int pcZar1 = r.nextInt(1,7);
        System.out.println("PC birinci zari : "+pcZar1);
        int pcZar2 = r.nextInt(1,7);
        System.out.println("PC ikinci zari : "+pcZar2);
        if((userZar1+userZar2) > (pcZar1+pcZar2)){
            System.out.println("Kullanici kazandi!");
        }
        else if((userZar1+userZar2) < (pcZar1+pcZar2)){
            System.out.println("PC kazandi");
        }
        else {
            System.out.println("Berabere!");
        }
    }
}
