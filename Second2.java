import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Second2 {
    public Matematica mate;
    @Before
    public void setUp(){
        mate = new Matematica();
    }

    @Test
    public void testRaportZecimalCorect(){

        double rezultat= mate.raport(27,6);
        assertEquals(4.5, rezultat,0.001);
    }

    @Test
    public void testRaportShouldThrowException(){
        try{
            mate.raport(34,0);
            fail("Nu trebuia sa ajung aici");
        }catch (IllegalArgumentException exceptie){}

    }
