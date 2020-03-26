
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author alumno
 * @version 1.0.14
 *
 *La clase TestContarPalabras contiene los métodos necesarios para comprobar 
 * que las demas clases del programa funcionan correctamente.
 * 
 */

public class TestContarPalabras {
    @Test
    
 /**
 * @param ContarPalabras
 * 
 * método para comprobar
 *  si los los métodos de ContarPalabras y Printear funcionan adecuadamente.
 * 
 * */
    
    public void ContarPalabras() {
    
    ContarPalabras c1 = new ContarPalabras();
        String cadena = "buenos dias señor";
        assertTrue(c1.contarNumeroPalabras(cadena)==3);
        assertTrue(c1.contarCaracteresTotal(cadena)==15);
        
    Printear p1 = new Printear();
    
        assertTrue(p1.textoCaracteresTotal(c1.contarCaracteresTotal(cadena)).equals("Total caracteres: "
                +c1.contarCaracteresTotal(cadena)));
        assertTrue(p1.textoNumeroPalabras(c1.contarNumeroPalabras(cadena)).equals("Total palabras: "
                +c1.contarNumeroPalabras(cadena)));
    }
}
