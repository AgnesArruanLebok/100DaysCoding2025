import java.util.Scanner;
public class day49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. Ternary dengan String
        System.out.print("Masukkan umur kamu: ");
        int umur = sc.nextInt();
        String status = (umur >= 18) ? "Dewasa" : "Remaja";
        System.out.println("Kamu termasuk: " + status);

        // 2. Ternary dengan int
        System.out.print("\nMasukkan nilai ujian: ");
        int nilai = sc.nextInt();
        String hasil = (nilai >= 75) ? "Lulus" : "Tidak Lulus";
        System.out.println("Hasil ujian: " + hasil);

        // 3. Ternary dengan logika
        System.out.print("\nMasukkan angka: ");
        int angka = sc.nextInt();
        String jenis = (angka % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println("Angka tersebut adalah: " + jenis);

        // 4. Ternary bersarang (nested)
        System.out.print("\nMasukkan jam sekarang (0–23): ");
        int jam = sc.nextInt();
        String waktu = (jam < 12) ? "Selamat Pagi" :
                (jam < 15) ? "Selamat Siang" :
                        (jam < 18) ? "Selamat Sore" : "Selamat Malam";
        System.out.println(waktu);

        // 5. Ternary dengan double
        System.out.print("\nMasukkan jumlah saldo kamu: ");
        double saldo = sc.nextDouble();
        String uang = (saldo >= 50000) ? "Cukup untuk jajan" : "Belum cukup, nabung dulu";
        System.out.println(uang);
    }
}
