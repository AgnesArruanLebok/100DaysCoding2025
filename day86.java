package day86;
public class Day86 {
    public static void main(String[] args) {
         int[] nilai = {45, 70, 95, 30, 88, 65};
        int nilaiminimal = nilai[0];

        System.out.println("--- Daftar Nilai Siswa ---");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print(nilai[i]+ " ");
            if (nilai[i] < nilaiminimal) {
                nilaiminimal = nilai[i];
            }
        }
        System.out.println("\n--------------------------");
        System.out.println("\nNilai Terendah di Kelas: " + nilaiminimal);
    }
    
}
