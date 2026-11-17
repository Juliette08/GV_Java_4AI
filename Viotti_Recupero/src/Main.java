import java.util.Scanner;

public class Main {

    public static Libro registraLibro(){
        Scanner in = new Scanner(System.in);
        String nomeAutore;
        String titolo;
        int nPagine;
        System.out.println("Inserisci il nome dell'autore: ");
        nomeAutore = in.next();
        System.out.println("Inserisi il titolo del libro: ");
        titolo = in.next();
        System.out.println("Inserisci il numero di pagine del libro: ");
        nPagine = in.nextInt();
        return new Libro(nomeAutore, titolo, nPagine);
    }

    public static Persona registraPersona(){
        Scanner in = new Scanner(System.in);
        String nome;
        int eta;
        char sesso;
        System.out.println("Inserisci il nome: ");
        nome = in.next();
        System.out.println("Inserisi l'età: ");
        eta = in.nextInt();
        System.out.println("Inserisci il sesso della persona: ");
        return new Persona (nome, eta, sesso);
    }




    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int scelta;
        Persona p1 = null;
        Persona p2 = null;

        do {
            System.out.println("1. Registrare ua persona;" +
                    "\n2. Visualizzare i dati di una persona;" +
                    "\n3. Verificare registrazione;" +
                    "\n4. Nomi di 2 persone con stesso carattere;" +
                    "\n5. Determinare di 1 persona più anziana, e specifica il sesso.");

            scelta = in.nextInt();
            switch (scelta){
                case 1:
                    registraPersona();
                    break;
                case 2:
                    p1 = registraPersona();
                    System.out.println("Nome: ");
                    p1.getNome();
                    System.out.println("età: ");
                    p1.getEta();
                    System.out.println("Sesso: ");
                    p1.getSesso();
                    break;

                case 3:
                    p1 = registraPersona();
                    p2 = registraPersona();
                    if (p1 == p2){
                        System.out.println("La persona è stata registrata 2 volte");
                    }
                    break;

                case 4:
                    p1 = registraPersona();
                    p2 = registraPersona();
                    p1.getNome().toLowerCase();
                    p2.getNome().toLowerCase();
                    if (p1.getNome().compareTo(p2.getNome()) < 0){
                        System.out.println("La persona " + p1.getNome() + " viene prima di " +p2.getNome());
                    } else if (p1.getNome().compareTo(p2.getNome()) > 0){
                        System.out.println("La persona " + p2.getNome() + " viene prima di " +p1.getNome());
                    } else {
                        System.out.println("I due nomi sono uguali");
                    }
                    break;

                case 5:
                    p1 = registraPersona();
                    p2 = registraPersona();
                    if (p1.getEta() > p2.getEta()){
                        System.out.println(p1.getNome() + " è la persona più anziana " + p1.getSesso());
                    } else if (p1.getEta() < p2.getEta()){
                        System.out.println(p2.getNome() + " è la persona più anziana " + p2.getSesso());
                    } else {
                        System.out.println(p1.getNome() + " e " + p2.getNome() + "hanno la stessa età");
                    }
                    break;
            }

        }while (scelta != 0);


    }
}