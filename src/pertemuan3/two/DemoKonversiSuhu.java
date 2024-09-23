package pertemuan3.two;

public class DemoKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu2 konversi1 = new KonversiSuhu2();

        double celcius = 0;
        double fahrenheit = 77;

        konversi1.celciusToFahrenheit(celcius);
        konversi1.celciusToReamur(celcius);
        konversi1.fahrenheitToReamur(fahrenheit);
    }
}