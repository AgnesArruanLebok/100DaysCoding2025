import java.util.Scanner;
public class day41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka = sc.nextInt();
        for (int i = 1; i <= 10; i++) {

            System.out.println(i + " x " + angka + " = " + i * angka);


        }
    }
}
