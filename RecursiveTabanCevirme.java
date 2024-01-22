import java.util.Scanner;

public class RecursiveTabanCevirme {
    public static int tabanCevir(int x) {
        if (x / 2 > 0) {
            return 10 * tabanCevir(x / 2) + x % 2;
        }
        return x % 2;
    }
    public static void main(String[] args) {
        int x;
        Scanner giris=new Scanner(System.in);
        System.out.print("10 tabanlı sayı giriniz:");
        x=giris.nextInt();
        System.out.println(tabanCevir(x));
    }

}
