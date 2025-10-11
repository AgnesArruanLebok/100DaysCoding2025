import java.util.Scanner;
public class day34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CEK KELAYAKAN BEASISWA ===");
        System.out.print("Masukkan IPK kamu: ");
        double ipk = sc.nextDouble();

        System.out.print("Masukkan jumlah SKS yang sudah ditempuh: ");
        int sks = sc.nextInt();

        System.out.print("Apakah kamu memiliki sertifikat prestasi akademik? (true/false): ");
        boolean prestasiAkademik = sc.nextBoolean();

        System.out.print("Apakah kamu berasal dari keluarga kurang mampu? (true/false): ");
        boolean kurangMampu = sc.nextBoolean();

        boolean syaratUtama = (ipk >= 3.0) && (sks >= 40);
        boolean syaratTambahan = prestasiAkademik || kurangMampu;
        boolean lolos = syaratUtama && syaratTambahan;
        int bonusPoint = (int)(ipk * 10) + sks;

        System.out.println("\n=== HASIL CEK ===");
        System.out.println("Syarat utama terpenuhi: " + syaratUtama);
        System.out.println("Syarat tambahan terpenuhi: " + syaratTambahan);
        System.out.println("Total poin kombinasi IPK dan SKS: " + bonusPoint);
        System.out.println("Lolos beasiswa: " + lolos);
    }
}
