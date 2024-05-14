public class Dragon extends Beyblade{

    private String kutsalCanavar;

    private String gizliYetenek;

    public Dragon(String beybladyci, int donusHizi, int saldiriGucu, String kutsalCanavar, String gizliYetenek) {
        super(beybladyci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladyci() + " " + kutsalCanavar + " i ortaya çıkarıyor...." );
        System.out.println(getBeybladyci() + " ın Saldırısı : Hayalet Kasırgası");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal canavar adı :" + kutsalCanavar);
        System.out.println("Gizli yetenek : " + gizliYetenek);

    }



}
