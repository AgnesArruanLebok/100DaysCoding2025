import java.util.Scanner;
public class day33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== CEK KELAYAKAN IKUT LOMBA MASAK === ");

        System.out.print("Apakah Anda memiliki pengalaman memasak?(true/false): ");
        boolean pengalaman = sc.nextBoolean();

        System.out.print("Apakah Anda memiliki alat masak lengkap? (true/false): ");
        boolean alatLengkap = sc.nextBoolean();

        boolean bolehIkut = pengalaman || (!pengalaman && alatLengkap);
        System.out.println("Boleh ikut lomba masak: " + bolehIkut);
        System.out.println("Tidak boleh ikut lomba masak: " + !bolehIkut);

    }
}
