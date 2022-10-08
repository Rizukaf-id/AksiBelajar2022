package perulangan;
public class perulangan {
    public static void main(String[] args) {
        //While loop
        int angka = 0;
        while (angka < 5) {
            System.out.println("Hello Wolrd!");
            System.out.println(angka);
            angka++;
        }
        

        //Do While loop
        int angka2 = 1;
        do {
            System.out.println(angka2);
            angka2++;
        }while (angka2 <= 10);

         

        //For loop
        for (int i = 0; i < 37; i++) {
            System.out.println(i+"Aduk");
        }

        //Nested For Loop
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
