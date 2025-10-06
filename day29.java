import java.util.Scanner;
public class day29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan tinggi badan pengunjung (cm): ");
        double tb = sc.nextDouble();
        System.out.print("Masukkan berat badan pengunjung (kg): ");
        double bb = sc.nextDouble();

        System.out.println("\nData pengunjung: ");
        System.out.println("Tinggi badan pengunjung: " + tb + " cm ");
        System.out.println("Berat badan pengunjung: " + bb + " kg ");

        boolean cekTinggi = tb > 150;
        boolean cekBerat = bb < 80;

        System.out.println("\n===Hasil pengecekan keamanan===");
        System.out.println("Apakah tinggi badan memenuhi standar keamanan (>150 cm)? " + cekTinggi);
        System.out.println("Apakah berat badan memenuhi standar keamanan (<80 kg)? " + cekBerat);

        if(cekTinggi && cekBerat) {
            System.out.println("Pengunjung memenuhi syarat keamanan dan diperbolehkan naik wahana.");
        }else{
            System.out.println("Pengunjung belum memenuhi syarat keamanan, tidak diperbolehkan naik wahana.");
        }
    }
}
