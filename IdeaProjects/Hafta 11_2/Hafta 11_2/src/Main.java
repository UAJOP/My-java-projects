import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        /*ArrayList<People> list = new ArrayList<>();
        list.add( new People(54,"Yunus") );
        list.add( new People(58,"Ahmet") );
        list.add( new People(50,"Eren") );
        list.forEach(System.out::println);*/

        /*ArrayList<Integer> tamSayiList = new ArrayList<>();
        tamSayiList.add(8);
        tamSayiList.add(3);
        tamSayiList.add(21);
        tamSayiList.add(6);
        tamSayiList.add(3);
        //Küçükten büyüğe sıraladık.
        Collections.sort(tamSayiList);
        //Listeyi ters çevirdik büyükten küçüğe oldu.
        Collections.reverse(tamSayiList);
        tamSayiList.forEach(System.out::println);*/
        ArrayList<People> list = new ArrayList<>();
        list.add( new People(54,"Yunus") );
        list.add( new People(58,"Ahmet") );
        list.add( new People(50,"Eren") );
        Collections.sort(list);
        list.forEach(System.out::println);
    }
}
