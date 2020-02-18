/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import dataitems.Airliner;
import java.util.ArrayList;

/**
 *
 * @author riverlin
 */
public class AirlinerDirectory {
    ArrayList<Airliner>airlinerlist = new ArrayList<Airliner>();

    public ArrayList<Airliner> getAirlinerlist() {
        return airlinerlist;
    }

    public void setAirlinerlist(ArrayList<Airliner> airlinerlist) {
        this.airlinerlist = airlinerlist;
    }
    public Airliner addAirliner(String companyName) {
        Airliner al = new Airliner(companyName);
        this.airlinerlist.add(al);
        return al;
    }
    
    public void deleteAirliner(Airliner f){
        airlinerlist.remove(f);
        
    }
}
