import java.util.Scanner;
public class day87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] buku = {"Harry Potter", "Lord of the Rings", "Alchemist", "Sherlock Holmes", "Hobbit"};

        System.out.println("--- Cari Buku ---");
        System.out.print("Masukkan judul buku: ");
        String judul = sc.nextLine();

        boolean ditemukan = false;
        int index = -1;
        
        for (int i = 0; i < buku.length; i++) {
            if (buku[i].equalsIgnoreCase(judul)) {
                ditemukan = true;
                index = i; 
                break;
            }
        }

        System.out.println();

        if (ditemukan) {
            System.out.println("Hasil: Buku '" + buku[index] + "' ditemukan di indeks ke-" 
                                + index + " (Tumpukan ke-" + (index + 1) + ").");
        } else {
            System.out.println("Hasil: Maaf, buku tidak ada di tumpukan.");
        }
    }
}
