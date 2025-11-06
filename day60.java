import java.util.Scanner;
public class day60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan batas angka(N): ");
        int n = sc.nextInt();
        System.out.print("Angka Ganjil(N-1): ");
        for (int i = n; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print("\nAngka Genap(N-1): ");
        for (int i = n; i >= 1;i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
