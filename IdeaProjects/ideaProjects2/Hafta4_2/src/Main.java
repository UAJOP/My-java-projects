import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Kullanıcıdan alınan 10 tane sayının ortalamsını bulan ve
        ortalamadan büyük olanları ekrana yazdıran bir uyg. yazalım.
         */
        /*
        Scanner sc = new Scanner(System.in);
        int toplam = 0;
        int elemanSayisi = 10;
        //dizi tanımı bu şekilde
        //[] parantezleri önemli atlamayınız. Sağ tarafa sayı vermeniz lazım
        int[] dizi = new int[elemanSayisi];
        for (int i = 0; i < 10; i++) {
            System.out.println("Sayi gir : ");
            dizi[i] = sc.nextInt();
            toplam += dizi[i];
        }
        double ort = toplam/10.0;
        System.out.println("Ortalama : "+ort);
        //ortalamadan büyükler ekrana yazılıyor
        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i] > ort) System.out.println(dizi[i]);
        }

        System.out.println("Dizinin elemanlari :");
        // tüm dizi ekrana yazdırılıyor
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
        }
        */
        /*
        Soru :: Kullanıcıdan alınan maksimum 10 adet isim soyisim ve
        yaş bilgilerini bellekte tutan ve istenildiğinde tüm bilgileri
        ekrana yazdırabilen bir uyg. tasarlayalım.
        1-Kullanıcı Ekle
        2-Kullanıcıları göster
        3-Cikis
         */
        Scanner sc = new Scanner(System.in);
        int[] yaslar = new int[10];
        String[] isimler = new String[10];
        String[] soyisimler = new String[10];
        int kullaniciSayisi = 0;
        boolean kontrol = true;
        while (kontrol){
            System.out.println("1 - Kullanici Ekle\n" +
                    "2 - Kullanicilari Goster\n" +
                    "3 - Cikis\n" +
                    "Lutfen secim yapiniz :");
            int secim = sc.nextInt();
            sc.nextLine();
            switch (secim){
                case 1:
                    if(kullaniciSayisi == 10){
                        System.out.println("Kullanici sinirina ulasildi!");
                        break;
                    }
                    System.out.println("Isim gir :");
                    isimler[kullaniciSayisi] = sc.nextLine();
                    System.out.println("Soyisim gir :");
                    soyisimler[kullaniciSayisi] = sc.nextLine();
                    System.out.println("Yas gir :");
                    yaslar[kullaniciSayisi] = sc.nextInt();
                    kullaniciSayisi++;
                    break;
                case 2:
                    for (int i = 0; i < kullaniciSayisi; i++) {
                        System.out.println(isimler[i] + " - " +
                                soyisimler[i] + " - " + yaslar[i]);
                    }
                    break;
                case 3:
                    kontrol =false;
                    continue;
                default:
                    System.out.println("Yanlis deger!");
            }
        }



    }
}
