public class Main {
    public static void main(String[] args) {

        Resolation resolation = new Resolation(1920,1080);
        Monitor monitor = new Monitor("VS197DE","ASUS","18.5",resolation);
        Kasa kasa = new Kasa("SHADOW BLADE","SHADOW","TEMPERLİ CAM");
        AnaKart anaKart = new AnaKart("B250-PRO","ASUS","Windows 10",10);

        Bilgisayar pc = new Bilgisayar(monitor,kasa,anaKart);


        pc.getKasa().bilgisayari_ac();
        pc.getMonitor().monitoru_kapat();

    }
}