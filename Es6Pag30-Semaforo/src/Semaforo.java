public class Semaforo {
    boolean acceso;
    String colore;




    //metodo accendi
    public boolean accendi (){
        if (acceso == false){
            acceso = true;
        }else{
            acceso = true;
        }
        colore = "VERDE";
        return acceso;
    }


    //metodo spegni
    public boolean spegni(){
        if (acceso == true){
            acceso = false;
        }else {
            acceso = false;
        }
        return acceso;
    }


    //metodo toggle
    public boolean toggle (){
        if (acceso == true){
            acceso = false;
        }else {
            acceso = true;
        }
        return acceso;
    }


    //metodo avanza
    public String avanza(){
        if (acceso == true) {
            if (colore == "VERDE") {
                colore = "GIALLO";
            } else if (colore == "GIALLO") {
                colore = "ROSSO";
            } else {
                colore = "VERDE";
            }
        }else {
            colore = colore;
        }
        return colore;
    }



    //metodo isAcceso
    public boolean isAcceso (){
        return acceso;
    }


    //metodo getColore
    public String getColore(){
        if (acceso == true){
            return colore;
        }else {
            return " ";
        }
    }



    //metodo toString
    public String toString (){
        if (acceso == true){
            return "Il semaforo è " + acceso + " sul " + colore;
        } else{
            return "Il semaforo è spento";
        }
    }



}
