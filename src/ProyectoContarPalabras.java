import java.util.HashMap;
import java.util.Scanner;
public class ProyectoContarPalabras {
Scanner sc = new Scanner(System.in);
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