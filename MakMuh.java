
public class MakMuh {
    public void BolumYaz(){
        System.out.println("Bölüm:Makine Mühendisliği.");
    }

    public String NumaraHesapla(int yil, int sira){
        int bolumKodu=2213;
        StringBuilder stringBuilder=new StringBuilder();
        String num= String.valueOf(stringBuilder.append(yil).append(bolumKodu).append(sira));
        return num;
    }
    public double NotHesapla(double vnot, double fnot){
        return (vnot*0.4)+(fnot*0.6);
    }
}
