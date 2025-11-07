import java.util.Scanner;
public class day61 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Masukkan batas angka(N): ");
        int n = sc.nextInt();
        System.out.print("Masukkan angka kelipatan(M): ");
        int m = sc.nextInt();
        System.out.print("Kelipatan " + m + " Antara 1 dan " + n + ":");
        for (int i = 1; i <=  n; i++) {
            if(i % m == 0){
                System.out.print(i + " ");
            }

        }
    }
}
