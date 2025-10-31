public class day54 {
    public static void main(String[] args) {
        System.out.println("Mencetak angka 1–20,tetapi kelipatan 3 tidak dicetak:");
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
