import java.util.Scanner;
public class day55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //soal 1
        System.out.print("Batas Bawah: ");
        int batasbawah = sc.nextInt();
        System.out.print("Batas Atas: ");
        int batasatas = sc.nextInt();
        System.out.print("Angka: ");
        int angka = sc.nextInt();

        if (angka >= batasbawah && angka <= batasatas){
            System.out.println("YAYAYAYA");
        } else
            System.out.println("NONONONO");

    //soal 2
        System.out.print("Nilai: ");
        int nilai = sc.nextInt();

        if(nilai > 70){
            System.out.println("Ujian Kroco Ji Pale ");
        }else
            System.out.println("Sa Jappo'ka Aih");

        //soal 3
        System.out.print("Angka: ");
        int Angka = sc.nextInt();

        if(Angka % 2 == 0){
            System.out.println("Iyaji");
        }else
            System.out.println("Tidakji");

    }
}
