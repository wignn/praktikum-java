package pertemuan5.no3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukan berat badan(kg): ");
        double berat = input.nextDouble();
        System.out.print("Masukkan tinggi(cm): ");
        double tinggi = input.nextDouble();
        beratBadan bd = new beratBadan(berat, tinggi);
    }
}
