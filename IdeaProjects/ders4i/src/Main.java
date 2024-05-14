import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] calisanIsimler = new String[5];
        String [] calisanSoyisimler = new String[5];
        int [] calisanMaas = new int[5];
        int kullaniciSayisi = 0;

        while (true){
            System.out.println("1- Kullanıcı Giriniz : \n" +
                    "2- Kullanıcıları Görün : \n" +
                    "3- Kullanıcıya Zam Yap : \n" +
                    "4- Çıkış");
            int secim = sc.nextInt();
            sc.nextLine();
            switch (secim) {
                case 1:
                    if (kullaniciSayisi >= 5){
                        System.out.println("MAXİMUM KAPASİTEYE ULAŞTI !!");
                    }
                        System.out.println("İsim Giriniz :");
                        calisanIsimler[kullaniciSayisi] = sc.nextLine();

                        System.out.println("Soyisim Giriniz :");
                        calisanSoyisimler[kullaniciSayisi] = sc.nextLine();


                        System.out.println("Maaş Giriniz :");
                        calisanMaas[kullaniciSayisi]  = sc.nextInt();
                        kullaniciSayisi++;

                    break;
                case 2:

                    for (int i = 0; i<kullaniciSayisi;i++){
                        System.out.println(calisanIsimler[i] + " - " + calisanSoyisimler[i] + " - " + calisanMaas[i] );
                    }
                    break;

                case 3:
                    System.out.println("% Giriniz :");
                    int miktar = sc.nextInt();
                    for (int i =0; i < kullaniciSayisi; i++){
                        calisanMaas[i] += calisanMaas[i] * miktar/100 ;

                    }
                    System.out.println("MAAŞ GÜNCELLENDİ ! Yeni maaş = ");
                    break;

                case 4:
                    System.out.println("...............PROGRAM SONLANIYORRR...............");
                    return;

                default:
                    System.out.println("YANLIŞ BİR DEĞER GİRDİNİZ !!!");
            }
        }
    }
}