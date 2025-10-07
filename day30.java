import java.util.Scanner;
public class day30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan umur anak: ");
        int umur = sc.nextInt();
        boolean minimal = umur >= 1;
        boolean maksimal = umur <= 5;
        boolean balita =( minimal & maksimal);

        System.out.println("Apakah memenuhi syarat minimal: " +  minimal);
        System.out.println("Apakah memenuhi syarat maksimal: " + maksimal);
        System.out.println("Apakah anak termasuk kategori Balita? " + balita);
    }
}
