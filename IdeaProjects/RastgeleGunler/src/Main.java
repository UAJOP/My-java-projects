import java.util.Random;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[] gunler = {"Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"};
        Random rnd = new Random();
        int gunSayisi = rnd.nextInt(1000,10000);
        int baslangicSayisi = rnd.nextInt(7);
        System.out.println("Bugün :"+ gunler[baslangicSayisi]);
        int gunArtisi = (gunSayisi+baslangicSayisi)%7;
        System.out.println("Gün artıs miktari :" + gunArtisi);
        System.out.println("KADAR GÜN SONRA :"+gunler[gunArtisi]);


    }
}
