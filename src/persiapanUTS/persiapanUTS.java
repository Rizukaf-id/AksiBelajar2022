package persiapanUTS;
import java.util.Scanner;
public class persiapanUTS {
    public static void main(String[] args) {
        /*Sebuah mesin ATM harus menginputkan username dan pin rekening 
        dengan benar, jika salah satu inputan salah maka tidak akan bisa 
        melanjutkan ke proses transaksi. Pada proses transaksi terdapat 
        pilihan menu transfer uang, pembayaran, dan tarik tunai. Pengguna 
        akan selalu kembali ke menu utama dan tidak akan logout sebelum 
        memilih menu keluar. Buatlah program ATM tersebut.
    User : nama kalian
    Pass : 1234
    */
    //Scanner    
    Scanner input = new Scanner(System.in);
    String user;
    int pin, menu, rekening, nominal;
    boolean acc = false;
        System.out.println("ATM UPN");
        do {
            System.out.print("masukkan username = \n");
            user = input.next();
            System.out.print("masukkan pin = ");
            pin = input.nextInt();
            
            if (user.equalsIgnoreCase("rizka") && pin == 123456) {
                acc = true;
            }else{
                acc = false;
            }
            
            if (acc == true) {
                do {
                    System.out.println("1. Transfer");
                    System.out.println("2. Pembayaran");
                    System.out.println("3. Tarik Tunai");
                    System.out.println("4. Keluar");
                    System.out.print("Pilih menu = ");
                    menu = input.nextInt();
                    switch(menu){
                        case 1:
                            //Transfer
                            System.out.println("Menu Tranfer");
                            System.out.print("Masukkan nomor rekening = ");
                            rekening = input.nextInt();
                            System.out.print("Masukkan nominal = ");
                            nominal = input.nextInt();
                            
                            System.out.println("\nTRANFER KE-" + rekening + 
                                    " dengan nominal Rp" + nominal + " BERHASIL");
                            System.out.println();
                            break;
                        case 2:
                            //pembayaran
                            System.out.println("Menu Pembayaran");
                            System.out.println("1. Listrik");
                            System.out.println("2. PDAM");
                            System.out.print("Pilih = ");
                            int bayar = input.nextInt();
                            if (bayar == 1) {
                                System.out.print("Masukkan nomor meteran = ");
                                int meter = input.nextInt();
                                System.out.print("Masukkan nominal = ");
                                nominal = input.nextInt();
                                
                                System.out.println("Pembayaran tagihan listrik Berhasil\n");
                            }else if (bayar == 2) {
                                System.out.print("Masukkan nomor meteran = ");
                                int meter = input.nextInt();
                                System.out.print("Masukkan nominal = ");
                                nominal = input.nextInt();
                                
                                System.out.println("Pembayaran tagihan PDAM Berhasil\n");
                            }else {
                                System.out.println("Pilihan menu tidak ada\n");
                            }
                            break;
                        case 3:
                            //tarik tunai
                            System.out.println("Menu Tarik Tunai");
                            System.out.print("Masukkan nominal = ");
                            nominal = input.nextInt();
                            
                            System.out.println("Penarikan sejumlah Rp"+nominal+" Berhasil");
                            break;
                        case 4:
                            System.out.println("Anda Keluar");
                            break;
                        default:
                            System.out.println("Pilihan menu salah");
                    }
                } while (menu != 4);
                acc = false;
            }
            System.out.println(acc);
        } while (acc==false);
    }
}
