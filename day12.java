import java.util.Scanner;
public class day12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---Program Input Biodata---");

        System.out.println("Masukkan Nama Lengkap Anda: ");
        String nama = input.nextLine();

        System.out.println("Masukkan Nim Anda: ");
        String nim= input.nextLine();

        System.out.println("Masukkan Umur Anda: ");
        int umur =input.nextInt();

        System.out.println("Masukkan kelas (A/B/C): ");
        char kelas = input.next().charAt(0);

        System.out.println("Masukkan IPK Anda: ");
        double ipk = input.nextDouble();

        System.out.println("\n==========================");
        System.out.println("      BIODATA MAHASISWA     ");
        System.out.println("===========================");
        System.out.println("Nama      : " + nama);
        System.out.println("Nim       : " + nim);
        System.out.println("Umur      : " + umur + "Tahun");
        System.out.println("Kelas     : " + kelas);
        System.out.println("IPK       : " + ipk);

    }
}
