public class Playlist {
    private String nome;
    private int brani;
    private String stato;



    //costruttore
    public Playlist (String nome, int brani){
        this.nome = nome;
        this.brani = brani;
        stato = "Stop";
    }


    //costruttore di copia
    public Playlist(Playlist p) {
        this.nome = p.nome;
        this.brani = p.brani;
        this.stato = p.stato;
    }


    //metodo getNome
    public String getNome() {
        return nome;
    }


    //metodo getQuantiBrani
    public int getQuantiBrani() {
        return brani;
    }


    //metodo play
    public String play() {
        if (stato != "Play") {
            stato = "Play";
        } else {
            stato = "Play";
        }
        return stato;
    }



    //metodo pause
    public String pause(){
        if (stato == "Play"){
            stato = "Pause";
        }else (if )
    }




}



