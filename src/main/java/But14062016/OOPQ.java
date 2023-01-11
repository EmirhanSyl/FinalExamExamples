package But14062016;

import java.util.ArrayList;

/**
 *
 * @author emirs
 */
public class OOPQ {
}


//----------------------------------
package misafirPaketi;
import rezervasyonPaketi.Revezvasyon;
//import rezervasyonPaketi.*;

//2.a
public class Kisi{
    String adi, soyadi;
    String adresler;// maybe array
    
    ArrayList<Rezervasyon> rezervasyonlar = new ArrayList<>();
    
    int getKisiOdeme(){
        int totalFiyat = 0;
        for (Rezervasyon rezervasyon : rezervasyonlar) {
            for (Oda oda : rezervasyon.odalar) {
                if (oda instanceof Orta) {
                    Orta orta = (Orta)oda;
                    totalFiyat += orta.getOdaFiyat();
                }
                else{
                    Luks luks = (Luks)oda;
                    totalFiyat += luks.getOdaFiyat();
                }
            }
        }
        return totalFiyat;
    }
}

//----------------------------------
package rezervasyonPaketi;
import otelPaketi.Otel;
import otelPaketi.Oda;
import misafirPaketi.Kisi;

class Rezervasyon{
    Otel otel;
    Oda[] odalar;
    Kisi misafir;
    //2.b
    static ArrayList<Rezervasyon> tumRezervasyonlar = new ArrayList<>();
}

//----------------------------------
package otelPaketi;
import rezervasyonPaketi.Rezervasyon;
class Otel{    
    String otelAdi;
    
    //2.c
    public String adres;
    //protected String adres; eğer dış paketlerdeki class'lar Otel class'ı ile inherite edilirse
    
    ArrayList<Oda> odaListesi = new ArrayList<>();
    
    public Otel(ArrayList<Oda> odaListesi){
        this.odaListesi = odaListesi;
    }
    
    void odaVer(Rezervasyon r){
        for (Oda oda : r.odalar) {
            oda.misafir = r.misafir;
            oda.bosMu = false;
        }
    }
    
    int getBosOda(){
        int bosOdaSayisi = 0;
        for (Oda oda : odaListesi) {
            if (oda.bosMu == true) {
                bosOdaSayisi++;
                
            }
        }
        return bosOdaSayisi;
    }
    void getToplamOdaFiyat(){
        int ortaTotal = 0;
        int luksTotal = 0;
        
        for (Oda oda : odaListesi) {
            if (oda instanceof Orta) {
                Orta orta = (Orta)oda;
                ortaTotal += orta.getOdaFiyat();
            }
            else{
                Luks luks = (Luks)oda;
                luksTotal += luks.getOdaFiyat();
            }
            
        }
        System.out.println( "Orta: " + ortaTotal);
        System.out.println( "Lüks: " + luksTotal);
    }
}

import misafirPaketi.Kisi;
class Oda{
    int odaNo;
    boolean bosMu;
    Kisi misafir;
}
// eğer oda interface yapılırsa:
// class yerine interface yazılmalı
// Orta ve Luks sub-class'lara extends yerine implements keyword'ü yazılmalı
// değişkenler static ve final bir yapıya dönüşeceği için başlatılmalıdır.

class Orta extends Oda{
    int getOdaFiyat(){}
}

class Luks extends Oda{
    int getOdaFiyat(){}
}


class Test{
    public static void main(String[] args) {
        
        ArrayList<Oda> odaListesi = new ArrayList<>();
        Orta orta1 = new Orta();
        odaListesi.add(orta1);
        Luks luks1 = new Luks();
        odaListesi.add(luks1);
        
        Otel otel = new Otel(odaListesi);
        //otel.odaListesi = odaListesi;
        otel.getToplamOdaFiyat();
    }
}