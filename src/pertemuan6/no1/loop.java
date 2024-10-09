package pertemuan6.no1;

public class loop {

    public void prima(int put) {
        System.out.println("Bilangan Prima dan Bukan dari 0 - 20:");
        for (int i = 0; i <= put; i++) {
            if (i < 2) {
                System.out.println(i + " bukan prima.");
            } else {
                boolean isPrima = true;

                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrima = false;
                        break;
                    }
                }

                if (isPrima) {
                    System.out.println(i + " prima.");
                } else {
                    System.out.println(i + " bukan prima.");
                }
            }

        }

    }


    public void ganjilGenap(int put) {
        System.out.println("Bilangan Ganjil dan Genap dari 0 - 20:");
        for (int i = 0; i <= put; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " adalah bilangan genap.");
            } else {
                System.out.println(i + " adalah bilangan ganjil.");
            }
        }
    }

    public void aSampaiZ() {
        System.out.println("Huruf Z - A:");
        for (char huruf = 'Z'; huruf >= 'A'; huruf--) {
            System.out.print(huruf + " ");
        }
    }

    public void anakAyam(int put) {
        System.out.println("Lagu 'Anak Ayam Turun N':");
        for (int n = put; n > 0; n--) {
            System.out.println("Anak ayam turun " + n);
        }
    }


}
