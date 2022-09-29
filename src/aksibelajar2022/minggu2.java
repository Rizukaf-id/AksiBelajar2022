package aksibelajar2022;
import java.util.Scanner;
public class minggu2 {
    public static void main(String[] args) {
        //inisialisasi variabel
        Scanner scan = new Scanner(System.in);
        int sudah_menikah, anak, gaji = 4000000, tunjangan = 0, total_gaji;
        
        System.out.println("PROGRAM GAJI PERUSAHAAN WAKANDA");
        System.out.print("Sudah menikah? \n(1. sudah 0. belum)\n> ");
        sudah_menikah = scan.nextInt();
        
        switch(sudah_menikah){
            case 0:
                System.out.println("Gaji karyawan sebesar >> Rp"+gaji);
                break;
            case 1:
                System.out.print("Jumlah anak > ");
                anak = scan.nextInt();
                if (anak == 0) {
                    tunjangan = 500000;
                    total_gaji = gaji+tunjangan;
                    System.out.println("Gaji Karyawan Sebesar >> Rp"+total_gaji);
                }else if (anak == 1) {
                    tunjangan = 1000000;
                    total_gaji = gaji+tunjangan;
                    System.out.println("Gaji Karyawan Sebesar >> Rp"+total_gaji);
                }else if (anak == 2) {
                    tunjangan = 1500000;
                    total_gaji = gaji+tunjangan;
                    System.out.println("Gaji Karyawan Sebesar >> Rp"+total_gaji);
                }else{
                    tunjangan = 3000000;
                    total_gaji = gaji+tunjangan;
                    System.out.println("Gaji Karyawan Sebesar >> Rp"+total_gaji);
                }
                    break;
            default:
                System.out.println("Input salah");
        }
        
//        if (sudah_menikah == 1) {
//            System.out.print("Jumlah anak > ");
//            anak = scan.nextInt();
//            if (anak == 0) {
//                tunjangan = 500000;
//                total_gaji = gaji+tunjangan;
//                System.out.println("Gaji Karyawan Sebesar >> Rp"+total_gaji);
//            }else if (anak == 1) {
//                tunjangan = 1000000;
//                total_gaji = gaji+tunjangan;
//                System.out.println("Gaji Karyawan Sebesar >> Rp"+total_gaji);
//            }else if (anak == 2) {
//                tunjangan = 1500000;
//                total_gaji = gaji+tunjangan;
//                System.out.println("Gaji Karyawan Sebesar >> Rp"+total_gaji);
//            }else{
//                tunjangan = 3000000;
//                total_gaji = gaji+tunjangan;
//                System.out.println("Gaji Karyawan Sebesar >> Rp"+total_gaji);
//            }
//        }else if (sudah_menikah == 0) {
//            System.out.println("Gaji karyawan sebesar >> Rp"+gaji);
//        }
    }
}
