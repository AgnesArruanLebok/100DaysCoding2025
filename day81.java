public class day81 {
    public static void main(String[] args) {
        int [] nilai = {85,90,78,88,95};

        System.out.println("--- Data Nilai Awal ---");
        System.out.println("Nilai Siswa Pertama: " + nilai[0]);
        System.out.println("Nilai Siswa Terakhir: " + nilai[4]);

        System.out.println("\n--- Update Data ---");
        int nilaiLama = nilai[2];
        System.out.println("Nilai lama siswa ke-3: " + nilaiLama);
        nilai[2] = 100;
        System.out.println("Nilai baru siswa ke-3: " + nilai[2]);

        System.out.println("\n--- Operasi Matematika ---");
        double rata = (nilai[0] + nilai[1]) / 2.0;
        System.out.println("Rata-rata nilai Siswa 1 & 2: " + rata);

    }
}
