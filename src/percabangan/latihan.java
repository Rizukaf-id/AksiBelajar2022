package percabangan;
import java.util.Scanner;
public class latihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //variables
        int gaji = 4000000, nikah, anak, tunjangan, total_gaji = 0;

        System.out.println("Gaji Karyawan");
        System.out.println("Sudah menikah? (1/0)");
        nikah = input.nextInt();
        switch (nikah){
            case 1:
                System.out.print("Jumlah anak = ");
                anak = input.nextInt();
                if (anak == 0){
                    tunjangan = 500000;
                    total_gaji = gaji + tunjangan;
                } else if (anak == 1){
                    tunjangan = 1000000;
                    total_gaji = gaji + tunjangan;
                } else if (anak == 2){
                    tunjangan = 1500000;
                    total_gaji = gaji + tunjangan;
                } else if (anak > 2){
                    tunjangan = 3000000;
                    total_gaji = gaji + tunjangan;
                }
                System.out.println("Gaji Karyawan sebesar : Rp"+total_gaji);
                break;
            case 0:
                System.out.println(gaji);
                break;
            default:
                System.out.println("Masukan anda salah");
        }
    }
}
