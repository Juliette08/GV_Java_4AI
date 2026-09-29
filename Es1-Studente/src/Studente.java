public class Studente {
    String nome;
    String cognome;
    int eta;
    double altezza;
    double peso;


    public Studente(String nome, String cognome, int eta, double altezza, double peso){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.altezza = altezza;
    }

    //Costruttore di default
    public Studente(){
        this.nome=" ";
        this.cognome = " ";
        this.eta = 0;
        this.altezza = 0.0;
        this.peso = 0.0;
    }

    //Costruttore di copia
    public Studente(Studente s){
        this.nome = s.nome;
        this.cognome = s.cognome;
        this.eta = s.eta;
        this.altezza = s.altezza;
        this.peso = s.peso;
    }

    public (){

    }


    public String calcolaIndice() {
        double BMI;
        BMI = peso/(altezza*altezza);
        if (BMI < 18.5){
            return "Sottopeso con indice di " + BMI;
        } else if (BMI >= 18.5 && BMI <=24.9) {
            return "Normopeso con indice di " + BMI;
        } else if (BMI >=25 && BMI <= 29.9) {
            return "Sovrappeso con indice di " + BMI;
        }else {
            return "Obesita' con indice di " + BMI;
        }
    }


    public String toString(){
        String s = "I dati dello studente sono: ";
        s+= this.nome + "," + this.cognome + "," + this.eta + "," + this.altezza + "," + this.peso;
        return s;
    }


    public double mediaEta(Studente s){
        double media;
        int somma;
        somma = this.eta + s.eta;
        media = somma / 2;
        return media;
    }


    public String confrontaAltezza(Studente s){
        if (this.altezza > s.altezza){
            return nome;
        }else {
            return s.nome;
        }
    }



}
