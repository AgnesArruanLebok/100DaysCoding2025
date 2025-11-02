import java.util.Scanner;
public class day56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\n--- MENU MIE ---");
            System.out.println("1. Tampilkan Pesan Mie Favorit");
            System.out.println("2. Tampilkan Pesan Mie Pedas");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan Anda (1-3): ");
            pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println(">>> Mie favorit hari ini adalah Mie Goreng Spesial!");
                    break;
                case 2:
                    System.out.println(">>> Mie Pedas pilihan Anda sedang dipersiapkan!");
                    break;
                case 3:
                    System.out.println("Terima kasih, sampai jumpa lagi!");
                    break;
                default:
                    System.out.println(">>> Pilihan tidak valid!");
            }
        } while (pilihan != 3);

    }
}
