package But30012017.MalzemePaketi;

import But30012017.IslemPaketi.Alis;
import But30012017.IslemPaketi.Islem;
import But30012017.IslemPaketi.Satis;
import But30012017.MusteriPaketi.Kisi;
import java.util.ArrayList;

/**
 *
 * @author emirs
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Islem> islemler = new ArrayList<>();
        Alis islem1 = new Alis();
        Satis islem2 = new Satis();
        islemler.add(islem1);
        islemler.add(islem2);
        
        Kisi kisi = new Kisi("E", "S", islemler);
        System.out.println(kisi.getKisiIslemTutar());
        
    }
}
