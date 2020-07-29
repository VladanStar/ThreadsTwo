package com.company;

public class Main {
    public Main(){
        Count count = new Count();
        Thread myThread = new Thread(count,"moja nit");
        System.out.println("Nit je kreirana " + myThread);
        myThread.start();
        for(int i =0; i<20; i++){
            System.out.println("i= "+ i);
        }
    }

    public static void main(String[] args) {
	// write your code here
        new Main();
    }
}
