public class day91 {
    public static void hitungGaji(String nama, int jumlahJamKerja) {
        int total = jumlahJamKerja * 50000;
        System.out.println("Karyawan " + nama + " bekerja " + jumlahJamKerja + " jam, mendapatkan gaji Rp " + total);
    }

    public static void main(String[] args) {
        hitungGaji("Aika", 5);
        hitungGaji("Kayla", 8);
    }
}
