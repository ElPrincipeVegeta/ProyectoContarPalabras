import java.util.HashMap;
import java.util.Scanner;
public class ProyectoContarPalabras {
Scanner sc = new Scanner(System.in);
public static void main (String []args) {
Scanner sc = new Scanner(System.in);
System.out.print("Introduce un string: ");
String cadenilla = sc.nextLine();
System.out.println("\n"+textoCaracteresTotal (contarCaracteresTotal(cadenilla))+"\n");
System.out.println(textoNumeroPalabras(contarNumeroPalabras(cadenilla))+"\n");
System.out.println("Repeticiones caracteres: \n");
repeticionesPro(cadenilla);
}

static String textoCaracteresTotal (int total) {
return ("Total caracteres: "+total);
}
static String textoNumeroPalabras (int total) {
return ("Total palabras: "+total);
}
}