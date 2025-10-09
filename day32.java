import java.util.Scanner;
public class day32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Apakah anda anggota premium?(true/false): ");
        boolean statusAnggota = sc.nextBoolean();

        System.out.print("Apakah Anda memiliki undangan khusus? (true/false): ");
        boolean cekUndangan = sc.nextBoolean();

        boolean dapatAksesVip = statusAnggota || cekUndangan;
        System.out.println("Apakah mendapatkan akses VIP? " + dapatAksesVip);

    }
}
