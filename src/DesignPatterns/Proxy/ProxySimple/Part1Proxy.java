package DesignPatterns.Proxy.ProxySimple;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Part1Proxy implements Part1Interface {
    LocalTime startOfClassTime = LocalTime.of(13,0);
    LocalTime endOfClassTime = LocalTime.of(14, 50);
    List<DayOfWeek> acceptableDays = new ArrayList<>();

    public Part1Proxy() {
        acceptableDays.add(DayOfWeek.MONDAY);
        acceptableDays.add(DayOfWeek.WEDNESDAY);
    }

    @Override
    public void print() {
        if(checkDayOfWeek() && checkTime()){
            new Part1Implementation().print();
        }
        else{
            throw new RuntimeException("Not a Monday or Wednesday during CS 340");
        }
    }

    private boolean checkTime() {
        LocalTime currentTime = LocalTime.now();
        if(currentTime.isAfter(startOfClassTime) && currentTime.isBefore(endOfClassTime)){
            return true;
        }
        return false;
    }

    private boolean checkDayOfWeek(){
        LocalDateTime currentDateTime = LocalDateTime.now();
        if(acceptableDays.contains(currentDateTime.getDayOfWeek())){
            return true;
        }
        return false;
    }

}
