public class day4 {
    public static void main(String[] args) {
        // 1. \n → New Line (baris baru)
        System.out.println("1. Menggunakan New Line");
        System.out.print("Menu Pagi: Nasi Goreng\nMenu Malam: Mie Ayam\n\n");

        // 2. \t → Tabulasi
        System.out.println("2. Menggunakan Tabulasi");
        System.out.println("Nama\t: Agnes Arruan Lebok");
        System.out.println("NIM\t: D0224304\n");

        // 3. \\ → Backslash
        System.out.println("3. Menggunakan Backslash");
        System.out.println("Resep disimpan di Folder\\Makanan\\Resep\n");

        // 4. \" → Double Quote
        System.out.println("4. Menggunakan Double Quote");
        System.out.println("Ibu berkata: \"Jangan lupa makan siang!\"\n");

        // 5. \' → Single Quote
        System.out.println("5. Menggunakan Single Quote");
        System.out.println("Motivasi: \'Makan teratur biar sehat\'\n");

        // 6. \b → Backspace
        System.out.println("6. Menggunakan Backspace");
        System.out.println("Baksooo\b\n"); // huruf 'o' terakhir terhapus

        // 7. \r → Carriage Return
        System.out.println("7. Menggunakan Carriage Return");
        System.out.print("Makan Roti\rNasi\n\n"); // "Nasi" menimpa awal kalimat

        // 8. \f → Form Feed (jarang terlihat di console)
        System.out.println("8. Menggunakan Form Feed");
        System.out.println("Halaman Menu 1\fHalaman Menu 2");
    }
}
