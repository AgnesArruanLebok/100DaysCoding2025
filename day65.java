import java.util.Scanner;
public class day65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Program Hitung Faktorial (N!) ---");
        System.out.print("Masukkan angka(N):");
        int angka = sc.nextInt();
        int hasil = 1;
        for (int i = 1; i <= angka; i++) {
            hasil *= i;
        }

        System.out.println("\nHasil dari " + angka + "! adalah: " + hasil);
    }
}
