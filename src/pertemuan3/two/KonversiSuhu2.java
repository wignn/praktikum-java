package pertemuan3.two;

public class KonversiSuhu2 extends KonversiSuhu {
    public void fahrenheitToReamur(double fahrenheit) {
        double celcius = (fahrenheit - 32) * 5 / 9;
        double reamur = celcius * 4 / 5;
        System.out.println(fahrenheit + " Fahrenheit = " + reamur + " Reamur");
    }
}
