package pertemuan5.no1;

public class DataMhs {

    private String npm;
    private String nama;
    private double nilaiKehadiran;
    private double nilaiTugas;
    private double nilaiUts;
    private double nilaiUas;

    private String grade;
    private String keterangan;

    public void setData(String npm, String nama, double nilaiKehadiran, double nilaiTugas, double nilaiUts, double nilaiUas) {
        this.npm = npm;
        this.nama = nama;
        this.nilaiKehadiran = nilaiKehadiran;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
        getData();
    }

    public void getData() {
        double nilaiAkhir = (0.10 * nilaiKehadiran) + (0.20 * nilaiTugas) + (0.30 * nilaiUts) + (0.40 * nilaiUas);
        if (nilaiAkhir >= 76) {
            grade = "A";
            keterangan = "ISTIMEWA";
        } else if (nilaiAkhir >= 66) {
            grade = "B";
            keterangan = "BAIK";
        } else if (nilaiAkhir >= 56) {
            grade = "C";
            keterangan = "CUKUP";
        } else if (nilaiAkhir >= 46) {
            grade = "D";
            keterangan = "KURANG";
        } else {
            grade = "E";
            keterangan = "KURANG SEKALI";
        }

        System.out.println("\nData yang telah diinput:");
        System.out.println("NPM: " + npm);
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Nilai Kehadiran: " + nilaiKehadiran);
        System.out.println("Nilai Tugas: " + nilaiTugas);
        System.out.println("Nilai UTS: " + nilaiUts);
        System.out.println("Nilai UAS: " + nilaiUas);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Grade: " + grade);
        System.out.println("Keterangan: " + keterangan);
    }
}
