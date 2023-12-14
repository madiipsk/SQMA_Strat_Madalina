
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Last2 {

    public Matematica mate;
    @Before
    public void setUp(){
        mate = new Matematica();
    }

    @Test
    public void testEsteParCorect(){
        assertTrue(mate.estePar(6));
        assertTrue(mate.estePar(18));
        assertTrue(mate.estePar(78));
        assertFalse(mate.estePar(5));
        assertFalse(mate.estePar(89));
    }

    @Test
    public void testNrPareListNotNull(){
        List<Integer> lista=mate.nNumerePare(2);
        assertNotNull(lista);
    }
}
