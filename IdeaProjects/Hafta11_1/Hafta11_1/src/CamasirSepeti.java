import java.util.ArrayList;

public class CamasirSepeti <T /*extends Number*/> {
    private ArrayList<T> sepet = new ArrayList<>();
    public void add(T camasir){
        sepet.add(camasir);
    }
    public T popUp(){
        try {
            T camasir = sepet.get(sepet.size()-1);
            sepet.remove(sepet.size()-1);
            return camasir;
        }
        catch (Exception e){
            System.out.println("Sepet Bos");
            return null;
        }
    }
    public void goster(){
        //System.out.println(sepet);
        sepet.forEach(System.out::println);
    }
}
