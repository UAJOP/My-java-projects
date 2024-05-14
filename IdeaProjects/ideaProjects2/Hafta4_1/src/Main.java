import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Örnek ::: Kullanıcıdan alınan 10 pozitif tam sayının ortalamasını
        hesaplayan bir uyg. yazalım.
         */
        Scanner sc = new Scanner(System.in);
        /*
        int toplam = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Pozitif bir tam sayi giriniz : ");
            int sayi = sc.nextInt();
            if(sayi > 0) {
                toplam += sayi;
            }
            else{
                System.out.println("Pozitif sayi giriniz !!!!");
                i--;
            }
        }
        System.out.println("Ortalama : " + toplam/10.0);*/

        //While ile;
        /*
        int sayac = 0;
        int  toplam = 0;
        while (sayac < 10){
            System.out.println("pozitif bir tam sayi giriniz :");
            int sayi = sc.nextInt();
            if(sayi > 0){
                toplam += sayi;
                sayac++;
            }
            else{
                System.out.println("Pozitif bir sayi giriniz!!!");
            }
        }
        System.out.println("Ortalama : " + toplam/10.0);*/

        /*
        Örnek ::: Kullanıcı negatif sayı girene kadar girilen tüm sayıların
        ortalamasını hesaplayan bir uyg. yazalım.
         */

        int toplam = 0;
        int sayac = 0;

        while (true){ // for (int i = 0; i >= 0; i++) for ile de yapılabilir.
            System.out.println("Tam sayi giriniz :");
            int sayi = sc.nextInt();
            if(sayi < 0){ // negatif sayı girildiğinde
                System.out.println("Ortalama : "+ 1.0*toplam/sayac);
                break;
            }
            else{// pozitif sayı girildiğinde
                toplam += sayi;
                sayac++;
            }
        }







    }
}
