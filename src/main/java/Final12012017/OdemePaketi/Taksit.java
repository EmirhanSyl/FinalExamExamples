package Final12012017.OdemePaketi;

/**
 *
 * @author emirs
 */
public class Taksit implements IOdeme{
    
    int taksitTutart;
    int odenenAdet;
    int toplamTaksitAdet;
    int odemeID;
    
    
    @Override
    public int getOdemeMiktari(){
        return taksitTutart * odenenAdet;
    }
    
    public int getKalan(){
        return taksitTutart * (toplamTaksitAdet - odenenAdet);
    }
}
