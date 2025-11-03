import java.util.Scanner;
public class day57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan ukuran sisi persegi (N): ");
        int sisi = sc.nextInt();
        for (int i = 1; i <= sisi; i++) {
            for (int j = 1; j <= sisi; j++) {

                if (i == 1 || i == sisi || j == 1 || j == sisi) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
    }
}
