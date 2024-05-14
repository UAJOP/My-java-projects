import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        i. "rastgeleSayilarUret" isimli bir metotta 250 ile 750 arasında olacak şekilde
        100 adet sayı üretip bu sayıları maine geri gönderen,
        ii. "asalOrtalamaBul" isimli metotta oluşturulmuş 100 sayıdan asal olanlarının
        ortalamasını bulup maine geri gönderen,
        iii. "ekranaYaz" isimli metotta asal sayıların ortalamasından büyük sayıları
        ekrana yazdıran bir java uyg. yazınız.
         */
        int[] sayilar = rastgeleSayilarUret();
        double ortalama = asalOrtalamaBul(sayilar);
        System.out.println("Asal ort : "+ortalama);
        ekranaYaz(sayilar,ortalama);


        int sayi=5;
        int sayi2 = 6;
        System.out.println(sayi + sayi2 +": :" + sayi + sayi2);
    }

    private static void ekranaYaz(int[] sayilar, double ortalama) {
        for (int i = 0; i < sayilar.length; i++) {
            if(sayilar[i] >= ortalama) System.out.println(sayilar[i]);
        }
    }

    private st0atic int[] rastgeleSayilarUret() {
        int[] dizi = new int[100];
        Random r = new Random();
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = r.nextInt(250,750);
        }
        return dizi;
    }





    private static double asalOrtalamaBul(int[] sayilar) {
        int asalSayisi = 0;
        int toplam = 0;
        for (int i = 0; i < sayilar.length; i++) {
            if(asalBul(sayilar[i])) {
                asalSayisi++;
                toplam += sayilar[i];
            }
        }
        if(asalSayisi == 0) return 0;
        double ort = 1.0*toplam/asalSayisi;
        return ort;
    }
    private static boolean asalBul(int sayi) {
        if(sayi < 2) return false;
        for (int i = 2; i < sayi; i++) {
            if(sayi % i == 0) return false;
        }
        return true;
    }

}










