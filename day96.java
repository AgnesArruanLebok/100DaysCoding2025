import java.util.Scanner;
public class day96{
    public static int tambah(int a, int b) {
        return a + b;
    }
    public static int kurang(int a, int b) {
        return a - b;
    }
    public static int kali(int a, int b) {
        return a * b;
    }
    public static double bagi(int a, int b) {
        return (double) a / b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Angka 1: ");
        int angka1 = scanner.nextInt();
        System.out.print("Masukkan Angka 2: ");
        int angka2 = scanner.nextInt();

        int hasilTambah = tambah(angka1, angka2);
        int hasilKurang = kurang(angka1, angka2);
        int hasilKali = kali(angka1, angka2);
        double hasilBagi = bagi(angka1, angka2);

        System.out.println("--- Hasil Operasi ---");
        System.out.println("Penjumlahan : " + hasilTambah);
        System.out.println("Pengurangan : " + hasilKurang);
        System.out.println("Perkalian   : " + hasilKali);
        System.out.println("Pembagian   : " + hasilBagi);


    }
}
