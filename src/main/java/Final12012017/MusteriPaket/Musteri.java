package Final12012017.MusteriPaket;

import java.util.ArrayList;
import Final12012017.OdemePaketi.*;

/**
 *
 * @author emirs
 */
public class Musteri {
    String adi, soyadi;
    String[] adresler;
    
    static final String firma = "FSM";
    
    public ArrayList<Siparis> siparisler = new ArrayList<>();
    public ArrayList<Musteri> tumMusteriler = new ArrayList<>();
    
    public ArrayList<Musteri> getOdemesiBitenler(){
        ArrayList<Musteri> musteriler = new ArrayList<>();
        for (Musteri musteri : tumMusteriler) {
            boolean odendiMi = true;
            for (Siparis siparis : musteri.siparisler) {
                if(siparis.getOdemeDurumu() == false){
                    odendiMi = false;
                }
            }
            if (odendiMi) {
                musteriler.add(musteri);
            }            
        }
        return musteriler;
    }
    
    void getBirdenFazlaAdresliler(){
        for (Musteri musteri : tumMusteriler) {
            int adresSayisi = 0;
            for (int i=0; i < musteri.adresler.length; i++) {
                if (musteri.adresler[i] != null) {
                    adresSayisi++;
                }
            }
            if (adresSayisi > 1) {
                System.out.println(musteri.adi);
            }
        }
    }
}
