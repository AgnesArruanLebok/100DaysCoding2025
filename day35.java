import java.util.Scanner;
public class day35 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Masukkan usia kamu: ");
                int usia = sc.nextInt();

                if (usia >= 15) {
                    System.out.println("Kamu sudah bisa memasak sendiri ");
                } else if (usia >= 10) {
                    System.out.println("Kamu boleh belajar memasak, tapi harus diawasi orang tua");
                } else {
                    System.out.println("Kamu belum boleh memasak sendiri");
                }
        }

    }

