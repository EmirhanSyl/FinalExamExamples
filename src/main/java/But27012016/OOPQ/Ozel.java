package But27012016.OOPQ;

/**
 *
 * @author emirs
 */
public class Ozel implements Hastane{
    int mesaiUcreti;
    String hastaneAdi;

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
