/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataitems;

import business.SeatDirectory;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author riverlin
 */
public class Flight {

    String flight;
    String route;
    String airliner;
    String airplane;

    public String getAirplane() {
        return airplane;
    }

    public void setAirplane(String airplane) {
        this.airplane = airplane;
    }
    Date date;
    SeatDirectory seatdirectory;

    public SeatDirectory getSeatdirectory() {
        return seatdirectory;
    }

    public void setSeatdirectory(SeatDirectory seatdirectory) {
        this.seatdirectory = seatdirectory;
    }

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public Flight() {
        this.seatdirectory = new SeatDirectory();

    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getAirliner() {
        return airliner;
    }

    public void setAirliner(String airliner) {
        this.airliner = airliner;
    }

    public String getDate() {
        return this.sdf.format(this.date);
    }

    public void setDate(String month, String day) {

        // 把字符串按照格式转换成Date对象
        String s1 = "2020-" + month + "-" + day;
        Date date1 = new Date();
        try {
            date1 = this.sdf.parse(s1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "data translate false!");
        }

        this.date = date1;
    }

    @Override
    public String toString() {
        return this.flight;
    }

}
