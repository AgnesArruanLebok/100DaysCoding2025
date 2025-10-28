import java.util.Scanner;
public class day51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka= sc.nextInt();
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            System.out.println(i+ " x " + angka + " = " + i*angka);

        }

    }
}
