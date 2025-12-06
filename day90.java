import java.util.Scanner;
public class day90 {
    static int maxx(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }
    static int minn(int a, int b) {
        if (a < b) {
            return a;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Program Mencari Nilai Maksimum & Minimum ===");
        System.out.print("Masukkan bilangan pertama : ");
        int a = sc.nextInt();
        System.out.print("Masukkan bilangan kedua   : ");
        int b = sc.nextInt();

        int terbesar = maxx(a, b);
        int terkecil = minn(a, b);
        System.out.println("\nHasil Perhitungan:");
        System.out.println("Nilai Terbesar : " + terbesar);
        System.out.println("Nilai Terkecil : " + terkecil);
    }
}
