abstract class People {
    private String ad;
    private String soyad;
    private String dogumTarihi;
    public People(String ad, String soyad, String dogumTarihi) {
        this.ad = ad;
        this.soyad = soyad;
        this.dogumTarihi = dogumTarihi;
    }
    public String getAd() {
        return ad;
    }
    public String getSoyad() {
        return soyad;
    }
    public String getDogumTarihi() {
        return dogumTarihi;
    }
    public abstract void bilgiGoster();
}
