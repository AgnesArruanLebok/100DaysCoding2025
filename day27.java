import java.util.Scanner;
public class day27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //soal 1
        System.out.print("Masukkan Panjang Rumah: ");
        int P = sc.nextInt();
        System.out.print("Masukkan Lebar Rumah: ");
        int L = sc.nextInt();
        int ukuran = 2*2;
        int jumlah = (P*L)/ukuran;

        System.out.println("Jumlah keramik minimal yang di butuhkan: " + jumlah );

        //soal 2
        System.out.println("Sebelum ditukar: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = a + b ;
        b = a - b ;
        a = a - b;

        System.out.println("Setelah ditukar: ");
        System.out.println(a);
        System.out.println(b);
    }
}
