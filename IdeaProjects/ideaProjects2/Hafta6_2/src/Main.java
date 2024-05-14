import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Soru :
        -* sayıları aldığımız metot, --> sayiAl
        -* işlemi aldığımız metot, --> menü gibi bir yapı olacak
        -* sayılara işlemi uyguladığımız metot
        olacak şekilde çalışan bir hesap makinesi uyg. yazalım.
         5 girdi  10 girdi  + girdi = 15 hesaplandı
         */
        int x = sayiAl();
        int y = sayiAl();
        String islem = islemAl();
        double sonuc = hesapla(x,y,islem);
        System.out.println("Sonuc : "+sonuc);





        /*
        Soru : (Diziler)
        -* kullanıcıdan 10 adet tam sayıyı alan bir metot,
        -* bu sayıları küçükten büyüğe sıralayan bir metot,
        -* bu sıralanmış sayıları ekrana küçükten büyüğe yazdıran
        bir metot,
        içeren bir java uyg. yazalım.
        */
        /*
        //Cevap :
        int[] sayilar = sayilariAl();
        sirala(sayilar);
        ekranaYaz(sayilar);
        */
    }

    private static double hesapla(int x, int y, String islem) {
        switch (islem){
            case "+":
                return x+y;
            case "-":
                return x-y;
            case "*":
                return x*y;
            case "/":
                return ((double)x)/y;
            default:
                System.out.println("Yanlis islem");
                return 0;
        }
    }

    private static String islemAl() {
        Scanner sc = new Scanner(System.in);
        System.out.println("/// BIR ISLEM GIR :::: +,-,*,/ ::::///");
        return sc.nextLine();
    }

    private static int sayiAl() {
        Scanner sc = new Scanner(System.in);
        System.out.println("/// BIR SAYI GIR ///");
        return sc.nextInt();
    }

    private static void ekranaYaz(int[] sayilar) {
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(sayilar[i]);
        }
    }

    private static void sirala(int[] sayilar) {
        for (int i = 0; i < sayilar.length-1; i++) {
            for (int j = i+1; j < sayilar.length; j++) {
                if(sayilar[i] > sayilar[j]){
                    int t = sayilar[i];
                    sayilar[i] = sayilar[j];
                    sayilar[j] = t;
                }
            }
        }
    }

    private static int[] sayilariAl() {
        Scanner sc = new Scanner(System.in);
        int[] dizi = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Sayi gir :");
            dizi[i] = sc.nextInt();
        }
        return dizi;
    }
}








