import java.util.Scanner;
public class day38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Sebuah bilangan: ");
        int bilangan = sc.nextInt();

        if(bilangan > 0){
            System.out.println(bilangan + " adalah bilangan Positif");
        } else if (bilangan < 0) {
            System.out.println(bilangan + " adalah bilangan negatif");
        }else {
            System.out.println("Bilangan tersebut adalah nol");
        }
    }
}
