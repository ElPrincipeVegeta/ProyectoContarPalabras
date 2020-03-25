
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tinpl
 */
public class TestContarPalabras {
    ContarPalabras c1 = new ContarPalabras();
    
    Printear p1 = new Printear();
    
    @Test
    public void ContarPalabras() {
    
    ContarPalabras c1 = new ContarPalabras();
        String cadena = "buenos dias señor";
        assertTrue(c1.contarNumeroPalabras(cadena)==3);
        assertTrue(c1.contarCaracteresTotal(cadena)==15);
    
    }
}
