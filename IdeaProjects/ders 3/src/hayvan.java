public class hayvan {
    int yas;
    String isim;
    public hayvan(String isim,int yas){
        this.isim=isim;
        this.yas=yas;

    }

    public void hareket(){
        System.out.println(this.isim+"hareket ediyor");
    }

}
