public class day21 {
    public static void main(String[] args) {
        int angka1 = 22;
        int angka2 = 12;

        System.out.println("---Sebelum Ditukar---");
        System.out.println("Nilai angka1 = " + angka1);
        System.out.println("Nilai angka2 = " + angka2);

        angka1 = angka1 - angka2;
        angka2 = angka1 + angka2;
        angka1 = angka2 - angka1;

        System.out.println("---Setelah Ditukar---");
        System.out.println("Nilai angka1 = "+angka1);
        System.out.println("Nilai angka2 = "+angka2);


    }
}
