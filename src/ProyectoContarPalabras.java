import java.util.HashMap;
import java.util.Scanner;
public class ProyectoContarPalabras {
Scanner sc = new Scanner(System.in);

/**
 * @author alumno
 * @version 1.0.14
 *
 *La clase main contiene los objetos que utilizan los metodos de los mismos
 * para probar el programa.
 * 
 */


public static void main (String []args) {
    
   
ContarPalabras c1 = new ContarPalabras();
Printear p1 = new Printear();
Scanner sc = new Scanner(System.in);
System.out.print("Introduce un string: ");
String cadenilla = sc.nextLine();
System.out.println("\n"+p1.textoCaracteresTotal (c1.contarCaracteresTotal(cadenilla))+"\n");
System.out.println(p1.textoNumeroPalabras(c1.contarNumeroPalabras(cadenilla))+"\n");

System.out.println("Repeticiones caracteres: \n");
c1.repeticionesPro(cadenilla);
}
}