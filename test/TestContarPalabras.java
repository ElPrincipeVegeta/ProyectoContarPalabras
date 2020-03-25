
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tinpl
 */
public class TestContarPalabras {
    ContarPalabras c1 = new ContarPalabras();
    
    Printear p1 = new Printear();
    
    
    public TestContarPalabras() {
        ContarPalabras c1 = new ContarPalabras();
        String cadena = "buenos dias señor";
        assertTrue(c1.contarNumeroPalabras(cadena)==3);
    }

    @Test
    public void ContarPalabras() {
    
    
    
    }
}
