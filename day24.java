import java.util.Scanner;
public class day24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai r: ");
        double nilair = sc.nextDouble();
        final double phi = 3.14;
        double luas = phi*(nilair*nilair);

        System.out.println("Luas Lingkaran dengan jari-jari " + nilair + " adalah " + luas);

    }
}
