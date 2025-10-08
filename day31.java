import java.util.Scanner;
public class day31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai tes logika: ");
        int nilaites = sc.nextInt();
        System.out.print("Masukkan pengalaman coding(tahun): ");
        int pengalaman = sc.nextInt();

        boolean diterima = (nilaites >= 80 ) && (pengalaman > 2);
        System.out.println("Apakah kamu diterima di Klub Elite Coder? " + diterima);

    }
}
