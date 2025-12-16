import java.util.Scanner;

public class StringCantik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String teks = sc.nextLine();

        boolean adaI = false;
        boolean adaS = false;
        boolean adaC = false;

        for (int i = 0; i < teks.length(); i++) {
            char huruf = teks.charAt(i);

            if (huruf == 'I' && !adaI) {
                adaI = true;
            } else if (huruf == 'S' && adaI && !adaS) {
                adaS = true;
            } else if (huruf == 'C' && adaI && adaS) {
                adaC = true;
                break;
            }
        }

        if (adaI && adaS && adaC) {
            System.out.println("CANTIK");
        } else {
            System.out.println("TIDAK CANTIK");
        }
    }
}
