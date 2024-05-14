import java.util.ArrayList;
import java.util.Scanner;

public class Fis {
    private int sira = 2123;
    private ArrayList<String> siraList = new ArrayList<>();
    public void siraAl(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Isim giriniz :");
        siraList.add(this.sira++ + " - " + sc.nextLine());
    }
    public void vezneyeCagir(){
        if(siraList.size() == 0){
            System.out.println("Cagirilacak Museri Yok!");
        }
        else{
            String musteri = siraList.get(0);
            System.out.println("SIRA : "+musteri);
            siraList.remove(0);
        }
    }
    public void siraGoster(){
        //System.out.println(siraList);
        //[ 1111 - Ayberk, 2222 - Çetin, 5555 - Egemen]
        siraList.forEach(System.out::println);
    }
}
