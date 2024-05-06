import com.google.gson.Gson;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        Converter cv = new Converter();

        boolean encendido = true;

        while (encendido) {
            Scanner sc = new Scanner(System.in);
            float coin;
            System.out.println("Conversión de la moneda mexicana: MXN");
            System.out.println("Revisa la opción a la que te gustaría convertir");
            System.out.println("1. USD - Dólar estadounidense");
            System.out.println("2. COP - Peso colombiano");
            System.out.println("3. ARS - Peso argentino");
            System.out.println("4. Salir del Convertidor");
            System.out.println("Digita el número de tu elección: ");
            int moneda = sc.nextInt();

            switch (moneda) {
                case 1:
                    coin = cv.convirtiendoMonedaUSD("MXN");
                    System.out.println("1.0 MXN = " + coin + " USD");
                    encendido = false;
                    break;
                case 2:
                    coin = cv.convirtiendoMonedaCOP("MXN");
                    System.out.println("1.0 MXN = " + coin + " COP");
                    encendido = false;
                    break;
                case 3:
                    coin = cv.convirtiendoMonedaARS("MXN");
                    System.out.println("1.0 MXN = " + coin + " ARS");
                    encendido = false;
                    break;
                case 4:
                    System.out.println("Hasta la próxima!");
                    encendido = false;
                    System.exit(0);
                default: System.out.println("La moneda introducida no es valida, ingresa un número de opción valido");
            }
        }

        }


}