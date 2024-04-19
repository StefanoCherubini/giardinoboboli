package es_giardinoboboli;

public class Main {
    public static void main(String[] args) {

        Giardino gia = new Giardino();

       for(int i = 1; i<50 ; i++)
       {
        Turista v = new Turista(i, gia);
        v.start();
       }
    }
}