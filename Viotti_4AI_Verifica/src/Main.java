import java.util.Scanner;

public class Main {
    Scanner in = new Scanner(System.in);

        public static Punto creaPunto(){
        double x, y;
        Scanner in = new Scanner(System.in);
        System.out.println("Inseire la X del primo punto: ");
        x = in.nextDouble();
        System.out.println("Inseire la Y del primo punto: ");
        y = in.nextDouble();
        return new Punto(x, y);
    }


    public static Vettore creaVettore() {
            Punto a, b;
        }





        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int scelta;
   do {
       System.out.println("1. Definisci i vettori v1, v2 nel piano cartesiano." +
               "\n2. Visualizza le coordinate dei vettori creati." +
               "\n3. Calcola le lunghezze dei vettori." +
               "\n4. Spostare l'origine di un vettore.");
       scelta = in.nextInt();
       switch (scelta){
           case 1:
               Vettore v1 = new Vettore();
               Vettore v2 = new Vettore();
               break;

           case 2:
               System.out.println(Vettore.getCoordinate());
               break;

           case 3:
               System.out.println(Vettore.calcolaLunghezza());
               break;

           case 4:
               System.out.println(Vettore.spostaOrigine());
               break;
       }
   }while (scelta != 0);

    }
}