package But30012017.IslemPaketi;

import But30012017.MalzemePaketi.*;
import But30012017.MusteriPaketi.*;
import java.util.ArrayList;

/**
 *
 * @author emirs
 */
public class Ambar {

    String ambarAdi;
    String adres;

    static String firma;

    ArrayList<Malzeme> malzemeler = new ArrayList<>();
    ArrayList<Ambar> ambarlar = new ArrayList<>();

    int getAmbarCikis(Kisi k, String ambarAdi) {
        int totalMalzeme = 0;
        for (Islem islem : k.islemler) {
            for (Islem islem1 : islem.tumIslemler) {
                if (islem1.ambar.ambarAdi.equals(ambarAdi)) {
                    totalMalzeme++;
                }
            }
        }
        return totalMalzeme;
    }
}
