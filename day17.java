import java.util.Scanner;
public class day17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int m = sc.nextInt();
        int permenmurid = p/m;
        int sisapermen = p % m;

        System.out.println(permenmurid);
        System.out.println(sisapermen);
    }
}
