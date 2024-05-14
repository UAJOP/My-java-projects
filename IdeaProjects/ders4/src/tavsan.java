public class tavsan extends hayvan{
    public tavsan(String isim){
        super(isim);
    }
    public void kos(int zar){
        switch (zar){
            case 1:
            case 2:
            case 3:
                System.out.println(this.isim+ " zipladi");
                this.konum += 2;
            case 4:
            case 5:
                System.out.println(this.isim+" yemek yiyor");
                break;
            case 6:
                System.out.println(this.isim+ " uyuya kaldı");
                this.konum--;
                break;
        }
    }
}
