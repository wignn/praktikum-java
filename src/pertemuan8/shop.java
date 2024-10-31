package pertemuan8;
import pertemuan8.*;

import java.util.Objects;
import java.util.Scanner;


public class shop {
    public static void main(String[] args) {
        Store store = new Store();


        Scanner input = new Scanner(System.in);
            System.out.print("Masukkan Jumlah Item Barang: ");
            int jumlahItem = input.nextInt();
            String[] kodeBeli = new String[jumlahItem];
            int[] jumlahBeli = new int[jumlahItem];
            int[] hargaTotal = new int[jumlahItem];
            for (int i = 0; i < jumlahItem; i++) {
                System.out.println("Data ke " + (i + 1));
                System.out.print("Masukkan Kode Barang: ");
                kodeBeli[i] = input.next();
                System.out.print("Masukkan Jumlah Beli: ");
                jumlahBeli[i] = input.nextInt();
                int itemIndex = store.getItemIndex(kodeBeli[i]);
                if (itemIndex != -1) {
                    hargaTotal[i] = store.total(itemIndex, jumlahBeli[i]);
                } else {
                    System.out.println("Kode Barang tidak valid!");
                }
            }

            System.out.println("\nTOKO SERBA ADA");
            System.out.println("*******************************");
            System.out.println("No  Kode Barang  Nama Barang  Harga  Jumlah Beli  Jumlah Bayar");
            System.out.println("=============================================================");
            int totalBayar = 0;
            for (int i = 0; i < jumlahItem; i++) {
                int itemIndex = store.getItemIndex(kodeBeli[i]);
                if (itemIndex != -1) {
                    System.out.printf("%-3d %-12s %-12s %-7d %-12d %-12d\n",
                            (i + 1), store.getKodeBarang()[itemIndex], store.getNamaBarang()[itemIndex],
                            store.getHargaBarang()[itemIndex], jumlahBeli[i], hargaTotal[i]);
                    totalBayar += hargaTotal[i];
                }
            }
            System.out.println("=============================================================");
            System.out.println("Total Bayar: " + totalBayar);

    }
}
