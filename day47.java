import java.util.Scanner;
public class day47 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("=== Penentu Hari Kerja dan hari Libur ===");
        System.out.println("1. Senin");
        System.out.println("2. Selasa");
        System.out.println("3. Rabu");
        System.out.println("4. Kamis");
        System.out.println("5. Jumat");
        System.out.println("6. Sabtu");
        System.out.println("7. Minggu");
        System.out.print("Masukkan pilihan hari (1-7): ");
        int pilihan = sc.nextInt();

        String hari ="";
        switch (pilihan) {
            case 1:
                hari = "Senin";
                break;
            case 2:
                hari = "Selasa";
                break;
            case 3:
                hari = "Rabu";
                break;
            case 4:
                hari = "Kamis";
                break;
            case 5:
                hari = "Jumat";
                break;
            case 6:
                hari = "Sabtu";
                break;
            case 7:
                hari = "Minggu";
                break;
            default:
                System.out.println("Input tidak valid! Masukkan angka 1-7.");
                return;
        }

        if (pilihan >= 1 && pilihan <= 5) {
            System.out.println(hari + " adalah Hari Kerja.");
        } else {
            System.out.println(hari + " adalah Hari Libur.");
        }
    }
}
