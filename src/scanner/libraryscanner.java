package scanner;
//import library scanner
import java.util.Scanner;
public class libraryscanner {
    public static void main(String[] args) {
        //buat object scanner
        Scanner scan = new Scanner(System.in);
        //inisialisasi variabel dan tipe data
        int dolar, rupiah;
        System.out.print("Masukkan Nominal");
        
        //input nominal
        dolar = scan.nextInt();
        
        //operasi aritmatika
        rupiah = dolar * 15000;
        
        //output
        System.out.println("$" + dolar + " sama dengan Rp"+rupiah);
        
        //test commit
    }
}
