package method;
import java.util.Scanner;
public class coba {
    static String akun[][] = new String [25][2];
    static int indeks = 0;
    static boolean correct = false;
    
    static void register(String u, String p){
        akun[indeks][0] = u;
        akun[indeks][1] = p;
        indeks++;
    }
    
    static boolean login(String us, String pw){
        
        for (int i = 0; i < akun.length; i++) {
            if (akun[i][0].contentEquals(us) && akun[i][1].contentEquals(pw)) {
                correct = true;
                System.out.println("LOGIN BERHASIL");
                break;
            }
        }
        return correct;
    }
    
    static void baca(){
        System.out.println("Username    password");
        for (int i = 0; i < akun.length; i++) {
            if (akun[i][0]!=null) {
                System.out.println(akun[i][0]+" "+akun[i][1]);
                } 
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;
        do {
            System.out.println("1. Registrasi");
            System.out.println("2. Login");
            System.out.println("3. lihat akun");
            System.out.println("0. Exit");
            System.out.print("Select>> ");
            menu = input.nextInt();
            switch(menu){
                case 1:
                    System.out.print("user name: ");
                    String user = input.next();
                    System.out.print("password: ");
                    String pass = input.next();
                    register(user, pass);
                    break;
                case 2:
                    System.out.print("user name: ");
                    String username = input.next();
                    System.out.print("password: ");
                    String password = input.next();
                    login(username, password);
                    if (correct) {
                        String isLogin;System.out.println("WELCOME ="+username+"=");
                        System.out.println("Press 'X' to Exit");
                        isLogin = input.next();
                        while(isLogin.contentEquals("X")|| 
                                isLogin.contentEquals("x")){
                            break;
                        }
                    }else{
                        System.out.println("username or password incorrect!");
                    }
                    break;
                case 3:
                    baca();
                    break;
                case 0:
                    System.out.println("PROGRAM STOPED");
                    break;
                default:
                    System.out.println("MASUKAN SALAH");
            }
        } while (menu!=0);
    }
}
