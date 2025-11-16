import java.util.Scanner;
public class day70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Panjang (P): ");
        int p = sc.nextInt();
        System.out.print("Masukkan Lebar (L): ");
        int l = sc.nextInt();
       
        for (int i = 1; i <= p; i++) {
            for (int j = 1; j <= l; j++) {
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }
}
