package array2D_search;
import java.util.Scanner;
public class registerLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String akun [][] = new String [25][2];
        int indeks = 0, menu; 
        do {
        System.out.println("1. Registrasi");
        System.out.println("2. Login");
        System.out.println("0. Exit");
        System.out.print("Select>> ");
        menu = input.nextInt();
        switch(menu){
            case 1:
                System.out.print("user name: ");
                String username = input.next();
                System.out.print("password: ");
                String password = input.next();
                akun[indeks][0] = username;
                akun[indeks][1] = password;
                indeks++;
                System.out.println("Username    password");
                for (int i = 0; i < akun.length; i++) {
                    
                    if (akun[i][0]!=null) {
                        
                        System.out.println(akun[i][0]+" "+akun[i][1]);
                    } 
                }
                break;
            case 2:
                boolean correct = false;
                System.out.print("username: ");
                String user = input.next();
                System.out.print("password: ");
                String pass = input.next();
                
                for (int i = 0; i < akun.length; i++) {
                    if (akun[i][0].contentEquals(user) && 
                            akun[i][1].contentEquals(pass)) {
                        correct = true;
                        System.out.println("LOGIN SUCCESFULL");
                        break;
                    }
                }
                
                if (correct) {
                    String isLogin;System.out.println("WELCOME ="+user+"=");
                    System.out.println("Press 'X' to Exit");
                    isLogin = input.next();
                    while(isLogin.contentEquals("X")|| 
                            isLogin.contentEquals("x")){
                        break;
                    }
                } else{
                    System.out.println("username or password incorrect!");
                }
                break;
            case 0:
                System.out.println("EXIT");
                break;
        }
        } while (menu!=0);
        
    }
}
