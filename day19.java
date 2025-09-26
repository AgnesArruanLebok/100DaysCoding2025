public class day19 {
    public static void main(String[] args) {
        //Paksa Besar Ke Kecil)
        double nilai = 99.9;
        int nilaibulat = (int) nilai;

        System.out.println("=== Paksa Besar ke Kecil ===");
        System.out.println("Nilai asli (double) : " + nilai);
        System.out.println("Nilai bulat (int)   : " + nilaibulat);

        int stokGudang = 257;
        byte stokRak = (byte) stokGudang;

        System.out.println("\nStok gudang (int)  : " + stokGudang);
        System.out.println("Stok rak (byte)   : " + stokRak + "<-- overflow!");

        //otomatis kecil ke besar
        byte levelAwal = 42 ;
        int levelAkhir = levelAwal;

        System.out.println("\n===Otomatis kecil ke besar===");
        System.out.println("Level awal (byte)  : " + levelAwal);
        System.out.println("Level akhir (int)  : " + levelAkhir);

        short skorAwal = 32000;
        double skorAkhir = skorAwal;

        System.out.println("\nSkor awal (short)  : " + skorAwal);
        System.out.println("Skor akhir (double): " + skorAkhir);
    }
}
