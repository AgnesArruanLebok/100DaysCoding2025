import java.util.Scanner;
public class day75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan teks: ");
        String teks = sc.nextLine();

        System.out.println("Teks Asli: " + teks);
        System.out.println("Panjang karakter: " + teks.length());
        System.out.println("Huruf Besar: " + teks.toUpperCase());
        System.out.println("Huruf Kecil: " + teks.toLowerCase());
        System.out.println("Cek Teks Asli Lagi: " + teks);
    }
}
