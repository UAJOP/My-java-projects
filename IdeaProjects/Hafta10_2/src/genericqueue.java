import java.util.ArrayList;

public class genericqueue <T>{
    private ArrayList<T> list = new ArrayList<>();
    public void add(T eleman){
        list.add(eleman);
    }
    public T popup(){
        if (list.size()==0){
            System.out.println("kuyruk bos");
            return null;
        }
        else {
            T eleman = list.get(0);
            list.remove(0);
            return eleman;
        }
    }
}
