package aritmeticka.progresija;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test metode nadjiKorak, klase Korak.
 * @author ljubo
 */
public class KorakTest {
    
    public KorakTest() {}

    /**
     * Test metode nadjiKorak, klase Korak.
     */
    @Test
    public void testNadjiKorak() {
        System.out.println("nadjiKorak");

        //test nizovi
        int niz1[] = {1, 2, 3, 4, 6, 7, 8};
        int niz2[] = {10, 30, 50, 90, 110};
        int niz3[] = {7, 13, 25};
        int niz4[] = {-4, -2, 0, 4, 6, 8, 10};
        int niz5[] = {1, 2, 4, 5, 6, 7, 8};
        int niz6[] = {1, 3, 4, 5, 6, 7, 8};
        
        //pravim sest Korak objekata, svaki sa svojim test nizom
        Korak k1 = new Korak(niz1);
        Korak k2 = new Korak(niz2);
        Korak k3 = new Korak(niz3);
        Korak k4 = new Korak(niz4);
        Korak k5 = new Korak(niz5);
        Korak k6 = new Korak(niz6);        
        
        //isprobati sve slucaje
        assertEquals(1, k1.nadjiKorak());
        assertEquals(20, k2.nadjiKorak());
        assertEquals(6, k3.nadjiKorak());
        assertEquals(2, k4.nadjiKorak());
        assertEquals(1, k5.nadjiKorak());
        assertEquals(1, k6.nadjiKorak());
    }
}
