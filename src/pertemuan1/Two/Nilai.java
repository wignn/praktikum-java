package pertemuan1.Two;

public class Nilai {
    String Nim;
    String Nama;
    float NilaiAbsen;
    float NilaiTugas;
    float NilaiUts;
    float NilaiUas;
    float NilaiAkhir;

    float Nilai() {
        NilaiAkhir = (float) (0.1 * NilaiAbsen + 0.2 * NilaiTugas + 0.3 * NilaiUts + 0.4 * NilaiUas);
        return NilaiAkhir;
    }
    void CetakNilai() {
        System.out.println("NIM: " +  " " + Nim);
        System.out.println("Nama: " +  " " + Nama);
        System.out.println("Nilai Absen [10%]: " + NilaiAbsen);
        System.out.println("Nilai Tugas [20%]: "  + NilaiTugas);
        System.out.println("Nilai UTS [30%]: " +  " " + NilaiUts);
        System.out.println("Nilai UAS [40%]: " + " " + NilaiUas);
        System.out.println("Nilai Akhir: " + " " + NilaiAkhir );
    }

}
