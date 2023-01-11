package Final31062018;

import java.util.ArrayList;

/**
 *
 * @author emirs
 */
public class OOPQ {
    
}


package MusteriPaketi;
import HesapPaketi.Hesap;
import HesapPaketi.Sube;

class Musteri{
    String adi, soyadi;
    ArrayList<Hesap> hesaplar = new ArrayList<>();
    
    void hesapAc(Sube s){
        
    }
    
    boolean dovizFazlaMi(){
        
    }
}


//-----------------------------------------

package HesapPaketi;
import MusteriPaketi.Musteri;

final class Sube{
    int tutar;
    Hesap[] hesaplar;
    
    ArrayList<Musteri> musteriler = new ArrayList<>();
    
    int getToplamTutar(){
        int totalTutar = 0;
        for (Hesap hesap : hesaplar) {
            totalTutar += hesap.getTutar();
        }
        return totalTutar;
    }
}


//Eğer Hesap interface'e çevrilirse
//Değişkenler static final'a dönüşeceğinden başlatılmalıdır
//Sub-class'lar extends değil implements olmalı
//class yerine iterface yazılmalı
//getTutar body alamaz!
public class Hesap{
    int hesapID;
    Sube sube;
    int borcTutar;
    int alacakTutar;
    
    int getTutar(){
        return alacakTutar - borcTutar;
    }
}

public class doviz extends Hesap{
    private int kur;
    
    public int getKur(){
        return kur;
    }
    
    @Override
    int getTutar(){
        return kur * super.getTutar();
    }
}

class TL extends Hesap{
    
    @Override
    int getTutar(){
        
    }
}
