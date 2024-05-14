import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // public static --tip--- methotIsmi (--parametreler--) { .... }
        /*int sayi = toplamaYap(10,9);
        System.out.println(sayi);*/
        /*Scanner sc = new Scanner(System.in);
        System.out.println(toplamaYap(sc.nextInt(), sc.nextInt()));
        ekranaYaz("Merhaba");*/
        /*int sayi = sayiAl();
        String isim = isimAl();
        System.out.println("Sayi : " + sayi + "\nIsim : "+isim);*/
        //Soru : Verilen bir sayının asal olup olmadığını bulan bir metot yazınız.
        // Sayı mainde alınacak sonuç mainde yazılacak.
        /*int sayi = sayiAl();
        boolean sonuc = asalBul(sayi);
        if(sonuc) System.out.println("Asaldir");
        else System.out.println("Asal degil!");*/
        // 150 - 190 arası asal sayılar.
        for (int i = 150; i < 190; i++) {
            if(asalBul(i)) System.out.println(i);
        }
    }

    private static boolean asalBul(int sayi) {
        if(sayi < 2) return false;
        for (int i = 2; i < sayi; i++) {
            if(sayi % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static String isimAl() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir isim gir :");
        return  sc.nextLine();
    }

    private static int sayiAl() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayi gir :");
        return  sc.nextInt();
    }

    private static int toplamaYap(int x, int y) {
        return x+y;
    }

    private static void ekranaYaz(String s) {
        System.out.println(s);
    }


}
