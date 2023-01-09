package But27012016.OOPQ;

/**
 *
 * @author emirs
 */
public class Doktor extends Kisi{
    Mesai[] mesaiListesi;
    Hastane hastane;
    
    void adresYazdir(){
        
    }
    
    int mesaiGoster(){
        int total = 0;
        if (hastane instanceof Ozel) {
            Ozel ozelHastane = (Ozel) hastane;
            for (Mesai mesai : mesaiListesi) {
                total = (mesai.sonSaat - mesai.ilkSaat) * ozelHastane.mesaiUcreti;
            }
        }
        return total;
    }
    
    void mesaiEkle(Mesai... mesai){
        mesaiListesi = new Mesai[mesai.length];
        for (int i = 0; i < mesai.length; i++) {
            mesaiListesi[i] = mesai[i];
        }
    }
    
    @Override
     int getKisiUcret(){
        return super.getKisiUcret() + mesaiGoster();
    }
}
