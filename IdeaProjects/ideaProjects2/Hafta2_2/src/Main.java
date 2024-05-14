import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);

        System.out.println("Bir sayi giriniz : ");
        int sayi = sc.nextInt();
        System.out.println("Sayiniz : " + sayi);

        System.out.println("Isim giriniz : ");
        sc.nextLine();// hata verdiği için düzeltme kodu
        String isim = sc.nextLine();
        System.out.println("Isim : " + isim);*/

        // Örn : Girilen ödev (%20), arasınav (%35) ve final(%45)
        // notlarına göre ortalama hesaplayıp oartalamyı ve uygun harf notunu
        // ekrana yazdıran bir java uyg. yazınız.

        Scanner sc = new Scanner(System.in);
        System.out.println("Odev notunu gir : ");
        int odev = sc.nextInt();
        System.out.println("Arasinav notunu gir : ");
        int vize = sc.nextInt();
        System.out.println("Final notunu gir : ");
        int finalNotu = sc.nextInt();

        double ort = odev*0.20 + vize*0.35 +finalNotu*0.45;
        System.out.println("Ortalamaniz : " + ort);
        /*
        if(ort >= 0 && ort < 49.5){
            System.out.println("Harf Notu : FF");
        }
        if (ort >= 49.5 && ort < 59.5){
            System.out.println("Harf Notu : FD");
        }
        if (ort >= 59.5 && ort < 64.5){
            System.out.println("Harf Notu : DD");
        }
        if (ort >= 64.5 && ort < 69.5){
            System.out.println("Harf Notu : DC");
        }
        if (ort >= 69.5 && ort < 74.5){
            System.out.println("Harf Notu : CC");
        }
        if (ort >= 74.5 && ort < 79.5){
            System.out.println("Harf Notu : CB");
        }
        if (ort >= 79.5 && ort < 84.5){
            System.out.println("Harf Notu : BB");
        }
        if (ort >= 84.5 && ort < 89.5){
            System.out.println("Harf Notu : BA");
        }
        if (ort >= 89.5 && ort <= 100){
            System.out.println("Harf Notu : AA");
        }*/
        if(ort < 49.5) System.out.println("Harf Notu : FF");
        // Tek bir komut (;) olduğu sürece {-} parantezlerine ihtiyacınız yok.
        else if(ort < 59.5){
            System.out.println("Harf Notu : FD");
        }
        else if(ort < 64.5){
            System.out.println("Harf Notu : DD");
        }
        else if(ort < 69.5){
            System.out.println("Harf Notu : DC");
        }
        else if(ort < 74.5){
            System.out.println("Harf Notu : CC");
        }
        else if(ort < 79.5){
            System.out.println("Harf Notu : CB");
        }
        else if(ort < 84.5){
            System.out.println("Harf Notu : BB");
        }
        else if(ort < 89.5){
            System.out.println("Harf Notu : BA");
        }
        else{
            System.out.println("Harf Notu : AA");
        }

    }
}










