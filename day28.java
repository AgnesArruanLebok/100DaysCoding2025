import java.util.Scanner;
public class day28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int a = sc.nextInt();
        System.out.print("Masukkan angka pertama: ");
        int b = sc.nextInt();

        boolean sama = (a == b );
        boolean tidaksama = (a != b);

        System.out.println("Apakah " + a + " sama dengan " + b + "? " + sama);
        System.out.println("Apakah " + a + " tidak sama dengan " + b + "? " + tidaksama);


    }
}
