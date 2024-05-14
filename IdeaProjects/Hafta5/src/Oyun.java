import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class 1122111111Oyun {
    private int dusmanSayisi = 5;
    ArrayList<Karakter> dusmanListesi = new ArrayList();
    public Oyun(){
        dusmanListesi.add(new Ork());
        dusmanListesi.add(new Vampir());
        dusmanListesi.add(new Saman());
        dusmanListesi.add(new Titan());
        dusmanListesi.add(new Zombi());
    }
    public void basla(){
        User user = new User("Ugur");
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        while(true){
            Karakter dusman = dusmanBelirle();
            while (true){
                System.out.println(user.getIsim() + " cani : "+user.getCan());
                System.out.println(dusman.getIsim() + " cani : "+ dusman.getCan());
                System.out.println("1 - Saldir\n" +
                        "2 - Savun\"" +
                        "secim yapiniz :");
                int islemUser = scanner.nextInt();
                int islemDusman = rnd.nextInt(2)+1;
                if(islemUser == islemDusman){
                    if(islemUser == 1){
                        int userHasar = user.atak();
                        int dusmanHasar = dusman.atak();
                        user.setCan(user.getCan() - dusmanHasar);
                        dusman.setCan(dusman.getCan() - userHasar);
                        System.out.println("Kullanici hasari : "+userHasar);
                        System.out.println(dusman.getIsim()+" hasari : "+dusmanHasar);
                    }
                    else {
                        System.out.println("İki tarafta hamle bekliyor!");
                    }
                }
                else if(islemDusman > islemUser){
                    int userHasar = user.atak();
                    int dusmanSavunma = dusman.blok();
                    if(userHasar > dusmanSavunma){
                        System.out.println("Saldiri basarili : "+userHasar);
                        dusman.setCan(dusman.getCan() - userHasar);
                    }
                    else{
                        System.out.println("Blok basarili");
                    }
                }
                else{
                    int userSavunma = user.blok();
                    int dusmanHasar = dusman.atak();
                    if(userSavunma < dusmanHasar){
                        System.out.println("Saldiri basarili : "+dusmanHasar);
                        user.setCan(user.getCan() - dusmanHasar);
                    }
                    else{
                        System.out.println("Blok basarili");
                    }
                }
                if(user.getCan() <= 0){
                    System.out.println("Oldunuz!");
                    return;
                }
                if(dusman.getCan() <= 0){
                    System.out.println("Kazandiniz!");
                    dusmanSayisi--;
                    user.levelUp();
                    break;
                }
            }
           if (dusmanSayisi < 0){
               System.out.println("Oyunu kazandiniz!");
               break;
           }
        }


    }

    public Karakter dusmanBelirle(){
        Karakter k = new Ejderha();
        Random r = new Random();
        if(dusmanSayisi > 0){
            int index = r.nextInt(dusmanSayisi);
            k = dusmanListesi.get(index);
            dusmanListesi.remove(index);
        }
        return k;
    }
}
