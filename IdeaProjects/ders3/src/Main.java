import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        int toplam = 0;
//        int sayac = 0;
//
//        System.out.println("Lütfen 10 adet pozitif tam sayı giriniz:");
//
//        while (sayac < 10) {
//
//            int girilen = scanner.nextInt();
//            System.out.println("Lütfen 10 adet pozitif tam sayı giriniz:");
//            if (girilen > 0) {
//                toplam += girilen;
//                sayac++;
//            } else {
//                System.out.println("Lütfen pozitif bir sayı giriniz.");
//            }
//        }
//
//        float ortalama = (float) toplam / 10;
//        System.out.println("Girilen sayıların ortalaması: " + ortalama);


//        Scanner scanner = new Scanner(System.in);
//        int toplam = 0;
//        double sayac = 0;
//        for (int i = 0; i >= 0; i++) {
//            System.out.println("Pozitif tam sayı giriniz :");
//            int sayi = scanner.nextInt();
//            if (sayi >= 0) {
//                toplam += sayi;
//                sayac++;
//            } else {
//                System.out.println("KARDEŞİM - Yİ GİRME DEDİM SANA POZİTİF DEDİM YÜRÜME ÜSTÜME BIÇKIN DELİKANLI !");
//                break;
//            }
//        }
//        System.out.println("ORTALAMA = " + toplam/sayac);

//        Scanner scanner = new Scanner(System.in);
//        int toplam = 0;
//        System.out.println("KARDEŞİM KAÇ SAYI İLE İŞLEM YAPALIM !");
//        int sayaç = scanner.nextInt();
//
//        int[] dizi = new int[sayaç];
//
//        for (int i = 0; i <dizi.length; i++) {
//            System.out.println("Pozitif tam sayı giriniz :");
//            dizi[i] = scanner.nextInt();
//            toplam +=dizi[i];
//        }
//        double ort = toplam/10.0;
//        System.out.println("ORTALAMA =" + ort);
//        for (int i =0;i<dizi.length;i++){
//            if (dizi[i] > ort){
//                System.out.println("ortalamadan yüksek olan sayılar !");
//                System.out.println(dizi[i]);
//            }
//        }



        Scanner scanner = new Scanner(System.in);

        String[] isimler = new String[10];
        String[] soyisimler = new String[10];
        int[] yaslar = new int[10];
        int kullaniciSayisi = 0;

        while (true) {
            System.out.println("1 - Kullanıcı Ekle");
            System.out.println("2 - Eklenen Kullanıcıları Göster");
            System.out.println("3 - Çıkış");
            System.out.print("Seçiminizi yapın: ");
            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    if (kullaniciSayisi < isimler.length) {
                        System.out.print("İsim girin: ");
                        String isim = scanner.next();
                        System.out.print("Soyisim girin: ");
                        String soyisim = scanner.next();
                        System.out.print("Yaş girin: ");
                        int yas = scanner.nextInt();

                        isimler[kullaniciSayisi] = isim;
                        soyisimler[kullaniciSayisi] = soyisim;
                        yaslar[kullaniciSayisi] = yas;
                        kullaniciSayisi++;
                        System.out.println("Kullanıcı eklendi.");
                    } else {
                        System.out.println("Maksimum kullanıcı sayısına ulaşıldı, yeni kullanıcı eklenemez.");
                    }
                    break;

                case 2:
                    System.out.println("Eklenen Kullanıcılar:");
                    for (int i = 0; i < kullaniciSayisi; i++) {
                        System.out.println("İsim: " + isimler[i] + " Soyisim: " + soyisimler[i] + " Yaş: " + yaslar[i]);
                    }
                    break;

                case 3:
                    System.out.println("Programdan çıkılıyor...");
                    return;

                default:
                    System.out.println("Geçersiz seçim. Tekrar deneyin.");
            }
        }
    }
}
