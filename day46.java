import java.util.Scanner;
public class day46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- MENU MIE ---");
        System.out.println("1. Mie Goreng Spesial - Rp 12.000");
        System.out.println("2. Mie Kuah Pedas     - Rp 10.000");
        System.out.println("3. Mie Ayam Bakso     - Rp 13.000");
        System.out.println("4. Mie Rebus Telur    - Rp 11.000");
        System.out.println("5. Mie Kari           - Rp 14.000");
        System.out.print("Masukkan pilihan (1-5): ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Kamu memilih: Mie Goreng Spesial - Rp 12.000");
                break;
            case 2:
                System.out.println("Kamu memilih: Mie Kuah Pedas - Rp 10.000");
                break;
            case 3:
                System.out.println("Kamu memilih: Mie Ayam Bakso - Rp 13.000");
                break;
            case 4:
                System.out.println("Kamu memilih: Mie Rebus Telur - Rp 11.000");
                break;
            case 5:
                System.out.println("Kamu memilih: Mie Kari - Rp 14.000");
                break;
            default:
                System.out.println("Pilihan tidak ada di menu, silakan coba lagi.");
                break;

        }
    }
}
