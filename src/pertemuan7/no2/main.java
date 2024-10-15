package pertemuan7.no2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        loop lp = new loop();
        Scanner input = new Scanner(System.in);
        System.out.println("============== Loop ==============");
        System.out.print("Masukkan ukuran: ");
        int ukuran = input.nextInt();
        lp.setLoop(ukuran);
    }
}
