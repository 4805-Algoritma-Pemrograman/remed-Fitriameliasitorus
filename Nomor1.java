
import java.util.Scanner;

public class greenbird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah kilometer yang ditempuh oleh penumpang
        System.out.print("Masukkan total kilometer: ");
        double kilometers = scanner.nextDouble();

        // Menghitung biaya taksi
        double fare = greenbird (kilometers);

        // Output hasil perhitungan
        System.out.printf("Total km: %.1f\nHonor taksi: %.1f\n", kilometers, fare);
    }

    private static double greenbird (double kilometers) {
        double fare = 0;

        // Biaya untuk 3 kilometer pertama atau kurang
        if (kilometers <= 3) {
            fare = 20000;
        } else {
            // Biaya untuk lebih dari 3 kilometer
            fare = 20000 + (kilometers - 3) * 10000;
        }

        return fare;
    }
}
