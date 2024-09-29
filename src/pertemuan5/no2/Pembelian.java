package pertemuan5.no2;

public class Pembelian {
    double totalPembelian;
    double potongan;

    public Pembelian(double totalPembelian){
        this.totalPembelian = totalPembelian;
        hitungPotongan();
    }

    private void hitungPotongan (){
        if(totalPembelian >= 50000){
            potongan = totalPembelian * 0.20;
            System.out.println("Besarnya potongan Rp. " + " 20% ");

        } else{
            System.out.println("Besarnya potongan Rp. " + " 5%");
            potongan = totalPembelian *  0.05;
        }
        System.out.println("Total pembelian Rp. " + totalPembelian);

        double totalBayar = totalPembelian - potongan;
        System.out.println("Jumlah yang harus dibayarkan Rp. " + totalBayar);
    }

}
