import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fis f = new Fis();
        while (true){
            System.out.println("1 - Sira Al!\n" +
                    "2 - Musteri Cagir!\n" +
                    "3 - Sira Goster!\n" +
                    "4 - Cikis\n" +
                    "Lutfen bir secim yapiniz :");
            String secim = scanner.nextLine();
            if(secim.equals("1")){
                f.siraAl();
            }
            else if(secim.equals("2")){
                f.vezneyeCagir();
            }
            else if(secim.equals("3")){
                f.siraGoster();
            }
            else if(secim.equals("4")){
                return;
            }
            else{
                System.out.println("Yanlis deger girdiniz!");
            }
        }
    }
}
