import java.util.Scanner;
public class day23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai panjang: ");
        int panjang = sc.nextInt();

        System.out.print("Masukkan nilai lebar: ");
        int lebar = sc.nextInt();
        int luaspersegi = panjang * lebar ;

        System.out.println("Panjang persegi adalah " + panjang + " cm dan lebarnya adalah " + lebar +
                " cm  maka luas persegi panjang adalah " + luaspersegi + " cm " );

    }
}
