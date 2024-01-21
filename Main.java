public class Main {
    public static void main(String[] args) {
        BilMuh bilMuh=new BilMuh();
        MakMuh makMuh=new MakMuh();

        bilMuh.BolumYaz();
        System.out.println(bilMuh.NotHesapla(80,85));
        System.out.println(bilMuh.NumaraHesapla(22,27));
        makMuh.BolumYaz();
        System.out.println(makMuh.NotHesapla(75,60));
        System.out.println(makMuh.NumaraHesapla(23,22));
    }
}