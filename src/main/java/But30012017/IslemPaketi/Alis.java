package But30012017.IslemPaketi;

/**
 *
 * @author emirs
 */
public class Alis extends Islem{
    
    int indirimTutari;
    
    public boolean hediyeVarMi(){
        return false;
    }

    @Override
    int getAdet() {
        return 0;
    }
    
    int getTutar(int tutar){
        return tutar - indirimTutari;
    }
}
