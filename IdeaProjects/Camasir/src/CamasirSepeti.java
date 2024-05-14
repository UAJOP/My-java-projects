import java.util.ArrayList;
public class CamasirSepeti {
    public ArrayList<String>sepet=new ArrayList<>();
    public void add(String camasir){
        sepet.add(camasir);
    }
    public String popup(){
        try {
            String camasir =sepet.get(sepet.size()-1);
            sepet.remove(sepet.size()-1);
            return camasir;
        }
        catch (Exception e){
            return "Çamaşır Yok";
        }
    }
    public void goster() {
        System.out.println("Sepetin içindekiler ="+sepet);
        System.out.println("Sepetin içinde ki çamaşır sayısı ="+sepet.size());
    }
}
