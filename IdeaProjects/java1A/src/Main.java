import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen ödev notunuzu giriniz :");
        int odevN = sc.nextInt();
        System.out.println("Lütfen vize notunuzu giriniz :");
        int araN = sc.nextInt();
        System.out.println("Lütfen final notunuzu giriniz :");
        int finalN = sc.nextInt();

        double a = odevN * 20 / 100;
        double b = araN * 35 / 100;
        double c = finalN * 45 / 100;

        double ort = a + b + c;

        if ( 95 < ort && ort== 100 ){
            System.out.println("AA ile geçtiniz!");
        }
        else if (90 < ort && ort == 95) {
            System.out.println("BA ile geçtiniz!");

        }
        else if (80 < ort && ort == 90) {
            System.out.println("BB ile geçtiniz!");
        }
        else if (70 < ort && ort == 80) {
            System.out.println("CB ile geçtiniz!");
        }
        else if (65 < ort && ort == 70) {
            System.out.println("CC ile geçtiniz!");

        } else if (59 < ort && ort == 65) {
            System.out.println("CD ile geçtiniz!");

        }
        else {
            System.out.println("KALDIN");
        }


    }
}