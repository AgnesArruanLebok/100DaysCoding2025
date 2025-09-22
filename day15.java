public class day15 {
    public static void main(String[] args) {
        String teks1 = "16";
        String teks2 = "8";

        System.out.println("===Sebelum parse===");
        System.out.println("teks1 + teks2 = "+ (teks1 + teks2));

        int angka1 = Integer.parseInt(teks1);
        int angka2 = Integer.parseInt(teks2);

        System.out.println("===Sesudah parse===");
        System.out.println("angka1 + angka2 = " + (angka1 + angka2));
        System.out.println("angka1 - angka2 = " + (angka1 - angka2));
    }
}
