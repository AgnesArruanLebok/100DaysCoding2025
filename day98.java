import java.util.Scanner;

public class day98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah deret: ");
        int n = sc.nextInt();

        int masaLalu = 0;
        int masaKini = 1;
        int masaDepan;

        System.out.println("\nDeret Fibonacci:");

        for (int i = 0; i < n; i++) {
            System.out.print(masaLalu + " ");
            masaDepan = masaLalu + masaKini;
            masaLalu = masaKini;
            masaKini = masaDepan;
        }
    }
}
