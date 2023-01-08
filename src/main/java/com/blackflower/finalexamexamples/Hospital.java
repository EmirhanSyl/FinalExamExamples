package com.blackflower.finalexamexamples;

import java.util.ArrayList;

/**
 *
 * @author emirs
 */
public class Hospital{
    
    String hospitalName = "";
    final String address = "";
    
    ArrayList<Doc> docs = new ArrayList<>();
    
    void DocHospitalCount(){
        int privateDocCount = 0;
        int publicDocsCount = 0;
        
        for (Doc doc : docs) {
            if (doc.hospital instanceof Private) {
                privateDocCount++;
            }
            else{
                publicDocsCount++;
            }
        }
        
        System.out.println("Private: " + privateDocCount + " Public: " + publicDocsCount);
    }
}
