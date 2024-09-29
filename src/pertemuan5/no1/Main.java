package pertemuan5.no1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataMhs data = new DataMhs();

        Scanner input = new Scanner(System.in);
        System.out.print("Npm: ");
        String npm = input.nextLine();

        System.out.print("Nama Mahasiswa: ");
        String nama = input.nextLine();

        System.out.print("Nilai Kehadiran: ");
        double nilaiKehadiran = input.nextDouble();

        System.out.print("Nilai Tugas: ");
        double nilaiTugas = input.nextDouble();

        System.out.print("Nilai Uts: ");
        double nilaiUts = input.nextDouble();

        System.out.print("Nilai Uas: ");
        double nilaiUas = input.nextDouble();
        data.setData(npm, nama, nilaiKehadiran, nilaiTugas, nilaiUts, nilaiUas);
    }
}
