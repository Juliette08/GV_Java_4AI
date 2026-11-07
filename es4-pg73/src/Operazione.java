import java.time.LocalDate;

public class Operazione {
    private String causale;
    private double importo;
    private int operazione;


    public Operazione (String causale, double importo, int operazione){
        LocalDate data;
        this.causale = causale;
        this.importo = importo;
        this.operazione = operazione;
    }

    public String getCausale (){
        return causale;
    }

    public double getImporto(){
        return importo;
    }

    public int getOperazione(){
        if (operazione == 1){
            //return 'Operazione di prelievo';
        } else if (operazione == 2){
            //return 'Operazione di deposito';
        }else {
            //return 'Operazione non valida';
        }
    }

    public boolean isPrelievo(){
        if (operazione == 1){
            return true;
        } else {
            return false;
        }
    }

    public boolean isDeposito(){
        if (operazione == 2){
            return true;
        }else {
            return false;
        }
    }

    public String toString(){

    }









}
