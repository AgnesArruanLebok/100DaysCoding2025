public class day7 {
    public static void main(String[] args) {
        // soal 1 mencetak kata
        char a = 'あ';
        char ri = 'り';
        char ga = 'が';
        char to = 'と';
        char u = 'う';

        System.out.print(a);
        System.out.print(ri);
        System.out.print(ga);
        System.out.print(to);
        System.out.print(u);
        System.out.println();

        //soal 2 mencetak kondisi
        boolean isHujan = true; // sekarang memang hujan
        boolean isMatahariTerbit = false; //tidak karena sudah malam
        boolean isNgantuk = true; //Ya, karena waktunya istirahat

        System.out.println("Apakah hari ini hujan? " + isHujan);
        System.out.println("Apakah matahari sudah terbit? " + isMatahariTerbit);
        System.out.println("Apakah saya merasa ngantuk? " + isNgantuk);

    }
}
