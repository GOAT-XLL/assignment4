/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import dataitems.Flight;
import dataitems.Seat;
import java.util.ArrayList;

/**
 *
 * @author Xiaoran Li
 */
public class SeatDirectory {
    ArrayList<Seat>seatlist = new ArrayList<Seat>();
    
    
    public  SeatDirectory(){
        for(int i=0;i<25;i++){
            for(int j= 0;j<6;j++){
                this.setseat(i, j, true);
            }
        }
    }
    
    
    public void setseat(int x,int y,boolean z){
        Seat s=new Seat();
        s.setX(x);
        s.setY(y);
        s.setZ(z);
        seatlist.add(s);
    }

    public ArrayList<Seat> getSeatlist() {
        return seatlist;
    }

    public void setSeatlist(ArrayList<Seat> seatlist) {
        this.seatlist = seatlist;
    }
}
