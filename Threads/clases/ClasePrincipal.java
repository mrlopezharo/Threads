package clases;

public class ClasePrincipal {
    public static void main(String[] args) {


        Proceso1 hilo1 = new Proceso1(); // con "extends Thread"
        Proceso1 hilo3 = new Proceso1();
        Thread hilo2 = new Thread(new Proceso2()); // con "implements Runnable"

        hilo1.start();
        hilo3.start();
        hilo2.start();

    }
}