public class kaplumbaga extends hayvan{
    public kaplumbaga(String isim){
        super(isim);
    }
    public void kos(int zar){
        switch (zar){
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println(this.isim+ " ilerliyor");
                this.konum++;
                break;
            case 5:
            case 6:
                System.out.println(this.isim+ " yemek yiyor");

        }

    }

}
