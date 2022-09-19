package cw8;

public class Cplx {
    private float re;
    private float im;

    public Cplx(float re, float im) {
        this.re = re;
        this.im = im;
    }

    public void add(Cplx cplx){
        re += cplx.re;
        im += cplx.im;
    }

    public void sub(Cplx cplx){
        re -= cplx.re;
        im -= cplx.im;
    }

    public void mul(Cplx cplx){
        float newRe = (re * cplx.re) + (im * cplx.im * (-1));
        im = (im * cplx.re) + (re * cplx.im);
        re = newRe;
    }

    public void incRe(){
        re++;
    }

    public void show(){
        System.out.println(re + " + " + im + "i");
    }
}
