package es_giardinoboboli;

public class Turista extends Thread {
    private int numMatricola = 0;
    private Giardino g;

    public Turista (int numMatricola, Giardino g){
        this.numMatricola = numMatricola;
        this.g = g;
    }

    @Override
    public void run(){
        try{
            char ingresso = g.entra(numMatricola);
            if(ingresso == 'a')
                sleep(3000);
            else{
                int t = 1000 + (int) (Math.random() * 4000);
                sleep(t);
            }
            g.esci(ingresso, numMatricola);
        }
        catch(InterruptedException i){
            i.printStackTrace();
        }
    }
}
