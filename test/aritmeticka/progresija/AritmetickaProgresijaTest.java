package aritmeticka.progresija;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test metode pronadji, klase AritmetickaProgresija.
 * Ne koristi se parametarizovano testiranje!
 * @author Ljubo Raicevic <rljubo90@gmail.com>
 */
public class AritmetickaProgresijaTest {
    
    public AritmetickaProgresijaTest() {}

    /**
     * Test metode pronadji, klase AritmetickaProgresija.
     */
    @Test
    public void testPronadji() {
        System.out.println("pronadji");

        //sest test slucaja
        int niz1[] = {1, 2, 3, 4, 6, 7, 8};
        int niz2[] = {10, 30, 50, 90, 110};
        int niz3[] = {7, 13, 25};
        int niz4[] = {-4, -2, 0, 4, 6, 8, 10};
        int niz5[] = {1, 2, 4, 5, 6, 7, 8};
        int niz6[] = {1, 3, 4, 5, 6, 7, 8};
        
        //isprobati sve slucaje
        assertEquals(5, AritmetickaProgresija.pronadji(niz1));
        assertEquals(70, AritmetickaProgresija.pronadji(niz2));
        assertEquals(19, AritmetickaProgresija.pronadji(niz3));
        assertEquals(2, AritmetickaProgresija.pronadji(niz4));
        assertEquals(3, AritmetickaProgresija.pronadji(niz5));
        assertEquals(2, AritmetickaProgresija.pronadji(niz6));
    }
    
}
