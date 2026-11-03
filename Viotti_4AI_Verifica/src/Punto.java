public class Punto {
    private double x;
    private double y;


    public Punto (double x, double y){
        this.x = x;
        this.y = y;
    }

    public Punto (Punto p){
        this.x = p.x;
        this.y = p.y;
    }
}
