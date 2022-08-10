import java.util.Scanner;
public class EstructuraControlif {

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Ingrese el numero a evaluar porfavor:");
       int numeroif = sc.nextInt();

       String resultado;

       String numero = polarimetro(numeroif);
       System.out.println("El numero ingresado es:"+numero);
       }
       public static String polarimetro(int numeroif)
       {

       if (numeroif > 0)
         {
             String resultado = "Positivo";
             return resultado;
         }

       else if (numeroif == 0){
             String resultado = "Cero";
             return resultado;
         }
       else {
           String resultado = "Negativo";
           return resultado;
           }
       }
 }
