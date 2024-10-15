package pertemuan7.no2;

public class loop {

    public void setLoop(int size) {
        head(size);
        body(size);
    }
    private void head(int size) {
        for (int j = 0; j <= size; j++) {
            if (j == 0) {
                System.out.print("\t");
            } else {
                System.out.print(j + "\t");
            }
        }
        System.out.println();
    }

    private void body(int size) {
        for (int i = 1; i <= size; i++) {
            System.out.print(i + "\t");
            for (int j = 1; j <= size; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }

    }

}
