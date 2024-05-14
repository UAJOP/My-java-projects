import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        for (Başlangıç değeri - sayaç; koşul; sayaç arttırma) {
        ... kodlar ...
        }
         */
       /* for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        for (int i = 10; i > 5; i--) {
            System.out.println("Hello");
        }
        */
        //Çift Sayılar :
        for (int i = 0; i < 100; i += 2/*i++*/) {
            // Birinci Yöntem :
            //if (i % 2 == 0) System.out.println(i);
            /*
            İkinci Yöntem :
            System.out.println(i);
            i++;
             */
            //Üçüncü yöntem :
            //System.out.println(i);
        }
        // Tek sayılar : ????
        // Örnek : Kullanıcdan alınan sayının asal olup olmadığını
        // bulan bir java uyg. yazalım
        // Asal Sayı : Sadece 1'e ve kendisine tam bölünür.
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayi gir :");
        int sayi = sc.nextInt();
*/
        // 1. yöntem
        /*
        int bolenSayisi = 0;
        for (int i = 1; i <= sayi; i++) {
            if (isayi% == 0) {
                bolenSayisi++;
            }
        }

        if(bolenSayisi == 2) System.out.println(sayi + " asaldir!");
        if(bolenSayisi != 2) System.out.println(sayi + " asal degildir!");
        */
        //2. yöntem
        /*
        boolean kontrol = true;
        for (int i = 2; i < sayi; i++) {
            if(sayi % i == 0) kontrol = false;
        }
        if(kontrol) System.out.println(sayi + " asaldir!");
        else System.out.println(sayi + " asal degildir!");
         */
        // 10 ile 150 arasındaki asal olan sayıları ekrana yazdıran
        // bir java uyg. yazalım.
/*
        for (int sayi = 10; sayi <= 150; sayi++) {
            boolean kontrol = true;
            for (int i = 2; i < sayi; i++) {
                if(sayi % i == 0) kontrol = false;
            }
            if(kontrol) System.out.println(sayi + " asaldir!");
        }
*/





    }
}
