import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CamasirSepeti camasirSepeti = new CamasirSepeti();
        while (true){
            System.out.println("1 - Camasir Ekle\n" +
                    "2 - Camasir Cikart\n" +
                    "3 - Sepeti Gor\n" +
                    "4 - Cikis\n" +
                    "Lutfen bir secim yapiniz :");
            String islem = sc.nextLine();
            switch (islem){
                case "1":
                    System.out.println("Camasir ismi :");
                    camasirSepeti.add( sc.nextLine() );
                    break;
                case "2":
                    System.out.println("Cikarilan camasir : "
                            +camasirSepeti.popUp());
                    break;
                case "3":
                    camasirSepeti.goster();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Yanlis deger girdiniz!");
            }
        }
    }
}
