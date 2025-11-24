import java.util.Scanner;
public class day78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== DAFTAR AKUN BARU ===");
        System.out.print("Masukkan Username: ");
        String username = sc.nextLine();
        username = username.trim();

        if (username.isEmpty()) {
            System.out.println("ERROR: Username tidak boleh kosong!");
            return;
        }

        if (username.length() > 12) {
            System.out.println("ERROR: Username terlalu panjang (maks 12)!");
            return;
        }

        System.out.print("Masukkan Password: ");
        String password = sc.nextLine();

        if (password.length() < 8) {
            System.out.println("ERROR: Password minimal 8 karakter!");
            return;
        }

        if (password.toLowerCase().contains("admin")) {
            System.out.println("ERROR: Password tidak boleh mengandung kata 'admin'!");
            return;
        }

        char first = password.charAt(0);
        if (!(first >= 'A' && first <= 'Z')) {
            System.out.println("ERROR: Huruf pertama password harus kapital!");
            return;
        }

        System.out.print("Ulangi Password: ");
        String ulang = sc.nextLine();

        if (!ulang.equals(password)) {
            System.out.println("ERROR: Password tidak cocok!");
            return;
        }

        System.out.println("\nSUKSES: Pendaftaran Berhasil!");
        System.out.println("Username '" + username.toLowerCase() + "' telah aktif.");

    }
}
