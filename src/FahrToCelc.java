import java.util.Scanner;

public class FahrToCelc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast et tal du vil omregne fra Fahrenheit til Celcius");

        double fahr = input.nextDouble();
        double celc = (fahr - 32) / 1.8;
        System.out.println("Temperaturen i Fahrenheit: " + fahr + " F");
        System.out.println("Temperaturen omregnet til Celcius: " + celc + " C");

    }
}
