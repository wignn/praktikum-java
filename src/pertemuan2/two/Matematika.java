package pertemuan2.two;

public class Matematika implements InterfaceMatematika {
    public void pertambahan(int a, int b){
        int r = a + b;
        System.out.println("pertambahan :" + a + " + " + b + " = " + r);
    }
    public void  pengurangan(int a, int b){
        int r = a - b;
        System.out.println("pengurangan :" + a + " - " + b + " = " + r);
    }
    public void perkalian (int a, int b){
        int r = a * b;
        System.out.println("pengurangan :" + a + " * " + b + " = " + r);
    }
    public void pembagian (int a, int b){
        int r = a / b;
        System.out.println("pembagian :" + a + " / " + b + " = " + r);
    }
}

