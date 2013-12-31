package aritmeticka.progresija;

/**
 * Zadati su aritmeticki nizovi integera. Pronaci clan koji nedostaje.
 * @author ljubo raicevic
 */
public class AritmetickaProgresija {
    /**
     * @param args argumenti sa komandne linije - ignorse argumente
     */
    public static void main(String[] args) {
        int niz[] = {1, 2, 3, 5, 6, 7};
        System.out.println("Niz je 1 2 3 5 6 7.");
        System.out.println("Element koji nedostaje je:");
        System.out.println(pronadji(niz));
    }

    /**
     * Trazi korak koji nedostaje u aritmetickom nizu
     * @param niz zadati niz
     * @return vraca element koji nedostaje; ukoliko su svi elementi na broju 0
     */
    public static int pronadji(int[] niz) {        
        //pronaci korak aritmeticke progresije        
        Korak korak = new Korak(niz);
                
        //pronaci element koji nedostaje       
        for (int iCount = 0; iCount < niz.length - 1; iCount++) {
           if (niz[iCount+1] - niz[iCount] != korak.nadjiKorak()) {
               return niz[iCount] + korak.nadjiKorak();
           } 
        }
        
        //ako su svi elementi na broju vrati 0
        return 0;
    }
    
}