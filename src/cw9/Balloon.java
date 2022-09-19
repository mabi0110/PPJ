package cw9;

import java.util.Random;

public class Balloon {

    private final double hel;

    public double getHel() {
        return hel;
    }

    Balloon(){
        Random random = new Random();
        hel = 0.005 + (0.009 - 0.005) * random.nextDouble();
    }

    public double getLoad(){
        return (0.006 * hel) / 0.007 ;
    }

}
