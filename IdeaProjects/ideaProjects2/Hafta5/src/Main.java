import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        5 tane çalışan için isim ve maaş bilgisi alalım.
        bunları ekrana yazdırabilen bir uygulama yazalım.
        bunu bir menü olarak yazalım.
        --Ek : Yönetici olarak isterseniz calisanlariniza zam
        yapabiliyorsunuz. Menüye bunun için bir secim ekleyelim.
        Ör. girilen sayı kadar yüzdede arttırsın. 50 -> %50 zam yapmak.
         */
        Scanner sc = new Scanner(System.in);
        String[] isimler = new String[5];
        int[] maaslar = new int[5];
        int calisanSayisi = 0;
        boolean kontrol = true;
        while (kontrol) {
            System.out.println("1 - Calisan Ekle\n" +
                    "2 - Calisanlari Goster\n" +
                    "3 - Maas Guncelle\n"+
                    "0 - Cikis\n" +
                    "Bir secim yapiniz :");
            int secim = sc.nextInt();
            sc.nextLine();
            switch (secim) {
                case 1:
                    if(calisanSayisi >= 5){
                        System.out.println("Calisan sayisi dolu!");
                    }
                    else{
                        System.out.println("Isim gir :");
                        isimler[calisanSayisi] = sc.nextLine();
                        System.out.println("Maas gir :");
                        maaslar[calisanSayisi] = sc.nextInt();
                        calisanSayisi++;
                    }
                    break;
                case 2:
                    for (int i = 0; i < calisanSayisi; i++) {
                        System.out.println(isimler[i] +" kisinin maasi :"
                                +maaslar[i]);
                    }
                    break;
                case 3 :
                    System.out.println("% miktari giriniz :");
                    int miktar = sc.nextInt();
                    for (int i = 0; i < calisanSayisi; i++) {
                        maaslar[i] += maaslar[i]*miktar/100;
                    }
                    System.out.println("Maaslar guncellendi.");
                    break;
                case 0:
                    System.out.println("Cikis yapiliyor...");
                    kontrol = false;
                    break;
                default:
                    System.out.println("Yanlis deger girdin!!");
            }
        }
    }
}
