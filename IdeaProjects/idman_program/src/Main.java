import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("İdman Programına Hoş Geldiniz !!");
        String idmanlar = "Geçerli Hareketler...\n" +
                "Burpee\n" +
                "Pushup\n" +
                "Situp\n" +
                "Squat";
        System.out.println(idmanlar);
        System.out.println("Bir İdman Oluşturun...");
        System.out.println("Burpee Sayısı");
        int burpee = scanner.nextInt();
        System.out.println("Pushup Sayısı");
        int pushup = scanner.nextInt();
        System.out.println("Situp Sayısı");
        int situp = scanner.nextInt();
        System.out.println("Squat Sayısı");
        int squat = scanner.nextInt();

        scanner.nextLine();

        idman idman =new idman(burpee,pushup,situp,squat);
        System.out.println("İdmanınız Başlıyor...");

        while (!idman.idmanBittiMi())

        {
            System.out.println("Hareket Türü(Burpee,Pushup,Situp,Squat) : ");
            String tur = scanner.nextLine();
            System.out.println("Bu haraketten kaç tane yapacaksınız ? : ");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            idman.hareketYap(tur, sayi);
        }


        System.out.println("İdmanını Başarıyla Tamamladın ! Tebrikler Program Sonlanıyor..........");
      }

    }
