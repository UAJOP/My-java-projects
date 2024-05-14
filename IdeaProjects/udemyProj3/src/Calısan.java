public class Calısan {
    private String ad;
    private String soyad;
    private int id;


    public Calısan(String ad, String soyad, int id) {
        this.ad = ad;
        this.soyad = soyad;
        this.id = id;
    }
    public void bilgileriGoster(){
        System.out.println("Çalışan bilgileri....");
        System.out.println("Ad :"+ ad);
        System.out.println("Soyad :"+ soyad);
        System.out.println("Id :" + id);

    }











    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
