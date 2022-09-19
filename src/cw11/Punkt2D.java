package cw11;

public class Punkt2D {
    protected double x;
    protected double y;

    public Punkt2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double odleglosc(Punkt2D punkt2D) {
        if (this.getClass() == punkt2D.getClass()) {
            double odlegloscX = 0;
            double odlegloscY = 0;
            if ((x >= 0 && punkt2D.x >= 0) || (x < 0 && punkt2D.x < 0)) {
                odlegloscX = Math.abs(x - punkt2D.x);
            } else if (x < 0 || punkt2D.x < 0) {
                odlegloscX = Math.abs(x) + Math.abs(punkt2D.x);
            }

            if ((y >= 0 && punkt2D.y >= 0) || (y < 0 && punkt2D.y < 0)) {
                odlegloscY = Math.abs(y - punkt2D.y);
            } else if (y < 0 || punkt2D.y < 0) {
                odlegloscY = Math.abs(y) + Math.abs(punkt2D.y);
            }
            return Math.sqrt(odlegloscX * odlegloscX + odlegloscY * odlegloscY);
        }
        return 0;
    }

//    public double odleglosc(Punkt2D punkt2D){
//        return Math.sqrt(Math.pow(x - punkt2D.x, 2) + Math.pow(y - punkt2D.y, 2));
//    }

}
