import java.util.ArrayList;
import java.util.Collections;

public class CamasirSepeti {
    private ArrayList<String> sepet = new ArrayList<>();
    public void add(String camasir){
        sepet.add(camasir);
    }
    public String popUp(){
        try{
            String camasir = sepet.get( sepet.size()-1 );
            sepet.remove(sepet.size()-1);
            return camasir;
        }
        catch (Exception e){
            return "Camasir Yok!";
        }
    }
    public void goster(){
        System.out.println(sepet);
        //sepet.forEach(System.out::println);
    }
}
