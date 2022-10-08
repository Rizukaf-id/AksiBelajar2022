package perulangan;
import java.util.Scanner;
public class latihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //solusi pertama
        int total = 0;
        String nama;

        System.out.println("=== PROGRAM TOTAL DAN RATA-RATA NILAI ===");
        System.out.print("Nama = ");
        nama = input.next();
        System.out.println("");

        for (int i=0; i<5; i++){
            System.out.print("Masukkan Nilai "+ (i+1) +" = ");
            total += input.nextInt();
        }

        System.out.println("");
        System.out.println("TOTAL NILAI : " + total);
        System.out.println("RATA-RATA NILAI : " + total/5);
        
        //solusi kedua
        int jumlah = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan nilai");
            int nilai = input.nextInt();
            jumlah += nilai;
        }
        System.out.println(jumlah);
        System.out.println(jumlah/5);

    }
}
