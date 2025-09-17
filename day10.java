public class day10 {
    public static void main(String[] args) {
        // segitiga selalu memiliki 3 sisi tetap(konstanta)
        final int sisi_segitiga = 3;
        int jumlahsegitiga = 5;
        int totalsisi = jumlahsegitiga*sisi_segitiga;

        System.out.println("Jumlah sisi pada 1 segitiga: "+sisi_segitiga);
        System.out.println("Jumlah sisi dari 5 segitiga: " +totalsisi);
    }
}
