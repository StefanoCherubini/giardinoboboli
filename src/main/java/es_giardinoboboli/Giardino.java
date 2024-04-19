package es_giardinoboboli;

public class Giardino {
    private int giardinoA = 5;
    private int giardinoB = 10;
    private char ingresso;
    

    public synchronized char entra(int matricola) {
        try {
            while (giardinoA == 0 && giardinoB == 0 ) {
                System.out.println("Giardino pieno");
                wait();
            }
        }catch(InterruptedException e){}

            if(giardinoA>0)
            {
               giardinoA--;
               ingresso = 'a';
            }
            else
            {
                giardinoB--;
                ingresso = 'b';
            }
            System.out.println("Il turista n°" + matricola + " entra nell'ingresso " + ingresso);
            return ingresso;
    }


    public synchronized void esci(char ingresso,int matricola) {
        if(ingresso =='a')
        {
            giardinoA++;
        }
        else if(ingresso =='b'){
            giardinoB++;
        }
        System.out.println("Il turista n°" + matricola + " esce dall'ingresso " + ingresso);
        notify();
    }
}
