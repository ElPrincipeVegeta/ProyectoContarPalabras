
import java.util.HashMap;

/**
 * @author alumno
 * @version 1.0.14
 *
 *La clase ContarPalabras contiene los métodos necesarios para contabilizar el numero de palabras,
 *así como contar el numero de caracteres. Además puede también contar cuantas veces se repite cada caracter.
 * 
 */
public class ContarPalabras {

/**
 * @param contarNumeroPalabras
 * 
 * Método que cuenta el número de palabras introducido.
 * 
 * @return pal devuelve el contador de palabras.
 * 
* */    
    
    
int contarNumeroPalabras(String cadena) { //cuenta el número de palabras introducido.
int pal=1;
for(int i=0;i<cadena.length();i++) {
if(cadena.charAt(i)==' ')
pal++;
}
return pal;
}

/**
 * @param contarCaracteresTotal
 * 
 * Método que devuelve el número total de caracteres dada una determinada cadena.
 * 
 * @return cont devuelve el contador de caracteres.
 * 
* */    

int contarCaracteresTotal(String cadena) { //devuelve el número total de caracteres dada una determinada cadena.
int cont=0;
for(int i=0;i<cadena.length();i++) {
if(cadena.charAt(i)!=' ')
cont++;
}
return cont;
}

/**
 * @param repeticionesPro
 * 
 * Método que devuelve cuantas veces se repite cada caracter.
 * 
 * 
* */    


static void repeticionesPro(String cad) { //imprime cada caracter con su numero de aparicion
HashMap<Character, Integer> mapa = new HashMap<Character, Integer>();
for(int i=0; i<cad.length();i++) { //guarda todos los caracteres de la cadena con un valor de 1
mapa.put(cad.charAt(i), 1);
}
for(int i=0;i<cad.length();i++) { //recorre la cadena con cada caracter de la misma y...
boolean existeCaracter = mapa.containsKey(cad.charAt(i)); //...si exitse el caracter en la cadena se mete en el if
if(existeCaracter) { //ha existido el carater
int contador = mapa.get(cad.charAt(i)); //se obtiene lo que vale el contador (valor)
mapa.put(cad.charAt(i), contador+1); //se suma al contador (valor) ++
}
} // imprime las claves y valores
for (Character i : mapa.keySet()) { //keySet() devuelve el conjunto de claves
System.out.println("Carácter: " + i + " repeticiones: " + (mapa.get(i)-1)); //imprime la clave y el valor correspondiente a la clave
}
}
}
