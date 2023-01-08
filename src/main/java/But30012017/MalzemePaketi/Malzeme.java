package But30012017.MalzemePaketi;

import But30012017.IslemPaketi.Alis;
import But30012017.IslemPaketi.Islem;
import java.util.ArrayList;

/**
 *
 * @author emirs
 */
public class Malzeme {
    int MalzemeID;
    String MalzemeAdi; // Question 2.a
    
    int getHediyeliTutar(ArrayList<Islem> islemler){
        int total = 0;
        
        for (Islem islem : islemler) {
            for (Islem islem1 : islem.tumIslemler) {
                if (islem1 instanceof Alis) {
                    Alis alis = (Alis)islem1;
                    if (alis.hediyeVarMi() == true) {
                        total += alis.getTutar();
                    }
                }
            }
        }
        return total;
    }
}
