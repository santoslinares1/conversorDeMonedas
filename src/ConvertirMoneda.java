import java.util.Scanner;

public class ConvertirMoneda{
    public static void converit(String base_code, String target_code, ConsultaConversorApiPair consulta) {
        double cantidad;
        double cantidadConvertida;
        Scanner cambio = new Scanner(System.in);
        System.out.printf("Ingrese la cantidad de %s a convertir en %s: ", base_code, target_code);
        cantidad = cambio.nextDouble();
        Moneda usdToBrl = consulta.buscador(base_code, target_code);

        cantidadConvertida = cantidad * usdToBrl.conversion_rate();
        System.out.printf("La cantidad de %s en %s es: %.0f", target_code, base_code, cantidad);
        System.out.println(cantidadConvertida);
    }
}
