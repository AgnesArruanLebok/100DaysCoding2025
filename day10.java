public class day10 {
    public static void main(String[] args) {
        // segitiga selalu memiliki 3 sisi tetap(konstanta)
        final int SISI_SEGITIGA = 3;
        int jumlahsegitiga = 5;
        int totalsisi = jumlahsegitiga*SISI_SEGITIGA;

        System.out.println("Jumlah sisi pada 1 segitiga: "+SISI_SEGITIGA);
        System.out.println("Jumlah sisi dari 5 segitiga: " +totalsisi);
    }
}
