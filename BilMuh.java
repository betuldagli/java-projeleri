public class BilMuh implements Ogrenci,Not{
    public void BolumYaz(){
        System.out.println("Bölüm:Bilgisayar Mühendisliği.");
    }

    public String NumaraHesapla(int yil, int sira){
        int bolumKodu=1213;
        StringBuilder stringBuilder=new StringBuilder();
        String num= String.valueOf(stringBuilder.append(yil).append(bolumKodu).append(sira));
        return num;
    }
    public double NotHesapla(double vnot, double fnot){
        return (vnot*0.4)+(fnot*0.6);
    }
}
