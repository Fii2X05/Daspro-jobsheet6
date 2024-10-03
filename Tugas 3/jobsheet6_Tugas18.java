import java.util.Scanner;

public class jobsheet6_Tugas18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.println("Masukkan tiga bilangan: ");
        int bil1 = scanner.nextInt();
        int bil2 = scanner.nextInt();
        int bil3 = scanner.nextInt();
        
        // Proses
        if (bil2 >= bil1) {
            if (bil2 >= bil3) {
                System.out.println("Cetak Bilangan Terbesar");
            } else {
                System.out.println("Salah");
            }
        } else {
            System.out.println("Salah");
        }
        
        // End
        scanner.close();
    }
}
