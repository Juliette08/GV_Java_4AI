public class Domanda {
    private String domanda;
    private int valore;
    private String [] risposte;
    private int rispCorretta;
    private int rispUtente;



    public Domanda (String domanda, String [] risposte){
    }

    public Domanda (Domanda d){
        this.domanda = d.domanda;
        this.valore = d.valore;
        this.rispCorretta = d.rispCorretta;
        this.rispUtente = d.rispUtente;
    }

    public boolean rispondi (int rispUtente){
        if (rispUtente == rispCorretta){
            return true;
        } else{
            return false;
        }
    }


    public int getValore(){
        return valore;
    }

    public int getPunteggio (){
        int punteggio;
        if (rispondi(rispUtente) == false){
            punteggio = 0;
        } else if (rispondi(rispUtente) == true){
            punteggio = valore;
        } else {
            punteggio = -1;
        }
        return punteggio;
    }

    public boolean completata(){
    }


    public String getRispostaCorretta (){

    }






















}
