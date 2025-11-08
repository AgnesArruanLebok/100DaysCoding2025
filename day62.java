import java.util.Scanner;
public class day62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan batas angka(N): ");
        int n = sc.nextInt();
        int total = 0;
        System.out.print("Proses: ");
        for (int i = 1; i <= n; i++) {
            total += i;
            System.out.print(i);
            if (i < n) {
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + total);
        System.out.println("\nTotal penjumlahan dari 1 sampai " + n + " adalah: " + total);
    }
}
