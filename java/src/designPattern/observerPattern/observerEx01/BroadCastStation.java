package designPattern.observerPattern.observerEx01;

import java.util.ArrayList;

public class BroadCastStation {

    ArrayList<Transmission> transmissionList = new ArrayList<>();

    public BroadCastStation(){}

    public void addReceiver(Transmission transmission){
        transmissionList.add(transmission);
    }

    public void delReceiver(Transmission transmission){
        transmissionList.remove(transmission);
    }

    public void broadCasting(String msg){
        transmissionList.forEach(x->{
            x.broadCast(msg);
        });
    }
}
