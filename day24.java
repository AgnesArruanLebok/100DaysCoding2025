import java.util.Scanner;
public class day24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai r: ");
        int r = sc.nextInt();
        final double phi = 3.14;
        double luas = phi*(r*r);

        System.out.println("Luas Lingkaran dengan jari-jari " + r + " adalah " + luas);

    }
}
