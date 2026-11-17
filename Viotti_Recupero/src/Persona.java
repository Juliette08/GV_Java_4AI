public class Persona {
    private String nome;
    private char sesso;
    private int eta;
    private Libro libro;



    //costruttori
    public Persona (String nome, char sesso, int eta, Libro libro){
        this.nome = nome;
        this.sesso = sesso;
        if (sesso != 'f') {
            if (sesso != 'm') {
                this.sesso = 'n';
            }
        }
        this.eta = eta;
        if (eta < 0){
            this.eta = 0;
        }
        this.libro = libro;
    }

    public Persona (Persona p){
        this.nome = p.nome;
        this.sesso = p.sesso;
        this.eta = p.eta;
        this.libro = p.libro;
    }






    //get
    public String getNome (){
        return nome;
    }

    public char getSesso (){
        return sesso;
    }

    public int getEta(){
        return eta;
    }

    public Libro getLibto(){
        return libro;
    }



    //toString
    public String toString (){
        return "Nome: " + nome + "; Sesso: " + sesso + "; età: " + eta + "; Libro: " + libro;
    }










}
