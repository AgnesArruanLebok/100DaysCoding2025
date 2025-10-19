import java.util.Scanner;
public class day42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan gaji kotor: ");
        int gajikotor = sc.nextInt();
        double pajak = 0.05* gajikotor;
        double gajibersih = gajikotor- pajak;

        System.out.println("---Rincian Gaji---");
        System.out.printf("Gaji kotor  : Rp %,d%n",gajikotor);
        System.out.printf("Jumlah pajak: Rp %,.2f%n",pajak);
        System.out.printf("Gaji Bersih : Rp %,.2f%n",gajibersih);

    }
}
