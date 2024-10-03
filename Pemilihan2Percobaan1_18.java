import java.util.Scanner;

public class Pemilihan2Percobaan1_18 {
    public static void main(String[] args){
        Scanner inputAbsen = new Scanner(System.in);

        System.out.print("Masukkan tahun: ");
        int tahun = inputAbsen.nextInt();

        if((tahun % 4) == 0){
            if ((tahun % 100) != 0)
                System.out.println("Tahun kabisat: ");
        } else 
            System.out.println("Bukan tahun kabisat");
        
    }
}