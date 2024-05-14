public class idman {
    private int burpee_sayisi;
    private int pushup_sayisi;
    private int situp_sayisi;
    private int squat_sayisi;

    public idman(int burpee_sayisi, int pushup_sayisi,int situp_sayisi,int squat_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
        this.pushup_sayisi = pushup_sayisi;
        this.situp_sayisi = situp_sayisi;
        this.squat_sayisi = squat_sayisi;

    }
    public int getburpee_sayisi() {
        return burpee_sayisi;
    }

    public void setburpee_sayisi(int burpee_sayisi) {
        this.burpee_sayisi = burpee_sayisi;


    }
    public int getpushup_sayisi() {
        return pushup_sayisi;
    }

    public void setpushup_sayisi(int pushup_sayisi) {
        this.pushup_sayisi = pushup_sayisi;
    }

    public int getsitup_sayisi() {
        return situp_sayisi;
    }

    public void setsitup_sayisi(int situp_sayisi) {
        this.situp_sayisi = situp_sayisi;
    }


    public int getsquat_sayisi() {
        return squat_sayisi;
    }

    public void setsquat_sayisi(int squat_sayisi) {
        this.squat_sayisi = squat_sayisi;
    }

    public void hareketYap(String hareketTuru, int sayi) {

        if (hareketTuru.equals("Burpee")) {
            burpeeYap(sayi);
        }
        else if (hareketTuru.equals("Pushup")){
            pushupYap(sayi);
        }
        else if (hareketTuru.equals("Situp")){
            SitupYap(sayi);
        }
        else if (hareketTuru.equals("Squat")){
            squatYap(sayi);
        }
        else{
            System.out.println("Geçersiz Hareket...!");
        }

    }
    public void burpeeYap(int sayi){
        if (burpee_sayisi ==0){
            System.out.println("Yapacak burpee kalmadi...");
        }
        if (burpee_sayisi - sayi < 0){
            System.out.println("Hedeflediğin burpee saysini geçtin.Tebrikler!");
            burpee_sayisi = 0;
            System.out.println("Kalan Burpee : " + burpee_sayisi);
        }
        else{
            burpee_sayisi -=sayi;
            System.out.println("Kalan Burpee : " + burpee_sayisi);
        }

    }
    public void pushupYap(int sayi){
        if (pushup_sayisi ==0){
            System.out.println("Yapacak pushup kalmadi...");
        }
        if (pushup_sayisi - sayi < 0){
            System.out.println("Hedeflediğin pushup saysini geçtin.Tebrikler!");
            pushup_sayisi = 0;
            System.out.println("Kalan pushup : " + pushup_sayisi);
        }
        else{
            pushup_sayisi -=sayi;
            System.out.println("Kalan Pushup : " + pushup_sayisi);
        }

    }
    public void SitupYap(int sayi){
        if (situp_sayisi ==0){
            System.out.println("Yapacak situp kalmadi...");
        }
        if (situp_sayisi - sayi < 0){
            System.out.println("Hedeflediğin situp saysini geçtin.Tebrikler!");
            situp_sayisi = 0;
            System.out.println("Kalan Situp : " + situp_sayisi);
        }
        else{
            situp_sayisi -=sayi;
            System.out.println("Kalan Situp : " + situp_sayisi);
        }

    }
    public void squatYap(int sayi){
        if (squat_sayisi ==0){
            System.out.println("Yapacak squat kalmadi...");
        }
        if (squat_sayisi - sayi < 0){
            System.out.println("Hedeflediğin squat saysini geçtin.Tebrikler!");
            squat_sayisi = 0;
            System.out.println("Kalan Squat : " + squat_sayisi);
        }
        else{
            squat_sayisi -=sayi;
            System.out.println("Kalan Squat : " + squat_sayisi);
        }

    }

    public boolean idmanBittiMi(){

        return (burpee_sayisi == 0) && (pushup_sayisi == 0) && (situp_sayisi == 0) && (squat_sayisi == 0);
    }


}
