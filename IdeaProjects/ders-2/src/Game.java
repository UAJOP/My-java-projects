public class Game {
    public void oyunuOyna(){
        User k = new User("Kaan");
        Pc p = new Pc("Fatih");
        while (true) {
            int userSecim = k.oyna();
            int pcSecim = p.oyna();

            if (userSecim == pcSecim) {
                System.out.println("BERABERE");

            } else if ((userSecim == 0 && pcSecim == 2) ||
                    (userSecim == 1 && pcSecim == 0) ||
                    (userSecim == 2 && pcSecim == 1)) {
                System.out.println(k.isim + " KAZANDİ");
                k.puan++;
            } else {
                System.out.println(p.isim + " KAZANDİ");
                p.puan++;

            }
            if (k.puan ==3){
                System.out.println(k.isim +"OYUNU KAZANDI");
                break;
            }
            if (p.puan ==3){
                System.out.println(p.isim +"OYUNU KAZANDI");
                break;
            }

        }
    }
}
