package array2D_search;
import java.util.Arrays;
public class seaching {
    public static void main(String[] args) {
//sequential search
        int data[] = {8, 10, 6, -2, 11, 7, 1, 100};
        int cari = 6;
	int flag = 0;
        int indeks=0;
	for (int i=0; i<8; i++){
		if (data[i] == cari){
		flag = 1;
                indeks = i;
		}
	}
	if (flag == 1){
            System.out.println(cari + " ada di indeks: "+indeks);
        }else{
            System.out.println("Data tidak ada ");
        }
        System.out.println("\n---BATAS---\n");
        
//Indexed Sequential Search
        int arrayData[] = {10, 13, 14, 16, 17, 19, 20, 22, 23, 25, 27, 28, 30};
        int elemen[]={10, 17, 25}; int index[] = {0, 4, 9};
        int cari3 = 20;
        //penentuan index awal - akhir partisi
	int awal = 0, akhir, idx = 0;
	//cari dulu nilainya di array elemen
	for (int i = 0; i < elemen.length; i++) {
	if (cari3 <= elemen[i]){
		idx = i;
		break;
            }
        }

            //dapatkan indeks awal pencarian
        if(idx >=1){
            awal = index[idx-1];
        }

            //dapatkan indeks akhir pencarian
        akhir = index[idx];

        for (int i = awal; i <= akhir; i++) {
            if(cari3 == arrayData[i]) {
                    System.out.println("Ketemu");
            }
        }
            
       System.out.println("\n---BATAS---\n");


//binary search
        int[] data2 = new int[9];
	//int data[9] = {3, 9, 11, 12, 15, 17, 23, 31, 35}
	data2[0] = 3;
	data2[1] = 9;
	data2[2] = 11;
	data2[3] = 12;
	data2[4] = 15;
	data2[5] = 17;
	data2[6] = 23;
	data2[7] = 31;
	data2[8] = 35;
	int l, r, m, n, ketemu, cari2;
	n = 9;
	l = 0;
	r = n - 1;
	ketemu = 0;
	cari2 = 17;
	while ((l<=r) && (ketemu == 0)){
		m = (l+r)/2;
		System.out.println("data tengah :"+ m);
		if (data2[m] == cari2)
			ketemu = 1;
		else if (cari2 < data2[m]){
			System.out.println("Cari di kiri ");
			r = m - 1;
		}
		else{
			l=m+1;
			System.out.println("Cari di kanan ");
		}
	}
	if (ketemu==1)
		System.out.println("data ada");
	else
		System.out.println("data tidak ada");
               
        //menggunakan library Arrays
        int yangDicari = Arrays.binarySearch(data2, cari2);
        System.out.println(cari2 + " ketemu di indeks " + yangDicari);
    }
}
