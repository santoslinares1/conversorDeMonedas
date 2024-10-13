import java.util.Scanner;

public class Menu {
    public static void menu() {
        double convertido;
        ConsultaConversorApiPair consulta = new ConsultaConversorApiPair();
        int opcion = 0;
        Scanner lectura = new Scanner(System.in);
        Scanner cambio = new Scanner(System.in);
        while (opcion != 7) {
            System.out.println("#############################################################");
            System.out.println("Bienvenido al Conversor de monedas");
            System.out.println("1) Dolar ==> Peso Argentino");
            System.out.println("2) Peso Argentino ==> Dolar");
            System.out.println("3) Dolar ==> Real brasilero");
            System.out.println("4) Real brasilero ==> Dolar");
            System.out.println("5) Dolar ==> Peso colombiano");
            System.out.println("6) Peso colombiano ==> Dolar");
            System.out.println("7) Salir");
            System.out.println("#############################################################");
            System.out.print("Ingrese una opcion: ");
            opcion = lectura.nextInt();
            if (opcion >= 8 || opcion <= -1) {
                System.out.println("Opcion no valida");
            }
            switch (opcion) {
                case 1:
                    System.out.println("1) Dolar ==> Peso Argentino");
                    ConvertirMoneda.converit("USD", "ARS", consulta);
                    break;
                case 2:
                    System.out.println("2) Peso Argentino ==> Dolar");
                    ConvertirMoneda.converit("ARS", "USD", consulta);
                    break;
                case 3:
                    System.out.println("3) Dolar ==> Real brasilero");
                    ConvertirMoneda.converit("USD", "BRL", consulta);
                    break;
                case 4:
                    System.out.println("4) Real brasilero ==> Dolar");
                    ConvertirMoneda.converit("BRL", "USD", consulta);
                    break;
                case 5:
                    System.out.println("5) Dolar ==> Peso colombiano");
                    ConvertirMoneda.converit("USD", "COP", consulta);
                    break;
                case 6:
                    System.out.println("6) Peso colombiano ==> Dolar");
                    ConvertirMoneda.converit("COP", "USD", consulta);
                    break;
                case 7:
                    System.out.println("Gracias por utilizar este conversor");
                    break;
            }
        }
    }
}


