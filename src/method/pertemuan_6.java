package method;
import java.util.Scanner;
public class pertemuan_6 {
    static String akun[][] = new String [25][2];
    static int indeks = 0, menu;
    static boolean correct = false;
    
    static void registrasi(String u, String p){
        akun[indeks][0] = u;
        akun[indeks][1] = p;
        indeks++;
    }
    
    static void lihat(){
        System.out.println("username    password");
        for (int i = 0; i < akun.length; i++) {
            if (akun[i][0]!=null) {
                System.out.println(akun[i][0]+" "+akun[i][1]);
            }
        }
    }
    
    static boolean login(String u, String p){
        
        for (int i = 0; i < akun.length; i++) {
            if (akun[i][0]!=null) {
                if (akun[i][0].contentEquals(u) && 
                        akun[i][1].contentEquals(p)) {
                    correct = true;
                    System.out.println("LOGGIN BERHASIL");
                    break;
                }
            }
        }
        return correct;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("1. Registrasi");
            System.out.println("2. Login");
            System.out.println("3. Lihat akun");
            System.out.println("0. Keluar");
            System.out.print("select>>");
            menu = input.nextInt();
            switch(menu){
                case 1:
                    System.out.print("username: ");
                    String user = input.next();
                    System.out.print("password: ");
                    String pass = input.next();
                    registrasi(user, pass);
                    break;
                case 2:
                    System.out.println("username: ");
                    String username = input.next();
                    System.out.println("password: ");
                    String password = input.next();
                    login(username, password);
                    if (correct) {
                        System.out.println("WELLCOME "+username);
                        System.out.println("PRESS 'X' to Exit");
                        String isLogin = input.next();
                        while(isLogin.contentEquals("X")||
                                isLogin.contentEquals("x")){
                            correct = false;
                            break;
                        }
                    }else{
                        System.out.println("USERNAME or PASSWORD INCORRECT");
                    }
                    break;
                case 3:
                    lihat();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("WRONG INPUT");
            }
        } while (menu!=0);
    }
    
    
    
}
