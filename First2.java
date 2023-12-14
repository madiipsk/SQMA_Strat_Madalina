import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MatematicaTest {
    //    @Test
//    public void test(){
//        fail("Not yet implemented");
//    }
    public Matematica mate;
    @Before
    public void setUp(){
        mate = new Matematica();
    }

    @Test
    public void testSumaCorecta(){

        int rezultat = mate.suma(5,9);
        assertEquals("Metoda suma e gresita",14,rezultat);

    }

    @Test
    public void testRaportCorect(){

        double rezultat= mate.raport(24,6);
        assertEquals(4.0,rezultat,0.001);
    }
