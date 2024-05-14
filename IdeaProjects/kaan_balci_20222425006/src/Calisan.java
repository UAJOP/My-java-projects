class Calisan extends People {
    private int maas;
    private String departman;
    public Calisan(String ad, String soyad, String dogumTarihi, int maas, String departman) {
        super(ad, soyad, dogumTarihi);
        this.maas = maas;
        this.departman = departman;
    }
    @Override
    public void bilgiGoster() {
        System.out.println("Çalışan Bilgisi:");
        System.out.println("Ad: " + getAd());
        System.out.println("Soyad: " + getSoyad());
        System.out.println("Doğum Tarihi: " + getDogumTarihi());
        System.out.println("Maaş:" + maas + "TL");
        System.out.println("Departman: " + departman);
    }
}

