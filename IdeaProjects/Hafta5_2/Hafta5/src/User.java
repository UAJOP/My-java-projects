import java.util.Scanner;

public class User extends Karakter{
    static Scanner sc = new Scanner(System.in);
    public User(){
        super(sc.nextLine());
        this.setCan(100);
        this.setOran(20);
        this.setHasar(50);
        this.setSavunma(40);
    }

    @Override
    public void move() {
        // To be contiuned. 
    }
}
