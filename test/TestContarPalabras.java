
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tinpl
 */
public class TestContarPalabras {
    @Test
    public void ContarPalabras() {
    
    ContarPalabras c1 = new ContarPalabras();
        String cadena = "buenos dias señor";
        assertTrue(c1.contarNumeroPalabras(cadena)==3);
        assertTrue(c1.contarCaracteresTotal(cadena)==15);
        
    Printear p1 = new Printear();
    
        assertTrue(p1.textoCaracteresTotal(c1.contarCaracteresTotal(cadena)).equals("Total caracteres: "
                +c1.contarCaracteresTotal(cadena)));
    }
}
