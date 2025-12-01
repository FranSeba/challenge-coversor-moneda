import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
//        En este emocionante desafío de programación, te invitamos a construir tu propio Conversor de Monedas.
//
//        Aprenderás a realizar solicitudes a una API de tasas de cambio, a manipular datos JSON y, finalmente, a filtrar y mostrar las monedas de interés.
//
//                Los pasos para completar este desafío se detallarán a continuación y estarán disponibles en la sección adyacente:
//
//        Configuración del Ambiente Java;
//
//        Creación del Proyecto;
//
//        Consumo de la API;
//
//        Análisis de la Respuesta JSON;
//
//        Filtro de Monedas;
//
//        Exibición de Resultados a los usuarios;
        Scanner lector = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();
        int opcion = 0;

        while(opcion != 7){
            System.out.println("*************************************************************");
            System.out.println("***********  BIENVENIDO AL CONVERSOR DE MONEDAS  ***********");
            System.out.println("*************************************************************");
            System.out.println("1) Dolar a Pesos Argentinos");
            System.out.println("2) Pesos Argentinos a Dolar");
            System.out.println("3) Dolar a Real Brasileño");
            System.out.println("4) Real Brasileño a Dolar");
            System.out.println("5) Dolar a Pesos Colombianos");
            System.out.println("6) Pesos Colombianos a Dolar");
            System.out.println("7) Salir");
            System.out.println("*************************************************************");
            System.out.println("Elija una opción: ");

            try{
                opcion = Integer.parseInt(lector.nextLine());
                double cantidad = 0;
                if (opcion == 7 ){
                    System.out.println("Gracias por usar el conversor de monedas! Hasta luego!");
                    break;
                }
                if (opcion < 1 || opcion > 6) {
                    System.out.println("Opción no válida. Por favor elija un número del 1 al 7.");
                    continue;
                }

                System.out.println("Ingrese la cantidad a convertir: ");
                cantidad = Double.parseDouble(lector.nextLine());
                Moneda moneda = null;

                switch (opcion) {
                    case 1:
                        moneda = consulta.convertirMoneda("USD", "ARS",cantidad);
                        break;
                    case 2:
                        moneda = consulta.convertirMoneda("ARS", "USD",cantidad);
                        break;
                    case 3:
                        moneda = consulta.convertirMoneda("USD", "BRL",cantidad);
                        break;
                    case 4:
                        moneda = consulta.convertirMoneda("BRL", "USD",cantidad);
                        break;
                    case 5:
                        moneda = consulta.convertirMoneda("USD", "COP",cantidad);
                        break;
                    case 6:
                        moneda = consulta.convertirMoneda("COP", "USD",cantidad);
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
                System.out.println("Moneda base: " + moneda.base_code());
                System.out.println("Moneda objetivo: " + moneda.target_code());
                System.out.println("Cantidad: " + cantidad);
                System.out.println("Resultado de la conversión: " + moneda.conversion_result());

            }catch (NumberFormatException e){
                System.out.println("Error: Debe ingresar un número válido entero (1-7)." + e.getMessage());
            }catch (RuntimeException e){
                System.out.println("Error:" + e.getMessage());
            }
        }




    }
}
