public class day3 {
    public static void main(String[] args) {
        System.out.println("--- Single line Comment ---");
        System.out.println("Saya suka makan mie instan"); // Tetapi saya tidak mengonsumsinya setiap hari karena kurang baik untuk kesehatan


        // print() digunakan untuk mencetak tanpa pindah baris
        System.out.print("Nasi goreng biasanya dimakan saat ");
        System.out.print("sarapan pagi.");
        System.out.println();

        System.out.println("\n--- Multi line Comment ---");
        String makanan1 = "Mie Goreng";
        String makanan2 = "Mie Kuah";
        int harga1 = 3500;
        int harga2 = 4000;

        // printf() digunakan untuk menampilkan teks dengan format tabel
        System.out.printf("Jenis: %-10s | Harga: Rp %d%n", makanan1, harga1);
        System.out.printf("Jenis: %-10s | Harga: Rp %d%n", makanan2, harga2);

        /*
          Mie goreng biasanya tanpa kuah dan sering disajikan dengan tambahan telur atau sosis.
          Mie kuah cocok dimakan ketika cuaca dingin karena hangat dan berkuah.
          Walaupun rasanya enak dan praktis, mie instan sebaiknya tidak dimakan terlalu sering
          agar kesehatan tetap terjaga.
        */

    }
}
