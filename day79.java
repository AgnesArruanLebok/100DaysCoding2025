import java.util.Scanner;
public class day79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Registrasi Akun Baru ---");
        System.out.print("Buat Username : ");
        String regUser = sc.nextLine().trim();

        System.out.print("Buat Password : ");
        String regPass = sc.nextLine().trim();

        if (regUser.isEmpty() || regPass.isEmpty()) {
            System.out.println("ERROR: Username dan Password tidak boleh kosong!");
            return;
        }

        System.out.println("Registrasi berhasil!\n");
        System.out.println("--- Login ke Akun ---");
        while (true) {
            System.out.print("Masukkan Username : ");
            String username = sc.nextLine().trim();

            System.out.print("Masukkan Password : ");
            String Password = sc.nextLine().trim();

            if (username.equals(regUser) && Password.equals(regPass)) {
                System.out.println("\nLOGIN BERHASIL!");
                break;
            } else {
                System.out.println("Gagal: Username atau Password salah! Silakan coba lagi.\n");
            }
        }

    }
}
