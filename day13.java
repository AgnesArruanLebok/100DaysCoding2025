package evaluasi1;
import java.util.Scanner;
public class soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print ("Judul: ");
        final String judul = sc.nextLine();
        System.out.print ("Masukkan tahun: ");
        final String tahun= sc.nextLine();
        System.out.print("Masukkan kecepatan(km/j): ");
        double kecepatan = sc.nextDouble();
        System.out.print ("Masukkan jumlah kota: ");
        int kota = sc.nextInt();
        System.out.print ("Masukkan harga ayam: ");        
        short hargaayam = sc.nextShort();
        System.out.print("Masukkan insial kendaraan: ");
        char insialkota = sc.next().charAt(0);
        System.out.print("Masukkan jarak: ");
        int jarak= sc.nextInt();
        System.out.print ("Masukkan jumlah hari: ");
        double hari = sc.nextDouble();
        System.out.print ("Masukkan total biaya: ");
        long totalbiaya = sc.nextLong();
        System.out.print ("Status perjalanan: ");
        boolean status = sc.nextBoolean();
       
        
        System.out.println("Judul: "+judul);
        System.out.println("Pada tahun "+tahun+","
                + "seorang mahasiswa bernama athira melakukan perjalanan sejauh \n 120 km hanya demi makan ayam geprek seharga "
                + hargaayam+ " rupiah.ia mengunjungi " +kota+ "kota dengan menggunakan \n kendaraan berinsial " + insialkota +
                ".perjalanan tersebut memakan waktu"+hari+ "hari dengan rata-rata \nkecepatan"+kecepatan+"Km/jam."
                + "total biaya perjalanan mencapai " +totalbiaya+ " rupiah.");
        System.out.println("Status perjalanan : "+status);
    }
}
//soal 2
package evaluasi1;
import java.util.Scanner;
public class soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                
        System.out.print("Masukkan universitas: ");
        final String namauniv = sc.nextLine();
        
        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();
        
        System.out.print("Masukkan nim: ");
        final String nim= sc.nextLine();
        
        System.out.print("Masukkan semester: ");
        int semester = sc.nextInt();
        
        System.out.print("Masukkan jumlah sks: ");
        byte sks = sc.nextByte();
        
        System.out.print("Masukkan tahun masuk: ");
        short tahunmasuk = sc.nextShort();
        
        System.out.print("Masukkan ipk: ");
        double ipk = sc.nextDouble();
        
        System.out.print("Masukkan tinggi badan: ");
        double tb = sc.nextDouble();
        
        System.out.print("Masukkan gender (L/p):");
        char gender = sc.next().charAt(0);
        
        
        System.out.print("Masukkan status perkuliahan: ");
        boolean status = sc.hasNextBoolean();
        
        System.out.println("=======BIODATA MAHASISWA=======");
        System.out.printf("Universitas \t: "+namauniv);
        System.out.printf("\nNama \t \t: "  + nama);
        System.out.printf("\nNIM\t\t: "+ nim);
        System.out.printf("\nSemester\t: "+ semester);
        System.out.printf("\nJumlah sks\t:  " + sks);
        System.out.printf("\nTahun masuk\t: "+ tahunmasuk);
        System.out.printf("\nIPK        \t: "+ ipk);
        System.out.printf("\nTinggi badan \t: " + tb);
        System.out.printf("\nJenis kelamin \t: " +gender);
        System.out.printf("\nStatus aktif \t: "+status);
    }
}
//soal 3
package evaluasi1;
import java.util.Scanner;
public class soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai r: ");
        double nilair = sc.nextDouble();
        final double pi = 3.14;
        double luas = (pi*(nilair*nilair));
        double keliling = ((pi*nilair)+(pi*nilair));
        
        System.out.println("Jadi luas lingkaran adalah "+luas+ " dan keliling lingkaran adalah "+keliling+ " cm jika nilai r-nya adalah 14 cm");
        System.out.print("Masukkan ulang nilai r : ");
        nilair= sc.nextDouble();
        luas = (pi*(nilair*nilair));
        keliling = ((pi*nilair)+(pi*nilair));
        
        System.out.println("jika nilai r adalah "+nilair+ " cm,maka luas lingkaran adalah "+luas+ " dan keliling lingkaran adalah "+keliling+ " cm");

    }
}


    
