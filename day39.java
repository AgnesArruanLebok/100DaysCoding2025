import java.util.Scanner;
public class day39 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("=== MENU MINUMAN ===");
                System.out.println("1. Es Teh     - Rp 5.000");
                System.out.println("2. Es Jeruk   - Rp 7.000");
                System.out.println("3. Kopi Susu  - Rp 8.000");
                System.out.print("Masukkan pilihan (1-3): ");
                int pilihan = sc.nextInt();

                String pesan;
                if (pilihan == 1) {
                    pesan = "Anda memesan Es Teh dengan harga Rp 5.000";
                } else if (pilihan == 2) {
                    pesan = "Anda memesan Es Jeruk dengan harga Rp 7.000";
                } else if (pilihan == 3) {
                    pesan = "Anda memesan Kopi Susu dengan harga Rp 8.000";
                } else {
                    pesan = "Pilihan tidak valid.";
                }
                System.out.println(pesan);
            }
        }



