import java.util.Random;

public class People implements Comparable<People> {
    private int id;
    private String isim;
    private int yas;
    public People(int id, String isim){
        this.id = id;
        this.isim = isim;
        Random r = new Random();
        this.yas = r.nextInt(20,35);
    }

    @Override
    public String toString() {
        return "ID : "+this.id+"\n"+
                "Isim : "+this.isim+"\n"+
                "Yas : "+this.yas;
    }

    @Override
    public int compareTo(People insan) {
        if(this.id > insan.id)
            return 1;
        else if(this.id < insan.id)
            return -1;
        else
            return 0;
    }
}
