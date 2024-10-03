// Import library Scanner
import java.util.Scanner;

public class Pemilihan2Percobaan1_18Modif2 {
    public static void main(String[] args){
        
        Scanner inputAbsen = new Scanner(System.in);

        
        System.out.print("Masukkan tahun: ");
        int tahun = inputAbsen.nextInt();

        
        if (tahun % 4 == 0) {  
            if (tahun % 100 == 0) {  
                if (tahun % 400 == 0) {  
                    System.out.println(tahun + " adalah tahun kabisat.");
                } else {
                    System.out.println(tahun + " bukan tahun kabisat.");
                }
            } else {  
                System.out.println(tahun + " adalah tahun kabisat.");
            }
        } else {  
            System.out.println(tahun + " bukan tahun kabisat.");
        }

       
        inputAbsen.close();
    }
}
