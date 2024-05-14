public class Draciel extends Beyblade{

    private String kutsalCanavar;


    public Draciel(String beybladyci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
        super(beybladyci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }


    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladyci() + " " + kutsalCanavar + " i ortaya çıkarıyor...." );
        System.out.println(getBeybladyci() + " ın Savunması : Kale Savunması");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal canavar adı :" + kutsalCanavar);
    }



}
