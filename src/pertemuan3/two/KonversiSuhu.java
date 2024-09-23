package pertemuan3.two;
public class KonversiSuhu {
    public void celciusToFahrenheit(double celcius) {
        double fahrenheit = (celcius * 9 / 5) + 32;
        System.out.println(celcius + " Celcius = " + fahrenheit + " Fahrenheit");
    }

    public void celciusToReamur(double celcius) {
        double reamur = celcius * 4 / 5;
        System.out.println(celcius + " Celcius = " + reamur + " Reamur");
    }
}
