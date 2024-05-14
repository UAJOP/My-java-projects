import java.util.Scanner;

public class Musteri {
    String misim, sifre;
    int mnumara, bakiye;


    public Musteri(int mnumara) {
        Scanner sc = new Scanner(System.in);
        System.out.println("İsim giriniz :");
        this.misim = sc.nextLine();
        this.bakiye = 1000;
        this.mnumara = mnumara;
        System.out.println("Id'niz :" + this.mnumara + " ");
        System.out.println("Şifre giriniz :");
        this.sifre = sc.nextLine();

    }

    public Musteri(int mnumara, String misim, String sifre) {
        this.misim = misim;
        this.sifre = sifre;
        this.mnumara = mnumara;
        System.out.print("Id'niz :" + this.mnumara);
        this.bakiye = 1000;

    }

    public void bakiyeEkle(int miktar){
        this.bakiye += miktar;
        System.out.println("Yeni bakiyeniz : " + this.bakiye);
    }
    public void bakiyeAzalt(int miktar){
        if (miktar > bakiye)
        {
            System.out.println("Yeterli para yok !");
        }
        else
        {
            this.bakiye -= miktar;
            System.out.println("Yeni bakiyeniz : " + this.bakiye);
        }
    }

    public void bilgiGoster(){
        System.out.println("isminiz :"+this.misim+ "\n numaranız :" + this.mnumara + "\n bakiyeniz :" +  this.bakiye);
    }


    public boolean sifreKontrol(String girilenSifre) {
        if (this.sifre.equals(girilenSifre)) return true;
        else return false;
    }
}
