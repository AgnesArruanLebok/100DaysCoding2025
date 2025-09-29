import java.util.Scanner;
public class day22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi persegi: ");
        int sisi = sc.nextInt();
        int luas = sisi * sisi;
        
        System.out.println("Sisi Persegi        : " + sisi);
        System.out.println("Luas Persegi adalah : " + luas);
        sc.close();


    }
}
