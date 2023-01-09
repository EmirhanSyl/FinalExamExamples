package But27012016.OOPQ;

/**
 *
 * @author emirs
 */
public class Kamu implements Hastane {

    int kamuNo;
    String hastaneAdi;

    public Kamu(int kamuNo) {
        this.kamuNo = kamuNo;
    }

    @Override
    public void doktorSayisi() {
        int ozelDoktorSayisi = 0;
        int kamuDoktorSayisi = 0;
        for (Doktor doktor : doktorListesi) {
            if (doktor.hastane instanceof Kamu) {
                kamuDoktorSayisi++;
            }
            else{
                ozelDoktorSayisi++;
            }
        }
    }
}
