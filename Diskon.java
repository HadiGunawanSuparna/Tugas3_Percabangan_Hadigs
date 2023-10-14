import java.util.Scanner;

public class Diskon {
    public static void main(String[] args) {
        double totalBelanja;
        double diskon = 0.05; // 5% diskon

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total belanja: ");
        totalBelanja = input.nextDouble();

        if (totalBelanja > 1000000) {
            double jumlahDiskon = totalBelanja * diskon;
            double totalSetelahDiskon = totalBelanja - jumlahDiskon;

            System.out.println("Anda mendapatkan diskon sebesar 5%.");
            System.out.println("Jumlah diskon: " + jumlahDiskon);
            System.out.println("Total belanja setelah diskon: " + totalSetelahDiskon);
        } else {
            System.out.println("Total belanja: " + totalBelanja);
            System.out.println("Anda tidak mendapatkan diskon.");
        }

        input.close();
    }
}
