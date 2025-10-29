import java.util.Scanner;
public class day52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angkaRahasia = 5;

        System.out.print("Tebak angka rahasia (1-10): ");
         int tebakan = sc.nextInt();

        while (tebakan != angkaRahasia) {
            System.out.print("Tebak angka rahasia (1-10): ");
            tebakan = sc.nextInt();
        }
        System.out.println("Selamat, tebakan Anda benar!");
    }
}
day
