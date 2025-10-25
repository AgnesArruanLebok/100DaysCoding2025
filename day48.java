import java.util.Scanner;
public class day48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        double angkaPertama = sc.nextDouble();
        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        System.out.print("Masukkan angka kedua: ");
        double angkaKedua = sc.nextDouble();

        double hasil = 0;
        boolean valid = true;
        switch (operator) {
            case '+':
                hasil = angkaPertama + angkaKedua;
                break;
            case '-':
                hasil = angkaPertama - angkaKedua;
                break;
            case '*':
                hasil = angkaPertama * angkaKedua;
                break;
            case '/':
                if (angkaKedua == 0) {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
                    valid = false;
                } else {
                    hasil = angkaPertama / angkaKedua;
                }
                break;
            default:
                System.out.println("Operator tidak dikenali. Gunakan +, -, *, atau /.");
                valid = false;
        }
        if (valid) {
            boolean inputDesimal = (angkaPertama % 1 != 0) || (angkaKedua % 1 != 0);
            if (inputDesimal) {
                System.out.println("Hasil: " + hasil);
            } else {
                if (hasil % 1 == 0) {
                    System.out.println("Hasil: " + (int) hasil);
                } else {
                    System.out.println("Hasil: " + hasil);
                }
            }
        }


    }
}
