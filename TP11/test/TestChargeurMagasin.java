import main.ComparateurAlbum;
import main.ComparateurArtiste;
import main.XML.ChargeurMagasin;
import main.donnees.Magasin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.io.IOException;


public class TestChargeurMagasin {


    @Test
    public void testChargerMagasin() throws IOException{
        ChargeurMagasin c = new ChargeurMagasin("FichierTest");
         Magasin m = c.chargerMagasin();

         int nombre = m.getNombreCds();

         assertEquals(12,nombre);

    }

    @Test
    public void testChargerMagasinException(){
        ChargeurMagasin c = new ChargeurMagasin("ttt");

        IOException excep = assertThrows(IOException.class, () -> {
            c.chargerMagasin();
        });
    }


    /**
     * test des methodes de tri de la classe Magasin
     */
    @Test
    public void testTriMagasinParNomCd() throws IOException{
        ChargeurMagasin c = new ChargeurMagasin("FichierTest");
        Magasin m = c.chargerMagasin();
        ComparateurArtiste co = new ComparateurArtiste();
        m.trier(co);
        System.out.println(m);
        assertEquals("Bénabar",m.getCd(0).getNomCD());
        //La méthode renvoie un message d'erreur car il y a un dossier cacher dand le dossier FichierTest
    }
}
