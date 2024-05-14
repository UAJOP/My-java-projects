import java.util.Random;
class Musteri extends People {
    private String musteriNo;
    public Musteri(String ad, String soyad, String dogumTarihi) {
        super(ad, soyad, dogumTarihi);
        this.musteriNo = musteriNoOlustur();
    }
    private String musteriNoOlustur() {
        Random random = new Random();
        StringBuilder musteriNoBuilder = new StringBuilder("M");
        for (int i = 0; i < 15; i++) {
            musteriNoBuilder.append(random.nextInt(10));
        }
        return musteriNoBuilder.toString();
    }
    @Override
    public void bilgiGoster() {
        System.out.println("Müşteri Bilgisi:");
        System.out.println("Ad: " + getAd());
        System.out.println("Soyad: " + getSoyad());
        System.out.println("Doğum Tarihi: " + getDogumTarihi());
        System.out.println("Müşteri Numarası: " + musteriNo);
    }
}

