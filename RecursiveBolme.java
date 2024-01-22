import java.util.Scanner;

public class RecursiveBolme {
    static int sayac=0;
    public static int bol(int x,int y) {
        if (x == 0) {
            return sayac;
        }
        if(x<0){
            return sayac-1;
        }else {
            sayac++;
            return bol(x - y, y);
        }
    }

    public static void main(String[] args) {
        int x,y;
        Scanner giris=new Scanner(System.in);
        System.out.print("bölünecek sayıyı giriniz:");
        x=giris.nextInt();
        System.out.print("bölecek sayıyı giriniz:");
        y=giris.nextInt();
        System.out.println("Sonuç:"+bol(x,y));
    }
}
