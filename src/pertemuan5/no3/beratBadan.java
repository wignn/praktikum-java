package pertemuan5.no3;

public class beratBadan {
    double berat, tinggi, imt;
    public beratBadan(double berat, double tinggi) {
        this.berat = berat;
        this.tinggi = tinggi/100;
        hitungBerat();
    }

    private void hitungBerat() {
        System.out.println("berat = " + tinggi);
        imt = berat / (tinggi * tinggi);
        if (imt <= 18.4) {
            System.out.println("Berat berat kurang");
        } else if (imt >= 18.5 && imt <= 24.9) {
            System.out.println("BeratBadan Ideal ");
        } else if (imt >= 25 && imt <= 29.9) {
            System.out.println("Berat Badan Lebih");
        } else if (imt >= 30 && imt <= 39.9) {
            System.out.println("Gemuk");
        }else {
            System.out.println("sangat gemuk");
        }
    }
}