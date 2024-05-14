public class Main {
    public static void main(String[] args) {
        Kedi kedicik = new Kedi();
        Fare farecik = new Fare();

        while (kedicik.getKonum() < 100 && farecik.getKonum() < 100)
        {
            farecik.kos();
            kedicik.kos();

            if (kedicik.getKonum() >= farecik.getKonum())
            {
                if (Math.random() < 0.5) // Python da öğrendiğim math kütüphanesinden 100/50 ihtimal rastgele oluşturdum ve bunu kullanmayı tercih ettim
                {
                    System.out.println("---------Kedicik avına ulaştııı!---------");
                    break;
                }
                else// burda diğer 100/50 ihtimali otomatik alıyor o yüzden extra yazmadık
                {
                    farecik.kac();
                    System.out.println("---------Fare ele geçirildikten sonra kaçıyor: " + farecik.getKonum());
                }
            }
        }

        if (farecik.getKonum() >= 100) {
            System.out.println("---------Fare kurtulmayı başardı!---------");
            System.out.println("---------Kedi  başarısız oldu ezik PUhahahah!---------");
        }
        else if (kedicik.getKonum() >= 100) {
            System.out.println("---------Kedi  başarısız oldu ezik PUhahahah!---------");
        }
    }
}