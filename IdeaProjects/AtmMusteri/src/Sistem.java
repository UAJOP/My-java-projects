import java.util.Random;
import java.util.Scanner;

public class Sistem {
    Musteri[] musteriler;
    int musteriSayisi;


    public void baslat(){
        musteriler = new Musteri[100];
        musteriSayisi = 0;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("""
                    1- Üye Ol
                    2- Giriş Yap
                    3- Çıkış
                    Bir seçim yapınız :""");
            int secim = sc.nextInt();
            switch (secim){
                case 1:
                    uyeOl();
                    break;
                case 2:
                    girisYap();
                    break;
                case 3:
                    System.out.println("Çıkış yapılıyor....");
                    return;
                default:
                    System.out.println("Yanlış seçim!");
                        

            }
        }
    }



    private void girisYap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ID giriniz :");
        int girilenId = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < musteriSayisi; i++) {
            if (musteriler[i].mnumara== girilenId) {
                System.out.println("Şifre Giriniz :");
                String girilenSifre = sc.nextLine();
                if (musteriler[i].sifreKontrol(girilenSifre)){
                    islemYap(musteriler[i]);
                }
                else {
                    System.out.println("Yanlış şifre");
                }
                return;
            }
        }
        System.out.println("Yanlış Id böyle bir müşteri yok!");
    }

    private void islemYap(Musteri m) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("""
                    1- Para Çek
                    2- Para ekle
                    3- Bilgi Göster
                    4- Çıkış
                    işlem seçiniz :
                    """);
            int islem = sc.nextInt();
            switch (islem){
                case 1:
                    System.out.println("Miktar giriniz :");
                    int miktar = sc.nextInt();
                    m.bakiyeAzalt(miktar);
                    break;
                case 2:
                    System.out.println("Miktar giriniz :");
                    miktar = sc.nextInt();
                    m.bakiyeEkle(miktar);
                    break;
                case 3:
                    m.bilgiGoster();
                    break;
                case 4:
                    System.out.println("Çıkış yapılıyor....");
                    return;
                default:
                    System.out.println("YANLIŞ DEĞER GİRDİNİZ !");

            }
        }

    }

    private void uyeOl() {
        Random r = new Random();
        while (true) {
            int mnumara = r.nextInt(1000, 10000);
            if (mnumaraKontrolEt(mnumara)) {
                musteriler[musteriSayisi] = new Musteri(mnumara);
                musteriSayisi++;
                break;
            }
        }
    }

    private boolean mnumaraKontrolEt(int mnumara) {
        for (int i = 0; i < musteriSayisi; i++) {
            if (musteriler[i].mnumara == mnumara) return false;
        }
        return true;
    }
}
