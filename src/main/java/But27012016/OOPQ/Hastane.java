package But27012016.OOPQ;

import java.util.ArrayList;

/**
 *
 * @author emirs
 */
public interface Hastane {
    final String adres = "Bla bla";
    ArrayList<Doktor> doktorListesi = new ArrayList<>();
    
    void doktorSayisi();
    //Sorunun cevabı burada. Ancak interface'ler method body'si alamaz. Bu yüzden
    //alt sınıflarda da aynı implementasyonu almıştır.
//    void doktorSayisi(){
//        int ozelDoktorSayisi = 0;
//        int kamuDoktorSayisi = 0;
//        for (Doktor doktor : doktorListesi) {
//            if (doktor.hastane instanceof Kamu) {
//                kamuDoktorSayisi++;
//            }
//            else{
//                ozelDoktorSayisi++;
//            }
//        }
//    }
}
