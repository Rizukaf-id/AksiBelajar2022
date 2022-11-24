package array2D_search;
import java.util.Scanner;
public class coba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select=0, indeks=0;
        String data[][] = new String[25][2];
        
        do {
            System.out.println("\nMENU UTAMA");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("0. Keluar");
            System.out.println("-------------------------------------");
            System.out.print("select >> ");
            select = input.nextInt();
            
            switch(select){
                case 1:
                    System.out.print("username> ");
                    String nama = input.next();
                    System.out.print("password> ");
                    String pass = input.next();
                    //String convert = Integer.toString(pass);
                    data[indeks][0] = nama; data[indeks][1]=pass;
                    //data[indeks][1]=convert;
                    indeks++;
                    break;
                case 2:
                    boolean correct = false;
                    System.out.print("username> ");
                    String user = input.next();
                    System.out.print("password> ");
                    String pwd = input.next();
                    for (int i = 0; i < data.length; i++) {
                        if (data[i][0].contentEquals(user) && data[i][1].contentEquals(pwd)) {
                            correct = true;
                            System.out.println("LOGIN BERHASIL");
                            break;
                        }else{
                            if (data[i][0]!=null) {
                             System.out.println("username of password incorrect!");
                            }
                        }
                    }
                    if (correct) {
                        System.out.println("SELAMAT DATANG ="+user+"=");
                        System.out.println("press X to logout");
                        String isLogout = input.next();
                        while(isLogout=="X" || isLogout=="x"){
                            System.out.println("LOGOUT BERHASIL");
                            correct = false;
                            break;
                        }
                    }
                    break;
                case 11:
                    System.out.println("username   password");
                    System.out.println("-----------------");
                     for (int i = 0; i < data.length; i++) {
                        if (data[i][0]!=null) {
                             System.out.println(data[i][0]+"        "+data[i][1]);
                        }
                    }
                    break;
                case 0:
                    System.out.println("PROGRAM ENDED");
                    break;
                default:
                    System.out.println("WRONG INPUT!");
            }
        } while (select!=0);
    }
}
