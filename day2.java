public class day2 {
    public static void main(String[] args) {
        //Soal  no 1 untuk println
        System.out.println("Soal 1");
        System.out.println("Saya akan bertahan selama 100 Hari Ngoding, dan akan menjadi anggota resmi ISC");
        System.out.println();

        //soal no 2 untuk print
        System.out.println("Soal 2");
        System.out.print("Selamat telah menjadi ");
        System.out.print("anggota ISC");
        System.out.println();
        System.out.println();

        //soal 3 untuk printf mencetak data diri
        System.out.println("Soal 3");
        String nama = "Agnes";
        String nim = "D0224304";
        char kelas = 'A';
        int umur = 19;
        double tinggibadan = 160.1;

        System.out.printf("| %-6s : %-8s |%n","Nama",nama);
        System.out.printf("| %-6s : %-8s |%n","Nim",nim);
        System.out.printf("| %-6s : %-8c |%n","Kelas",kelas);
        System.out.printf("| %-6s : %-8d |%n","Umur",umur);
        System.out.printf("| %-6s : %-8s |%n","TB",tinggibadan);



    }
}
