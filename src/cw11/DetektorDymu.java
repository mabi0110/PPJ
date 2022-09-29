package cw11;

import cw12.Alarm;

public class DetektorDymu {
    private boolean smoke;
    private static int counter = 1;
    private final int detectorNumber;

    public DetektorDymu(){
        this.smoke = false;
        detectorNumber = counter++;
    }
    public void setSmoke() {
        smoke = true;
    }
    public void check() throws Alarm {
        if (smoke){
            throw new Alarm("Attention! There is a smoke! Detector number: " + detectorNumber);
        }
    }
}
