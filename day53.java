import java.util.Scanner;
public class day53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Break pada switch case: ");
        System.out.print("Masukkan angka 1-2: ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Kamu memilih angka satu");
                break;
            case 2:
                System.out.println("Kamu memilih angka dua");
                break;
            default:
                System.out.println("Angka tidak dikenali");
                break;
        }
        System.out.println("Break pada Perulangan: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Perulangan ke-" + i);
            if (i == 2) {
                System.out.println("Perulangan berhenti di angka 2 sesuai kondisi.");
                break;

            }
        }
    }
}
