import java.util.ArrayList;
import java.util.Scanner;

public class Otomasyon {
    ArrayList<Musteri> musteriList = new ArrayList<>();
    private int id = 1000;
    Scanner sc = new Scanner(System.in);
    public void baslat(){

        while (true){

            System.out.println("1 - Musteri Ekle\n" +
                    "2 - Musteri Sil\n" +
                    "3 - Musteri Ara\n" +
                    "4 - Hepsini Goster\n" +
                    "5 - Cikis\n"+
                    "Lutfen secim yapiniz :");
            String islem = sc.nextLine();
            switch (islem){
                case "1":
                    musteriEkle();
                    break;
                case "2":
                    musteriSil();
                    break;
                case "3":
                    musteriAra();
                    break;
                case "4":
                    musteriGoster();
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Yanlis deger girdiniz!");
            }
        }

    }

    private void musteriGoster() {
        for (int i = 0; i < musteriList.size(); i++) {
            System.out.println("Musteri ismi : "+musteriList.get(i).isimSoyisim);
            System.out.println("Musteri ID : "+musteriList.get(i).id);
        }
        musteriList.forEach(System.out::println);
    }

    private void musteriAra() {
        System.out.println("Aramak istediginiz Isim Soyisimi girin :");
        String isim = sc.nextLine();
        for (int i = 0; i < musteriList.size(); i++) {
            if(musteriList.get(i).isimSoyisim.contains(isim)){
                System.out.println("Musteri ismi : "+musteriList.get(i).isimSoyisim);
                System.out.println("Musteri ID : "+musteriList.get(i).id);
            }
        }
    }

    private void musteriSil() {
        System.out.println("Silinecek id degerini girin :");
        int silinecekID = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < musteriList.size(); i++) {
            if(musteriList.get(i).id == silinecekID){
                System.out.println("Silme islemi basarili!");
                musteriList.remove(i);
                return;
            }
        }
        System.out.println("Silinecek ID bulunamadi!");
    }

    private void musteriEkle() {
        System.out.println("Isim soyisim giriniz :");
        musteriList.add(  new Musteri(id++,sc.nextLine())  );
    }
}
