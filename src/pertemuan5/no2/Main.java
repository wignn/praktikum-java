package pertemuan5.no2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan total pembelian (Rp): ");
        double total = input.nextDouble();
        Pembelian pmb = new Pembelian(total);
    }
}
