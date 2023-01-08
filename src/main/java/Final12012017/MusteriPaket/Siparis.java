package Final12012017.MusteriPaket;

import java.util.ArrayList;
import Final12012017.OdemePaketi.IOdeme;
import Final12012017.OdemePaketi.Nakit;
import Final12012017.OdemePaketi.Taksit;

/**
 *
 * @author emirs
 */
public abstract class Siparis implements IOdeme{
    private int tutar;
    ArrayList<String> malzemeler = new ArrayList<>();
    public ArrayList<IOdeme> odemeler = new ArrayList<>();
    
    boolean getOdemeDurumu(){
        for (IOdeme iOdeme : odemeler) {
            if (iOdeme instanceof Taksit) {
                Taksit taksit = (Taksit)iOdeme;
                if (taksit.getKalan() != 0) {
                    return false;
                }
            }
        }
        return true;
    }
    
    int getTaksitliOdeme(){
        int taksitliToplam = 0;
        for (IOdeme iOdeme : odemeler) {
            if (iOdeme instanceof Taksit) {
                taksitliToplam += iOdeme.getOdemeMiktari();
            }
        }
        return taksitliToplam;
    }
    
    public int getTutar(){
        return tutar;
    }
    public void setTutar(int tutar){
        this.tutar = tutar;
    }
}
