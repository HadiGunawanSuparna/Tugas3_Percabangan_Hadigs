import java.util.Scanner;

public class IndeksNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = input.nextInt();

        String indeksNilai;

        if (bilangan >= 0 && bilangan <= 55) {
            indeksNilai = "D";
        } else if (bilangan > 55 && bilangan <= 65) {
            indeksNilai = "C";
        } else if (bilangan > 65 && bilangan <= 75) {
            indeksNilai = "B";
        } else if (bilangan > 75) {
            indeksNilai = "A";
        } else {
            indeksNilai = "Tidak valid";
        }

        System.out.println("Indeks nilai: " + indeksNilai);

        input.close();
    }
}
