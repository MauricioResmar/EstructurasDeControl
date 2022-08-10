import java.util.Scanner;
public class EstructuraControlSwitch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la estacion:");
        var estacion = sc.nextLine();

        switch (estacion){
                case "PRIMAVERA":
                System.out.println("La estacion es:" + estacion);
                    break;

                case "VERANO":
                    System.out.println("La estacion es:" + estacion);
                    break;

                case "OTONO":
                    System.out.println("La estacion es:" + estacion);
                    break;

                case "INVIERNO":
                    System.out.println("La estacion es:" + estacion);

            default:
                System.out.println("Lo siento amig@, La cadena ingresada no corresponde a una estacion valida ");
        }
    }
}
