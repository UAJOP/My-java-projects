public class Beyblade {

    private String beybladyci;
    private int donusHizi;

    private int saldiriGucu;

    public Beyblade(String beybladyci, int donusHizi, int saldiriGucu) {
        this.beybladyci = beybladyci;
        this.donusHizi = donusHizi;
        this.saldiriGucu = saldiriGucu;
    }

    public String getBeybladyci() {
        return beybladyci;
    }

    public void setBeybladyci(String beybladyci) {
        this.beybladyci = beybladyci;
    }

    public int getDonusHizi() {
        return donusHizi;
    }

    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }

    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }



    public void saldir(){

        System.out.println(getBeybladyci() + " " + saldiriGucu + " ve " + donusHizi + " ile saldırıyor....");
    }

    public  void kutsalCanavarOrtayaCikar() {

        System.out.println("Bu beybladylerin kutsal canavarı yok....");

    }

    public void bilgileriGoster(){
        System.out.println("Beybladyci ismi :" + beybladyci);
        System.out.println("Saldırı gücü :" + saldiriGucu);
        System.out.println("Dönüş hizi :" + donusHizi);

    }



}




