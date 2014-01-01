package aritmeticka.progresija;

import java.util.Collection;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Test za klasu Korak.
 * @author Ljubo Raicevic <rljubo90@gmail.com>
 */

//mora da stoji @RunWith... da bi JUnit znao da je parametarizovani test
@RunWith(value = Parameterized.class)
public class KorakTest {
    
    //privatne varijable test klase KorakTest, cije vrednosti ce se koristiti
    //u samo jednoj iteraciji parametarizovanog testiranja
    private final int niz[];
    private final int ocekivanaVrednost;
    private Korak korak;
    
    /**
     * Konstruktor testa
     * @param pNiz zadati niz
     * @param pOcekivanaVrednost ocekivana rezultujuca vrednost
     */
    //konstruktor treba da prima tacno onoliko parametara koliko metoda
    //za parametarizaciju salje (metoda za param. je dole "parametri")
    public KorakTest(int[] pNiz, int pOcekivanaVrednost) {
        this.niz = pNiz;
        this.ocekivanaVrednost = pOcekivanaVrednost;
    }
    
    //inicijalizacija testa; u ovom slucaju pravi novi objekat klase Korak
    @Before
    public void initialize() {
        korak = new Korak(niz);
    }
    
    //parametri za test; svaki clan return niza ce biti jedan test slucaj - to
    //znaci da ce se CEO ovaj test ponoviti onoliko puta koliko retrun niz ima
    //clanova, u ovom slucaju 4. svaki clan return niza je po jedan test slucaj
    //i to u ovom primeru: prvi clan je zadati niz, a drugi clan ocekivana
    //vrednost (bas kao u konstruktoru testa). svaki od elemenata return niza 
    //moze da ima bilo koji broj clanova (ne samo 2 kao u ovom primeru), samo 
    //je bitno da konstruktor OVOG TESTA (a ne klase koja se testira) prima isti
    //broj argumenata sa istim tipom podatka
    @Parameters
    public static Collection parametri() {
        return Arrays.asList(new Object[][] {
            //zadati niz, ocekivana vrednost
            { new int[] {1, 2, 3, 4, 6, 7, 8}, 1 },
            { new int[] {10, 30, 50, 90, 110}, 20 },
            { new int[] {7, 13, 25}, 6 },
            { new int[] {-4, -2, 0, 4, 6, 8, 10}, 2 }
        });
    }

    //sama test metoda isprobava SAMO JEDAN PAR - NIZ, OCEKIVANA VREDNOST, zato
    //sto se test izvrsava vise puta, tj svaki clan return niza iz metode za 
    //parametarizaciju je po jedno izvrsenje ovog testa
    @Test
    public void daLiJeDobarKorak() {
        System.out.println("nadjiKorak - za korak: " + ocekivanaVrednost);
        assertEquals(ocekivanaVrednost, korak.nadjiKorak());
    }
}
