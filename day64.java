import java.util.Scanner;
public class day64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka basis(M): ");
        int m = sc.nextInt();
        System.out.print("Masukkan angka pangkat(N): ");
        int n = sc.nextInt();
         int hasil = 1;
        for (int i = 1; i <= n ; i++) {
            hasil = hasil * m;
        }
        System.out.println("Hasil dari " + m + " pangkat " + n + " adalah: " +hasil);

    }
}
