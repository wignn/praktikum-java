package pertemuan4;

class Kubus extends Balok {
    double sisi;
    public Kubus(double sisi) {
        super(sisi, sisi, sisi);
        this.sisi = sisi;
    }
    @Override
    public double hitungVolume() {
        return sisi * sisi * sisi;
    }
    @Override
    public double hitungLuasPermukaan() {
        return 6 * (sisi * sisi);
    }
    @Override
    public void text() {
        System.out.println("===Kubus===");
        System.out.println("volume: " + hitungVolume());
        System.out.println("luas pemukaan" + hitungLuasPermukaan());
    }
}



