import java.util.Scanner;
public class day76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Masukkan Username: ");
            String username = sc.nextLine();

            if (username.equalsIgnoreCase("EXIT")) {
                System.out.println("Program dihentikan.");
                break;
            }
            if (username.isEmpty()) {
                System.out.println("Data tidak boleh kosong!");
                continue;
            }

            if (username.equalsIgnoreCase("joker")) {
                System.out.println("User ini telah dibanned.");
                continue;
            }

            System.out.print("Masukkan Komentar: ");
            String komentar = sc.nextLine();

            if (komentar.isEmpty()) {
                System.out.println("Data tidak boleh kosong!");
                continue;
            }

            String komentarLower = komentar.toLowerCase();

            if (komentarLower.contains("kasar") ||
                    komentarLower.contains("bodoh") ||
                    komentarLower.contains("promo")) {

                System.out.println("Komentar mengandung konten terlarang!");
                continue;
            }
            System.out.println("Komentar berhasil dipublikasikan!");
        }
    }
}
