package But30012017.MusteriPaketi;

import But30012017.IslemPaketi.*;
import java.util.ArrayList;

/**
 *
 * @author emirs
 */
public class Kisi {
    String adi;
    String soyadi;
    public ArrayList<Islem> islemler = new ArrayList<>();
    
    public Kisi(String adi, String soyadi, ArrayList<Islem> islemler){
        this.adi = adi;
        this.soyadi = soyadi;
        this.islemler = islemler;
    }
    
    public int getKisiIslemTutar(){
        int total = 0;
        for (Islem islem : islemler) {
            total += islem.getTutar();
        }
        return total;
    }
    public int getKazanc(int... jaza){
        int kazanc = 0;
        for (Islem islem : islemler) {
            for (Islem islem1 : islem.tumIslemler) {
                if (islem1 instanceof Alis) {
                    kazanc -= islem1.getTutar();
                }
                else{
                    kazanc += islem1.getTutar();
                }
            }
        }
        return kazanc;
    }
}
