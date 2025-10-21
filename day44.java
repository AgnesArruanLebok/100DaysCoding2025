import java.util.Scanner;
public class day44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan mata kuliah: ");
        String matkul = sc.nextLine();
        System.out.print("Masukkan nilai: ");
        double nilai = sc.nextDouble();

        String predikat;
        if (nilai > 90 && nilai <= 100) {
            predikat = "A";
        } else if (nilai > 80 && nilai <= 90) {
            predikat = "B";
        } else if (nilai > 70 && nilai <= 80) {
            predikat = "C";
        } else if (nilai > 60 && nilai <= 70) {
            predikat = "D";
        } else if (nilai <= 60 && nilai >= 0) {
            predikat = "E";
        } else {
            predikat = "Nilai tidak valid";
        }
        System.out.println("=== Hasil Pembelajaran Selama 1 Semester ===");
        System.out.println("Nama : " + nama);
        System.out.println("Pada mata kuliah " + matkul + ", " + nama + " telah mendapat nilai " + predikat);
    }
}


