package cw11;

public class Punkt3D extends Punkt2D{
    private double z;

    public Punkt3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }


    public double odleglosc(Punkt3D punkt3D) {
        if (this.getClass() == punkt3D.getClass()) {
            double odlegloscX = 0;
            double odlegloscY = 0;
            double odlegloscZ = 0;
            if ((x >= 0 && punkt3D.x >= 0) || (x < 0 && punkt3D.x < 0)) {
                odlegloscX = Math.abs(x - punkt3D.x);
            } else if (x < 0 || punkt3D.x < 0) {
                odlegloscX = Math.abs(x) + Math.abs(punkt3D.x);
            }

            if ((y >= 0 && punkt3D.y >= 0) || (y < 0 && punkt3D.y < 0)) {
                odlegloscY = Math.abs(y - punkt3D.y);
            } else if (y < 0 || punkt3D.y < 0) {
                odlegloscY = Math.abs(y) + Math.abs(punkt3D.y);
            }

            if ((z >= 0 && punkt3D.z >= 0) || (z < 0 && punkt3D.z < 0)) {
                odlegloscZ = Math.abs(z - punkt3D.z);
            } else if (z < 0 || punkt3D.z < 0) {
                odlegloscZ = Math.abs(z) + Math.abs(punkt3D.z);
            }

            return Math.sqrt(odlegloscX * odlegloscX + odlegloscY * odlegloscY + odlegloscZ + odlegloscZ);
        }
        return 0;
    }

//    public double odleglosc(Punkt3D punkt3D){
//        return Math.sqrt(Math.pow(x - punkt3D.x, 2) + Math.pow(y - punkt3D.y, 2) + Math.pow(z - punkt3D.z, 2));
//    }
}
