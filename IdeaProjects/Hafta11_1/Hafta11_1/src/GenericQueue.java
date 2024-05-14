import java.util.ArrayList;

public class GenericQueue <T> {
    private ArrayList<T> list = new ArrayList<>();
    public void add(T eleman){
        list.add(eleman);
    }
    public T popUp(){
        if(list.size() == 0){
            System.out.println("Kuyruk bos!");
            return null;
        }
        else{
            T eleman = list.get(0);
            list.remove(0);
            return eleman;
        }
    }
    public void topla(){
        if(list.size() != 0){
            if(list.get(0) instanceof Integer){
                //Toplama işlemi
            }
            else
                System.out.println("Bu elemanlar toplanamaz!");
        }
        else{
            System.out.println("Liste bos!");
        }
    }
}
