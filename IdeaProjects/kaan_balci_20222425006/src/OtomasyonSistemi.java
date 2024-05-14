import java.util.ArrayList;
import java.util.Scanner;

public class OtomasyonSistemi {
    private ArrayList<Musteri> musteriler;
    private ArrayList<Calisan> calisanlar;

    // Constructor
    public OtomasyonSistemi() {
        this.musteriler = new ArrayList<>();
        this.calisanlar = new ArrayList<>();
    }
    public void sistemiBaslat() {
        Scanner scanner = new Scanner(System.in);
        int secim;

        do {
            System.out.println("\n*** Otomasyon Sistemi Menüsü ***");
            System.out.println("1. Müşteri Ekle");
            System.out.println("2. Çalışan Ekle");
            System.out.println("3. Müşteri Ara");
            System.out.println("4. Çalışan Ara");
            System.out.println("5. Müşteri Sil");
            System.out.println("6. Çalışan Sil");
            System.out.println("7. Tüm Müşterileri Göster");
            System.out.println("8. Tüm Çalışanları Göster");
            System.out.println("0. Çıkış");
            System.out.print("Bir seçenek girin: ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    musteriEkle();
                    break;
                case 2:
                    calisanEkle();
                    break;
                case 3:
                    musteriAra();
                    break;
                case 4:
                    calisanAra();
                    break;
                case 5:
                    musteriSil();
                    break;
                case 6:
                    calisanSil();
                    break;
                case 7:
                    musterileriGoster();
                    break;
                case 8:
                    calisanlariGoster();
                    break;
                case 0:
                    System.out.println("Sistemden çıkılıyor. İyi günler!");
                    break;
                default:
                    System.out.println("Geçersiz seçenek. Lütfen geçerli bir seçenek girin.");
            }
        } while (secim != 0);
    }

    private void musteriEkle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Müşteri adını girin: ");
        String ad = scanner.nextLine();
        System.out.print("Müşteri soyadını girin: ");
        String soyad = scanner.nextLine();
        System.out.print("Müşteri doğum tarihini girin: ");
        String dogumTarihi = scanner.nextLine();

        Musteri musteri = new Musteri(ad, soyad, dogumTarihi);
        musteriler.add(musteri);
        System.out.println("Müşteri başarıyla eklendi.");
    }

    private void calisanEkle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Çalışan adını girin: ");
        String ad = scanner.nextLine();
        System.out.print("Çalışan soyadını girin: ");
        String soyad = scanner.nextLine();
        System.out.print("Çalışan doğum tarihini girin: ");
        String dogumTarihi = scanner.nextLine();
        System.out.print("Çalışan maaşını girin: ");
        int maas = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Çalışanın departmanını girin: ");
        String departman = scanner.nextLine();

        Calisan calisan = new Calisan(ad, soyad, dogumTarihi, maas, departman);
        calisanlar.add(calisan);
        System.out.println("Çalışan başarıyla eklendi.");
    }

    private void musteriAra() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Aranacak müşteri adını girin: ");
        String arananAd = scanner.nextLine();

        for (Musteri musteri : musteriler) {
            if (musteri.getAd().equalsIgnoreCase(arananAd) ||
                    musteri.getSoyad().equalsIgnoreCase(arananAd)) {
                musteri.bilgiGoster();
                return;
            }
        }

        System.out.println("Verilen isme sahip müşteri bulunamadı.");
    }

    private void calisanAra() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Aranacak çalışan adını girin: ");
        String arananAd = scanner.nextLine();
        for (Calisan calisan : calisanlar) {
            if (calisan.getAd().equalsIgnoreCase(arananAd) ||
                    calisan.getSoyad().equalsIgnoreCase(arananAd)) {
                calisan.bilgiGoster();
                return;
            }
        }

        System.out.println("Verilen isme sahip çalışan bulunamadı.");
    }

    private void musteriSil() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Silinecek müşteri adını girin: ");
        String silinecekAd = scanner.nextLine();

        musteriler.removeIf(musteri ->
                musteri.getAd().equalsIgnoreCase(silinecekAd) ||
                        musteri.getSoyad().equalsIgnoreCase(silinecekAd));

        System.out.println("Müşteri başarıyla silindi.");
    }

    private void calisanSil() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Silinecek çalışan adını girin: ");
        String silinecekAd = scanner.nextLine();

        calisanlar.removeIf(calisan ->
                calisan.getAd().equalsIgnoreCase(silinecekAd) ||
                        calisan.getSoyad().equalsIgnoreCase(silinecekAd));

        System.out.println("Çalışan başarıyla silindi.");
    }

    private void musterileriGoster() {
        if (musteriler.isEmpty()) {
            System.out.println("Mevcut müşteri yok.");
        } else {
            System.out.println("\n*** Tüm Müşteriler ***");
            for (Musteri musteri : musteriler) {
                musteri.bilgiGoster();
                System.out.println("---------------------");
            }
        }
    }

    private void calisanlariGoster() {
        if (calisanlar.isEmpty()) {
            System.out.println("Mevcut çalışan yok.");
        } else {
            System.out.println("\n*** Tüm Çalışanlar ***");
            for (Calisan calisan : calisanlar) {
                calisan.bilgiGoster();
                System.out.println("---------------------");
            }
        }
    }

}

