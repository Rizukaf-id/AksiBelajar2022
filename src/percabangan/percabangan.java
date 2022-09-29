package percabangan;
import java.util.Scanner;
public class percabangan {
    public static void main(String[] args) {
        //variable scanner
        Scanner scan = new Scanner(System.in);

        //sekuensial
        //inisialisasi variabel
        String nama, npm;

        System.out.println("Nama : ");
        //input bisa pakai spasi .nextLine()
        nama = scan.nextLine();
        System.out.println("NPM : ");
        //input tanpa spasi karena memakai .next()
        npm = scan.next();
        System.out.println("Nama > "+nama);
        System.out.println("NPM > "+npm);

        //percabangan if else
        //inisialisasi variabel
        int nilai;
        String grade = "0";
        System.out.print("Nilai : ");
        nilai = scan.nextInt();

        if (nilai >= 85 && nilai <= 100){
            grade = "A";
        }else if (nilai > 70 && nilai < 85){
            grade = "B";
        }else if (nilai >= 70){
            grade = "C";
        } else{
            
        }
        System.out.println("Nilai = "+grade);
        
        //switch case
        switch (grade){
            case "A":
                System.out.println("Memuaskan");
                break;
            case "B":
                System.out.println("Lulus");
                break;
            case "C":
                System.out. println("tidak lulus");
                break;
            default:
                System.out.println("Belum ikut kelas");
        }
        
        //switch case lambda
        switch (grade){
            case "A", "B"->
                System.out.println("Lulus");
            case "C"->
                System.out. println("tidak lulus");
            default ->
                System.out.println("Belum ikut kelas");
        }
    }
}
