public class day85 {
    public static void main(String[] args) {
        int[] nilai = {45, 70, 95, 30, 88, 65};
        int nilaimax = nilai[0];

        System.out.println("--- Daftar Nilai Siswa ---");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print(nilai[i]+ " ");
            if (nilai[i] > nilaimax) {
                nilaimax = nilai[i];
            }
        }
        System.out.println("\n--------------------------");
        System.out.println("\nNilai Tertinggi di Kelas: " + nilaimax);
    }
}
