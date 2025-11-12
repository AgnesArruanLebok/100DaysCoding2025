import java.util.Scanner;
public class day66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan tinggi pola (N): ");
        int n = sc.nextInt();

        System.out.println("=== Pola Vertikal Pagar ===");
        for (int i = 1; i <= n; i++) {
            System.out.println("#");
        }
    }
}
