package cw9;

import java.util.Arrays;

public class Donkey {
    private double mass;
    private Balloon[] balloons = new Balloon[0];

    Donkey(double mass) {
        this.mass = mass;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public Balloon[] getBalloons() {
        return balloons;
    }

    public void setBalloons(Balloon[] balloons) {
        this.balloons = balloons;
    }


    void addBalloon(Balloon balloon) {
        Balloon[] temp = new Balloon[balloons.length + 1];

        for (int i = 0; i < balloons.length; i++) {
            temp[i] = balloons[i];
        }

        balloons = temp;
        balloons[balloons.length - 1] = balloon;

        for (Balloon balloo : balloons) {
            System.out.printf("%.4f", balloo.getLoad());
            System.out.print(" ");
        }
        System.out.println();

    }

    public boolean isFlying() {
        double sum = 0;
        for (Balloon balloon : balloons) {
            sum += balloon.getLoad();
        }
        System.out.print("Sum = ");
        System.out.printf("%.4f", sum);
        System.out.println();
        return mass <= sum;
    }
}
