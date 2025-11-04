import java.util.Scanner;
public class day58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka(N): ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        for (int i = n; i >= 1; i--) {
            System.out.println(i);

        }

    }
}
