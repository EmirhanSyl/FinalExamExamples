package But27012016.OOPQ;

/**
 *
 * @author emirs
 */
public abstract class Kisi {
    String adi;
    String soyadi;
    String adresler;
    int maas;
    int[] calismaAylar;
    
    int getKisiUcret(){
        return calismaAylar.length * maas;
    }
}
