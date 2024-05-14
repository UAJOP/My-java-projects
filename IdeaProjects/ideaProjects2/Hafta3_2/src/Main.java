import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bakiye = 1000;
        int secim = 0;

        while (secim != 4) {
            System.out.println("Banka Otomasyonu Menüsü");
            System.out.println("1. Hesap Bilgilerini Görüntüle");
            System.out.println("2. Para Yatırma");
            System.out.println("3. Para Çekme");
            System.out.println("4. Çıkış");
            System.out.print("Lütfen bir seçim yapınız: ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Hesap bilgileri görüntüleniyor...");
                    System.out.println("Mevcut bakiye: " + bakiye + " TL");
                    break;
                case 2:
                    System.out.print("Yatırmak istediğiniz miktarı girin: ");
                    int yatirilanMiktar = scanner.nextInt();
                    bakiye += yatirilanMiktar;
                    System.out.println(yatirilanMiktar + " TL yatırıldı. Yeni bakiye: " + bakiye + " TL");
                    break;
                case 3:
                    System.out.println("Para çekme işlemi...");
                    break;
                case 4:
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
            }
        }

        System.out.println("Banka otomasyonundan çıkıldı.");
        scanner.close();
    }
}
