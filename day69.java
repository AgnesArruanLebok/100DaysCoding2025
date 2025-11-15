import java.util.Scanner;
public class day69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalbelanja = 0;
        int pilihan;
        do {
            System.out.println("Selamat Datang di Warung Sederhana!");
            System.out.println("Menu Makanan: ");
            System.out.println("1.Nasi Goreng   (Rp 15.000) ");
            System.out.println("2. Mie Ayam       (Rp 12.000) ");
            System.out.println("3. Bakso          (Rp 10.000) ");
            System.out.println("4. Es Teh Manis   (Rp 5.000) ");
            System.out.println(" ---------------------------------- ");
            System.out.println("0. Selesai & Bayar ");
            System.out.print("Masukkan pilihan anda: ");
            pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    totalbelanja += 15000;
                    System.out.println("Menambahkan Nasi Goreng...");
                    break;
                case 2:
                    totalbelanja += 12000;
                    System.out.println("Menambahkan Mie Ayam...");
                    break;
                case 3:
                    totalbelanja += 10000;
                    System.out.println("Menambahkan Bakso....");
                    break;
                case 4:
                    totalbelanja += 5000;
                    System.out.println("Menambahkan Es Teh Manis...");
                    break;
                case 0:
                    System.out.println("Menghitung total....");
                    break;
            }

            System.out.println("Total belanja anda: " +totalbelanja);
        }while(pilihan != 0);

        System.out.print("Masukkan uang pembayaran: ");
        int uangbayar = sc.nextInt();
        if(uangbayar < totalbelanja) {
            do {
                System.out.println("Maaf, uang Anda kurang Rp" + (totalbelanja - uangbayar));
                System.out.print("Silakan masukkan jumlah uang yang cukup: Rp ");
                uangbayar = sc.nextInt();
            } while (uangbayar > totalbelanja);
        }
        if(uangbayar >= totalbelanja){

        }
        int kembalian = uangbayar-totalbelanja;
        System.out.println("--- Struk Pembayaran ----");
        System.out.println("Total belanja: Rp " +totalbelanja);
        System.out.println("Uang bayar   : Rp " +uangbayar);
        System.out.println("Kembalian    : Rp " +kembalian);
        System.out.println("-------------------------------");
        System.out.println("Terima kasih telah berbelanja! ");

    }
}
