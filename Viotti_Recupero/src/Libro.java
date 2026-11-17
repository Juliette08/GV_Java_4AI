public class Libro {
    private String nomeAutore;
    private String titolo;
    private int nPagine;



    //costruttori
     public Libro (String nomeAutore, String titolo, int nPagine){
        this.nomeAutore = nomeAutore;
        this.titolo = titolo;
        this.nPagine = nPagine;
    }

    public Libro (Libro l){
        this.nomeAutore = l.nomeAutore;
        this.titolo = l.titolo;
        this.nPagine = l.nPagine;
    }



   //get
    public String getNomeAutore (){
        return nomeAutore;
    }

    public String getTitolo(){
        return titolo;
    }

    public int getNPagine(){
        return nPagine;
    }



    //toString
    public String toString(){
        return "Nome autore: " + nomeAutore + "; titolo libro: " + titolo + "; pagine: " + nPagine;
    }





}
