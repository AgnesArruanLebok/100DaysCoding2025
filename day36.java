import java.util.Scanner;
public class day36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Apakah kamu memiliki kartu akses? (true/false): ");
        boolean kartuAkses = sc.nextBoolean();

        System.out.print("Apakah kamu sedang dalam jadwal piket? (true/false): ");
        boolean jadwalPiket = sc.nextBoolean();

        System.out.print("Masukkan kode PIN: ");
        int pin = sc.nextInt();

        if(kartuAkses) {
            System.out.println("Kartu akses valid, lanjut ke pintu ruang IT");
          
            if (jadwalPiket) {
                System.out.println("Jadwal piket sesuai, lanjut ke pintu ruang server");
              
                if (pin == 1234) {
                    System.out.println("Kode PIN benar!");
                    System.out.println("Akses diterima! Selamat datang di ruang server utama.");
                  
                } else {
                    System.out.println("Kode PIN salah! Akses ditolak di pintu ruang server.");
                }

            } else {
                System.out.println("Kamu tidak dalam jadwal piket hari ini! Akses ditolak di pintu ruang IT.");
            }

        } else{
            System.out.println("Kartu akses tidak valid! Akses ditolak di gerbang utama.");
        }

    }
}
