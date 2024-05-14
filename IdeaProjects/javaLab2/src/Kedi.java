import java.util.Random;

class Kedi {
    private int konum;

    public Kedi() {
        this.konum = 0;
    }

    public void kos() {
        Random rnd = new Random();
        int zar = rnd.nextInt(6) + 1;
        if (zar == 1) {
            konum = konum + 2;
            System.out.print("Kedicik 2 birim ilerliyorrrr !---------");
        }
        else if (zar == 2) {
            konum = konum + 2;
            System.out.print("Kedicik 2 birim ilerliyorrrr !---------");
        }
        else if (zar == 3) {
            konum = konum + 2;
            System.out.print("Kedicik 2 birim ilerliyorrrr !---------");
        }
        else if (zar == 4) {
            konum = konum + 1;
            System.out.print("Kedicik 1 birim ilerliyorrrr ! ---------");
        }
        else if (zar == 6) {
            konum = konum + 5;
            System.out.print("Kedicik 5 birim ilerliyorrrr !---------");
        }
        System.out.println("--------Kedicik geliyorr !! : " + konum);
    }

    public int getKonum() {
        return konum;
    }
}
