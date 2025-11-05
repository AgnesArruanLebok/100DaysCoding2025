import java.util.Scanner;
public class day59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka (N): ");
        int N = sc.nextInt();

        System.out.print("Angka Ganjil: ");
        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print("\nAngka Genap: ");
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
