package aritmeticka.progresija;

/**
 * Klasa koja za zadati aritmetciki niz sa jednim elementom koji nedostaje
 * pronalazi korak.
 * @author Ljubo Raicevic <rljubo90@gmail.com>
 */
public class Korak {

    /**
     * Zadati niz
     */
    int niz[];
    
    /**
     * Konstruktor klase Korak
     * @param pNiz zadati niz
     */
    public Korak(int pNiz[]) {
        niz = pNiz;
    }

    /**
     * Trazi korak niza
     * @return vraca korak niza
     */
    public int nadjiKorak() {
        return (niz[1] - niz[0] < niz[2] - niz[1]) ? 
                niz[1] - niz[0] : niz[2] - niz[1];
    }
    
}
