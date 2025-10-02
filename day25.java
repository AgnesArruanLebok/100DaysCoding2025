public class day25 {
    public static void main(String[] args) {
        int a = 8;
        //pre-increment
        int b = ++a;// nilai a ditambah dulu (+1), baru disimpan ke b
        System.out.println("Pre-increment: a = " + a + " ,b = " + b);

        a = 8;// reset lagi ke 8

        //post-increment
        int c = a++;// nilai a dipakai dulu, setelah itu baru ditambah
        System.out.println("Post-Increment: a = " + a + ", c = " + c );

        //kasir
        int pelanggan = 0;
        System.out.println("\nKasir (Post): " + pelanggan++);
        System.out.println("Kasir (Post): " + pelanggan++);
        System.out.println("Kasir (Pre) : " + ++pelanggan);
        System.out.println("Kasir (Pre) : " + ++pelanggan);

    }
}
