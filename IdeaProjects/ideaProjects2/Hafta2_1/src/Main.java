public class Main {
    public static void main(String[] args) {
        System.out.println("Merhaba");
         //ilkel (primative) veri tipleri
         //int, float, decimal, double, boolean, char,
        int sayi = 5;
        int sayi2 = 8;
        String isim = "Huseyin";
        System.out.println(sayi);
        sayi += 5; // sayi = sayi + 5 // -,*,/ hatta % olabilir.
        sayi++; // sayi--
        ++sayi;
        System.out.println(sayi);
        System.out.println(sayi++);
        System.out.println(++sayi);
        System.out.println(sayi++ + sayi2);
        System.out.println("Toplam : " + sayi + sayi2);
        String s = " : : ";
        System.out.println(sayi + sayi2 + s + sayi + sayi2);
        System.out.println(sayi/2);
        double d =  (double)sayi/sayi2;
        double d =  sayi/2.0;
        double d =  1.0*sayi/sayi2;
        System.out.println(d);
    }
}
