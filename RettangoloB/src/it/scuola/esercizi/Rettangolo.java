package it.scuola.esercizi;

public class Rettangolo {
    private double x1;
    private double y1;
    private double x2;
    private double y2;


    public Rettangolo (double x1, double y1, double x2, double y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }



    public double getBase(){
        double b;
        b = (x1 - x2);
        if (b < 0){
            b *= -1;
        }
        return b;
    }


    public double getAltezza(){
        double a;
        a = (y1 - y2);
        if (a< 0){
            a *= -1;
        }
        return a;
    }

    public double getArea(){
        double area;
        area = getBase() * getAltezza();
        return area;
    }
    //base * altezza

    public double getPerimetro(){
        double p;
        p = 2*(getBase() + getAltezza());
        return p;
    }
    //(Base+Altezza)*2


}
