package PraktikumAscending;
import java.util.Arrays;
public class PraktikumAscending {
    public static void main(String[] args) {
       // Variabel
       int[] bilangan = {20,3,6,1,4,5,9,2,6,10};
       
       // Menampilkan bilangan 
       System.out.println("Bilangan sebelum di sorting Bubble Sort : "+Arrays.toString(bilangan));
       
       // Proses Bubble Sort
       System.out.println("\nProses Bubble Sort secara Ascending: ");
        for (int i = 0; i < bilangan.length; i++) {
            System.out.println("iterasi : " + (i + 1));
            for (int j = 0; j < bilangan.length-1; j++) {
                if (bilangan[j] < bilangan[j+1]) {
                    int temp = bilangan[j];
                    bilangan[j] = bilangan[j+1];
                    bilangan[j+1] = temp;
                }
                System.out.println(Arrays.toString(bilangan));
            }
            System.out.println("Bilangan mari di sorting : " + Arrays.toString(bilangan));
            
        }
    }
}