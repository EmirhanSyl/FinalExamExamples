
package But30012017.IslemPaketi;

import But30012017.MalzemePaketi.Malzeme;
import java.util.ArrayList;

/**
 *
 * @author emirs
 */
public abstract class Islem {
    
    Malzeme m;
    Ambar ambar;
    public ArrayList<Islem> tumIslemler = new ArrayList<>();
    
    abstract int getAdet();
    
    public int getTutar(){
        
        return 0;
    }
    
}
