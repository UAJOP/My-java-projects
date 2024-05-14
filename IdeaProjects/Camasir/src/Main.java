import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CamasirSepeti camasirSepeti = new CamasirSepeti();

        while (true){
            System.out.println("1- Çamaşır Ekle \n" +
                    "2- Çamaşır Çıkart \n" +
                    "3- Sepeti Gör \n" +
                    "4- Çıkış \n" +
                    "Lütfen bir seçim yapınız :");
            String islem = sc.nextLine();
            switch (islem){
                case "1":
                    System.out.println("Çamaşır İsmi :");
                    camasirSepeti.add(sc.nextLine());
                    break;
                case "2":
                    System.out.println("Çıkartmak istediğin çamaşır ismi :" + camasirSepeti.popup());

                    break;
                case "3":
                    camasirSepeti.goster();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Yanlış değer girdiniz !");
            }
        }

    }
}