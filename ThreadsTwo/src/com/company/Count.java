package com.company;

public class Count implements Runnable {
    Count(){

    }

    @Override
    public void run() {
        try{
            for(int i =0; i<10;i++){
                System.out.println("Ispisivanje broja " + i);
                Thread.sleep(1000);
            }

        }
        catch (InterruptedException ex){
            System.out.println("Nit je prekinuta");
        }
        System.out.println("Nit je izvrsena");
    }
}
