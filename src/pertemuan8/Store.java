package pertemuan8;

public class Store {
    private String[] kodeBarang = {"a001", "a002", "a003"};
    private String[] namaBarang = {"Buku", "Pensil", "Pulpen"};
    private int[] hargaBarang = {3000, 4000, 5000};

    public String[] getKodeBarang() {
        return kodeBarang;
    }

    public String[] getNamaBarang() {
        return namaBarang;
    }

    public int[] getHargaBarang() {
        return hargaBarang;
    }

    public int total(int itemIndex, int quantity) {
        for (int j = 0; j < kodeBarang.length; j++) {
            if (itemIndex == j) {
                return hargaBarang[j] * quantity;
            }
        }
        return 0;
    }

    public int getItemIndex(String kode) {
        for (int j = 0; j < kodeBarang.length; j++) {
            if (kode.equals(kodeBarang[j])) {
                return j;
            }
        }
        return -1;
    }
}
