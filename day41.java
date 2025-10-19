//soal1
package evaluasi2;
import java.util.Scanner;
public class soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-- Program Hitung Diskon---");
        System.out.print("Masukkan jumlah barang yang di beli: ");
        int jumlah = sc.nextInt();
        System.out.print("Masukkan harga per barang: ");
        double harga = sc.nextDouble();
        System.out.print("Status anggota(true/false): ");
        String statuss = sc.next();
        boolean status = Boolean.parseBoolean(statuss);
        sc.nextLine ();

        double totalpembelian = jumlah*harga;
        double diskon = 0.10;    
        boolean berhak = (totalpembelian >= 250000) && (status == true) ;
        double jmlhdiskon ;
        double totalakhir = 0;
        if(totalpembelian >=250000 && berhak){
    
        }else{
            jmlhdiskon = 0;
            System.out.println("Tidak mendapatkan diskon");
        }
        jmlhdiskon = 0.10*totalpembelian;
        totalakhir = totalpembelian-jmlhdiskon;
        System.out.println("---Ringkasan pembelian---");
        System.out.printf("%-10s : %.2f %n","Total pembelian",totalpembelian);
        System.out.printf("%-10s : %-13b %n","Berhak diskon",berhak);
        System.out.printf("%-10s : %.2f %n","Jumlah diskon",jmlhdiskon);
        System.out.printf("%-10s : %.2f %n","Total bayar",totalakhir);
    }
    }
//soal2
package evaluasi2;
import java.util.Scanner;
public class soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int l = sc.nextInt();
        int h = (s+l) % 24;
        int tidur;
        if(h < 9 ){
            tidur = 9-h;
        }else{
            tidur =0;
        }
        System.out.println(tidur);
    }
}

    

