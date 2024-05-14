import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] isimler = new String[30];
        String[] soyisimler = new String[30];
        double[] vizeler = new double[30];
        double[] odev = new double[30];
        double[] finals = new  double[30];
        double[] ortalamalar = new double[30];
        int kullaniciSayisi = 0;

        while (true){
            System.out.println("1- ÖĞRENCİ EKLE \n" +
                    "2- ÖĞRENCİ GÖRÜNTÜLE \n" +
                    "3- ZEKİLERİ GÖRÜNTÜLE \n" +
                    "4- SINIF ORTALAMASINI GÖRÜNTÜLE \n" +
                    "5- ÇIKIŞ \n" +
                    "LÜTFEN İŞLEM SEÇİNİZ :");
                    int secim = sc.nextInt();
                    sc.nextLine();
            switch (secim){
                case 1:
                    if (kullaniciSayisi >= 30){
                        System.out.println("MAXİMUM KAPASİTEYE ULAŞTI !!");
                    }
                    System.out.println("İsim Giriniz :");
                    isimler[kullaniciSayisi] = sc.nextLine();

                    System.out.println("Soyisim Giriniz :");
                    soyisimler[kullaniciSayisi] = sc.nextLine();


                    System.out.println("Ödev Notu Giriniz :");
                    odev[kullaniciSayisi] = sc.nextDouble();

                    System.out.println("Vize Notu Giriniz :");
                    vizeler[kullaniciSayisi] = sc.nextDouble();

                    System.out.println("Final Notu Giriniz :");
                    finals[kullaniciSayisi] = sc.nextDouble();
                    double odevOran = 0.25;
                    double vizeOran = 0.30;
                    double finalOran = 0.45;

                    ortalamalar[kullaniciSayisi] = (odev[kullaniciSayisi] * odevOran) + (vizeler[kullaniciSayisi] * vizeOran) + (finals[kullaniciSayisi] * finalOran);
                    kullaniciSayisi++;
                    break;
                case 2:
                    for (int i = 0; i<kullaniciSayisi;i++){
                        System.out.println(isimler[i] + " - " + soyisimler[i] + " - \n" +
                                "Odev notu :" + odev[i] + " - \n" +
                                "Vize notu :"+ vizeler[i]+" - \n" +
                                "Final notu :"+ finals[i]+" - \n" +
                                "Ortalaması :"+ ortalamalar[i]);
                    }
                    break;
                case 3:
                    double sinifOrtalamaa = 0;
                    for (int i = 0; i < kullaniciSayisi; i++) {
                        sinifOrtalamaa += ortalamalar[i];
                    }
                    sinifOrtalamaa /= kullaniciSayisi;
                    System.out.println("Sınıf Ortalaması: " + sinifOrtalamaa);

                    System.out.println("Sınıf Ortalamasından Yüksek Not Alan Öğrenciler:");
                    for (int i = 0; i < kullaniciSayisi; i++) {
                        if (ortalamalar[i] > sinifOrtalamaa) {
                            System.out.println(isimler[i] + " " + soyisimler[i] + " - Ortalama: " + ortalamalar[i]);
                        }
                    }

                    break;
                case 4:

                    double sinifOrtalama = 0;
                    for (int i = 0; i < kullaniciSayisi; i++) {
                        sinifOrtalama += ortalamalar[i];
                    }
                    sinifOrtalama /= kullaniciSayisi;
                    System.out.println("Sınıf Ortalaması: " + sinifOrtalama);

                    break;
                case 5:
                    System.out.println("PROGRAMDAN ÇIKILIYOR........");
                    return;
                default:
                    System.out.println("YANLIŞ DEĞER GİRDİNİZ !!!");
            }
        }

    }
}