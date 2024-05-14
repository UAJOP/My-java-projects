import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        int sayi;
//        while (true) {
//            System.out.print("Lütfen bir sayı giriniz: ");
//            sayi = scanner.nextInt();
//
//            if (sayi > 0) {
//                int kare = sayi * sayi;
//                System.out.println("Girilen sayının karesi: " + kare);
//                break;
//            } else {
//                System.out.println("Lütfen pozitif bir sayı giriniz.");
//            }
//        }

        double bakiye = 1000;
        while (true){
            System.out.println("İŞLEM SEÇİNİZ");
            System.out.println("1 = Para ekle!");
            System.out.println("2 = PARA ÇEK!");
            System.out.println("3 = ÇIK!");
            int islem = scanner.nextInt();
            switch (islem){
                case 1:
                    System.out.println("Eklemek istediğiniz tutar ?");
                    double yatirilan = scanner.nextDouble();
                    bakiye = bakiye + yatirilan;
                    System.out.println("YENİ BAKİYENİZ =" + bakiye);
                    break;
                case 2:
                    System.out.println("Çekmek istediğiniz tutar ?");
                    double cekilen = scanner.nextDouble();
                    if (cekilen > bakiye){
                        System.out.println("KARDEŞİM BAKİYEN YETERSİZ !!!");
                    }
                    else {
                        bakiye = bakiye - cekilen;
                        System.out.println("YENİ BAKİYENİZ =" + bakiye);
                    }
                    break;
                case 3:
                    System.out.println("PROGRAMDAN ÇIKIŞ YAPILIYOR!!");
                    System.exit(0);
                default:
                    System.out.println("GEÇERLİ BİR İŞLEM SEÇİNİZ !!!!");
            }
        }


    }
}
