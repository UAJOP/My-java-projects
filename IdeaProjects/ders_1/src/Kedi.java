public class Kedi {
    public String isim;
    public int yas;
    public String cins;
    public  void ziplama(){
        System.out.println(this.isim+ " zipladi");
    }public void miyavlamak(){
        System.out.println("Meow!");
        Kedi[]cats = new   Kedi[5];
        cats[0] = new Kedi();
        cats[0].isim = "Karya";
        System.out.println("isim : " + cats[0].isim);
        cats[1]= kediOlustur();
    }
     public static Kedi kediOlustur (){
        return new Kedi();
    }

}
