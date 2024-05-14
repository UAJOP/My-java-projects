import java.util.Random;

class Fare {
    private int konum;

    public Fare() {
        this.konum = 0;
    }


    public void kac(){
        konum = konum + 5;
        System.out.println("Fare yakalandı ama minicik olduğu için kaçtı !!");
    }

    public void kos() {
        Random rnd = new Random();
        int zar = rnd.nextInt(6) + 1;
        if (zar == 1) {
            konum = konum + 3;
            System.out.print("Farecik 3 birim ilerliyorrrr !---------");
        }
        else if (zar == 2) {
            konum = konum + 3;
            System.out.print("Farecik 3 birim ilerliyorrrr !---------");
        }
        else if (zar == 3) {
            konum = konum + 1;
            System.out.print("Farecik 1 birim ilerliyorrrr !---------");
        }
        else if (zar == 4) {
            konum = konum + 1;
            System.out.print("Farecik 1 birim ilerliyorrrr !---------");
        }
        else if (zar == 6) {
            konum = konum + 5;
            System.out.print("Farecik 5 birim ilerliyorrrr !---------");
        }
        System.out.println("---------Farecik burada kaçıyorrr !!: " + konum);
    }


    public int getKonum() {
        return konum;
    }
}
