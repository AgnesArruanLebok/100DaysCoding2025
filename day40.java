import java.util.Scanner;

public class day40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        double angkapertama = sc.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double angkakedua = sc.nextDouble();

        double hasil;
        if (operator == '+') {
            hasil = angkapertama + angkakedua;
            System.out.println("Hasil penjumlahan: " +hasil);
        } else if (operator == '-') {
            hasil = angkapertama - angkakedua;
            System.out.println("Hasil pengurangan: " + hasil);
        } else if (operator == '*') {
            hasil = angkapertama * angkakedua;
            System.out.println("Hasil perkalian: " +  hasil);
        } else if (operator == '/') {
            if (angkakedua != 0) {
                hasil = angkapertama / angkakedua;
                System.out.println("Hasil pembagian: " + hasil);
            } else {
                System.out.println("Error: tidak bisa membagi dengan nol!");
            }
        } else {
            System.out.println("Operator tidak valid! Gunakan +, -, *, atau /");
        }
    }
}
