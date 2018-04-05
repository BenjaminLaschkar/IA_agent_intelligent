package com.company;

public class World {

    private boolean danger;
    private boolean doingThings=true;

    public boolean getDanger(){
        return danger;
    }

    public void setDanger(boolean danger){
        this.danger = danger;
    }

    public boolean getDoingThings(){
        return doingThings;
    }

    public void setDoingThings(boolean doingThings){
        this.doingThings = doingThings;
    }
}
