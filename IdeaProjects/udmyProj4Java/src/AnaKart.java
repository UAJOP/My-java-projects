public class AnaKart {
    private String model;

    private  String uretici;

    private int yuva_sayisi;

    private String isletim_sistemi;

    public AnaKart(String model,String uretici , String  isletim_sistemi,int yuva_sayisi) {
        this.model = model;
        this.uretici = uretici;
        this.isletim_sistemi = isletim_sistemi;
        this.yuva_sayisi = yuva_sayisi;
    }




    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public int getYuva_sayisi() {
        return yuva_sayisi;
    }

    public void setYuva_sayisi(int yuva_sayisi) {
        this.yuva_sayisi = yuva_sayisi;
    }


    public String getIsletim_sistemi() {
        return isletim_sistemi;
    }

    public String setIsletim_sistemi() {
        this.isletim_sistemi = isletim_sistemi;
        return isletim_sistemi;
    }
}
