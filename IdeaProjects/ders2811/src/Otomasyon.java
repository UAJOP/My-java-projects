import java.util.ArrayList;
import java.util.Scanner;

public class Otomasyon {
    ArrayList<Musteri> musteriListID = new ArrayList<>();
    private int id = 1000;
    Scanner sc = new Scanner(System.in);
    public void baslat(){
        while (true){
            System.out.println("1- Müşteri Ekle \n" +
                    "2- Müşteri Sil \n" +
                    "3- Müşteri Ara \n" +
                    "4- Müşteri Göster \n" +
                    "5- Çıkış \n" +
                    "Lütfen Seçim Yapınız :");
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
                    System.out.println("Yanlış değer girdiniz!");
            }
        }
    }

    private void musteriGoster() {
        for (int i = 0; i < musteriListID.size(); i++) {
            System.out.println("Müşteri İsmi :"+musteriListID.get(i).isimSoyisim);
            System.out.println("Müşter Id :" +musteriListID.get(i).id);

        }
    }

    private void musteriAra() {
        System.out.println("İsim Giriniz :");
        String isim = sc.nextLine();
        for (int i = 0; i < musteriListID.size(); i++) {
            if (musteriListID.get(i).isimSoyisim.contains(isim)){
                System.out.println("Müşteri İsmi :"+musteriListID.get(i).isimSoyisim);
                System.out.println("Müşter Id :" +musteriListID.get(i).id);

            }

        }
    }

    private void musteriSil() {
        System.out.println("Silmek İstediğiniz Muşterinin ID'sini Giriniz :");
        int silinecekID = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < musteriListID.size(); i++) {
            if (musteriListID.get(i).id == silinecekID){
                musteriListID.remove(i);
                System.out.println("Müşteri Silindi!");
                return;
            }
        }
        System.out.println("ID BULUNAMADI !");
    }

    private void musteriEkle() {
        System.out.println("İsim ve Soyisim giriniz :");
        musteriListID.add(new Musteri(id++,sc.nextLine()));
    }

}
