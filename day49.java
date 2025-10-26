import java.util.Scanner;
public class day49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1️. Ternary dengan String
        System.out.print("Masukkan umur: ");
        int umur = sc.nextInt();
        String minuman = (umur > 17) ? "Kopi" : "Jus Jeruk";
        System.out.println("Minuman: " + minuman);

        // 2️.Ternary dengan int
        System.out.print("\nMasukkan dua angka:\nA = ");
        int a = sc.nextInt();
        System.out.print("B = ");
        int b = sc.nextInt();
        int terbesar = (a > b) ? a : b;
        System.out.println("Nilai terbesar: " + terbesar);

        // 3.Ternary menghasilkan boolean
        boolean sama = (a == b) ? true : false;
        System.out.println("Apakah A dan B sama? " + sama);

        // 4.Ternary dengan double
        System.out.print("\nMasukkan suhu tubuh (°C): ");
        double suhu = sc.nextDouble();
        String kondisi = (suhu >= 37.5) ? "Demam" : "Normal";
        System.out.println("Kondisi tubuh: " + kondisi);

        // 5. Ternary bersarang (nested)
        System.out.print("\nMasukkan nilai ujian: ");
        int nilai = sc.nextInt();
        String grade = (nilai >= 90) ? "A" :
                (nilai >= 75) ? "B" :
                        (nilai >= 60) ? "C" :
                                (nilai >= 45) ? "D" : "E";
        System.out.println("Predikat nilai: " + grade);

        // 6.Ternary dengan operator logika
        System.out.print("\nMasukkan angka untuk cek genap/ganjil: ");
        int angka = sc.nextInt();
        String jenis = (angka % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println("Angka tersebut adalah: " + jenis);

        // 7.Ternary dengan pesan kondisi
        System.out.print("\nMasukkan waktu (jam, 0–23): ");
        int jam = sc.nextInt();
        String waktu = (jam < 12) ? "Selamat Pagi" :
                (jam < 18) ? "Selamat Sore" : "Selamat Malam";
        System.out.println(waktu);
    }
}
