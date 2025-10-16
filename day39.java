import java.util.Scanner;
public class day39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== MENU MAKANAN CEPAT SAJI ===");
        System.out.println("1. Mie goreng      - Rp 15.000");
        System.out.println("2. Ayam Goreng     - Rp 18.000");
        System.out.println("3. Kentang Goreng  - Rp 10.000");
        System.out.print("Masukkan pilihan (1-3): ");
        int pilihan = sc.nextInt();

        String pesan;
        if (pilihan == 1) {
            pesan = "Anda memesan Mie goreng dengan harga Rp 15.000";
        } else if (pilihan == 2) {
            pesan = "Anda memesan Ayam Goreng dengan harga Rp 18.000";
        } else if (pilihan == 3) {
            pesan = "Anda memesan Kentang Goreng dengan harga Rp 10.000";
        } else {
            pesan = "Pilihan tidak valid.";
        }
        System.out.println(pesan);
    }
}
