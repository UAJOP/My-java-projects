import java.util.ArrayList;
import java.util.Scanner;

public class Fis <T>{
    private int sira = 2123;
    private ArrayList<String> siraList = new ArrayList<>();
    public void siraAl(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Isim giriniz :");
        siraList.add(sira++ + " - " + sc.nextLine());
    }
    public void vezneyeCagir(){
        if(siraList.size() == 0){
            System.out.println("Sirada bekleyen musteri yok!");
        }
        else{
            String musteri = siraList.get(0);
            System.out.println("SIRA : "+musteri);
            siraList.remove(0);
        }
    }
    public void siraGoster(){
        siraList.forEach(System.out::println);
    }
}






