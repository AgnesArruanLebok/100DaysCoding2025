    import java.util.Scanner;
    public class day11 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("=== FORM PENDAFTARAN ANGGOTA GYM & FITNESS ===");

            System.out.print("Nama Lengkap: ");
            String nama = input.nextLine();

            System.out.print("Umur: ");
            byte umur = input.nextByte();

            System.out.print("Tahun Lahir: ");
            short tahunLahir = input.nextShort();

            System.out.print("Nomor Anggota: ");
            int nomorAnggota = input.nextInt();

            System.out.print("Nomor Telepon: ");
            long telepon = input.nextLong();

            System.out.print("Tinggi Badan: ");
            float tinggi = input.nextFloat();

            System.out.print("Berat Badan (kg): ");
            double berat = input.nextDouble();

            System.out.print("Apakah sudah pernah ikut gym sebelumnya? (true/false): ");
            boolean pernahGym = input.nextBoolean();

            System.out.print("Masukkan minimal 3 huruf favorit Anda: ");
            String hurufFav = input.next();
            char hurufKeTiga = hurufFav.charAt(2);

            System.out.println("\n=== DATA ANGGOTA BARU ===");
            System.out.println("Nama Lengkap   : " + nama);
            System.out.println("Umur           : " + umur + " tahun");
            System.out.println("Tahun Lahir    : " + tahunLahir);
            System.out.println("Nomor Anggota  : " + nomorAnggota);
            System.out.println("Nomor Telepon  : " + telepon);
            System.out.println("Tinggi Badan   : " + tinggi + " m");
            System.out.println("Berat Badan    : " + berat + " kg");
            System.out.println("Pernah Gym?    : " + pernahGym);
            System.out.println("Huruf ke-3 favorit: " + hurufKeTiga);

            System.out.println("\nTerima kasih, " + nama + "! Selamat bergabung di Gym kami ");
            input.close();
        }
    }



