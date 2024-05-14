public class Monitor {

    private String model ;
    private  String uretici;

    private String boyut;

    private Resolation resolation;

    public Monitor(String model, String uretici, String boyut, Resolation resolation) {
        this.model = model;
        this.uretici = uretici;
        this.boyut = boyut;
        this.resolation = resolation;
    }

    public void monitoru_kapat() {

        System.out.println("Monitor kapatılıyor.....");
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

    public String getBoyut() {
        return boyut;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    public Resolation getResolation() {
        return resolation;
    }

    public void setResolation(Resolation resolation) {
        this.resolation = resolation;
    }
}
