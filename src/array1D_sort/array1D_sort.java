package array1D_sort;
import java.util.Arrays;
public class array1D_sort {
    public static void main(String[] args) {
        String user [] = new String [10];
        int skor [] = {230, 200, 100, 120, 430, 560, 320, 0, 50, 730};
        user[0] = "ahmad"; user[5] = "rozak";
        user[1] = "abdul"; user[6] = "thoriq";
        user[2] = "sumbul"; user[7] = "sylvy";
        user[3] = "karim"; user[8] = "anas";
        user[4] = "kaled"; user[9] = "amar";
        
        System.out.println("TOP SKOR [Bubble sort]");
        for (int i = 0; i < skor.length; i++) {
            for (int j = 0; j < skor.length-1; j++) {
                if (skor[j]<skor[j+1]) {
                    
                    int temp = skor[j];
                    skor[j] = skor[j+1];
                    skor[j+1] = temp;
                    
                    String tmp = user[j];
                    user[j] = user[j+1];
                    user[j+1] = tmp;
                }
            }
        }
        String tampil [][] = new String [10][2];
        for (int i = 0; i < user.length; i++) {
            String tampil_skor = Integer.toString(skor[i]);
            System.out.println((tampil[i][0]=user[i]) + "   " + (tampil[i][1]=tampil_skor));
        }
        System.out.println("");
        
        System.out.println("USERNAME A-Z [selection sort]");
        for (int i = 0; i < user.length-1; i++) {
            for (int j = 0; j < user.length; j++) {
                if (user[i].compareToIgnoreCase(user[j])<0) {
                    String sementara = user[j];
                    user[j] = user[i];
                    user[i] = sementara;
                    
                    int smtr = skor[j];
                    skor[j] = skor[i];
                    skor[i] = smtr;
                }
            }
        }
        
        for (int i = 0; i < user.length; i++) {
            String tampil_skor = Integer.toString(skor[i]);
            System.out.println((tampil[i][0]=user[i]) + "   " + (tampil[i][1]=tampil_skor));
        }
        System.out.println("");
        
        
        int data[] = {2, 3, 1, 5, 4, 8, 7, 6, 0};
        Arrays.sort(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
    }
}
