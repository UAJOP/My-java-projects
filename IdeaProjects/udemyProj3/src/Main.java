import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Çalışanlar programına Hoşgeldiniz....");

        String islemler =  "İşlemler..\n"
                           +"1. Yazılımcı işlemleri \n" +
                            "2. Yönetici işlemleri\n" +
                            "Çıkış için q'ya basın";
        System.out.println("*********************************");
        System.out.println(islemler);
        System.out.println("*********************************");

        while (true){
            System.out.println("İŞLEM SEÇİNİZ :");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("Programdan Çıkılıyor....");
                break;
            }
            else if (islem.equals("1"))
            {
             Yazilimci yazilimci =  new Yazilimci("KAAN","BALCI" , 567 , "Pyhton,C#,Java");
             String yazilimciIslem = "1. Format At \n" +
                                     "2. Bilgileri Göster\n" +
                                     "Çıkış için q'ya basın";
                System.out.println(yazilimciIslem);
             while (true){
                 System.out.println("İŞLEMİ SEÇİNİZ :");
                 String y_islem = scanner.nextLine();
                 if (y_islem.equals("q"))
                 {
                     System.out.println("Yazılımcı işlemlerinden çıkılıyor...");
                     break;
                 }
                 else if (y_islem.equals("1"))
                 {
                     System.out.println("İşletim sistemi :");
                     String isletim_sistemi = scanner.nextLine();
                     yazilimci.formatAt(isletim_sistemi);
                 }
                 else if (y_islem.equals("2"))
                 {
                     yazilimci.bilgileriGoster();
                 }
                 else
                 {
                     System.out.println("GEÇERSİZ YAZILIMCI İŞLEMİ...");
                 }

             }

            }
            else if (islem.equals("2"))
            {
                Yonetici yonetici = new Yonetici("SEHER","GÜVEN",123,10);
                String yonetici_islem = "Yönetici işlemleri\n" +
                                        "1.işlem Zam Yap\n" +
                                        "2. Bilgileri göster\n" +
                                        "Çıkış için q'ya basın";

                System.out.println(yonetici_islem);
                while (true){
                    System.out.println("İŞLEM SEÇİNİZ :");
                    String y_islem = scanner.nextLine();
                    if (y_islem.equals("q"))
                    {
                        System.out.println("Yönetici işlemlerinden çıkılıyor...");
                        break;
                    }
                    else if (y_islem.equals("1"))
                    {
                        System.out.println("Yöneticinin ne kadar zam yapmasını istiyorsunuz :");
                        int zam_miktari = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zam_miktari);
                    }
                    else if (y_islem.equals("2"))
                    {
                        yonetici.bilgileriGoster();
                    }
                    else
                    {
                        System.out.println("GEÇERSİZ YÖNETİCİ İŞLEMİ...");
                    }

                }

            }
            else
            {
                System.out.println("GEÇERSİZ İŞLEM...");
            }
        }




    }
}