public class day80 {
    public static void main(String[] args) {
        String [] makanan  = {"Bakso","Nasi goreng","Ayam goreng","Sate","Mie"};
        System.out.println("Makanan juara: " + makanan[0]);
        System.out.println("Makanan terakhir: " + makanan[4]);
        System.out.println("Wah,saya bosan makan " + makanan[2] + ". ganti dengan Ayam bakar");
        makanan[2]= "Ayam bakar";
        System.out.println("Makanan ke-3 sekarang: " + makanan[2]);
        System.out.println("Total menu: " + makanan.length);

    }
}
