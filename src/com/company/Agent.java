package com.company;

import java.util.Random;

public class Agent {
    private Thread agent_thread;
    private World world;
    private int DURATION_AGENT_JOBS;

    public Agent(World world, int DURATION_AGENT_JOBS) {
        this.world = world;
        agent_thread= new Agent_Thread();
        agent_thread.start();
        this.DURATION_AGENT_JOBS=DURATION_AGENT_JOBS;
    }

    public void updateDoingThingsinEnviron(){
        if(world.getDoingThings()){
        world.setDoingThings(false);}
        else{
            world.setDoingThings(true);
        }
    }
    public void stopThread(){
        agent_thread.stop();
    }

    public Thread.State getState(){
        return agent_thread.getState();
    }


    public class Agent_Thread extends Thread {
        public void run(){
            while (true) {
                //CHECKING DANGER HERE
                updateDoingThingsinEnviron();
                System.out.println("AGENT : Je ne fais rien");
                try {
                    System.out.println("AGENT : J'attend 2 secondes au cas ou il y aurai du danger."); // This line is usefull. Otherwise we don't often see the case where the agent survive.
                    agent_thread.sleep(2000);
                } catch(InterruptedException e) {
                    System.out.println("got interrupted!");
                }
                int i=1;
                do {
                     if (world.getDanger() && i==1){System.out.println("AGENT : Agent en attente de non danger !");}
                     i++;
                }while(world.getDanger());
                updateDoingThingsinEnviron();
                System.out.println("AGENT : Je fais une tâche.");

                String letter = choose_ABC();
                System.out.println("AGENT : C'est parti pour faire la tache "+letter);
                if (letter.equals("A")) {
                    A1();
                    A2();
                    A3();
                } else if (letter.equals("B")) {
                    B1();
                    B2();
                    B3();
                } else if (letter.equals("C")) {
                    C1();
                    C2();
                    C3();
                }
            }
        }
    }

    private String choose_ABC(){
        //randomly choose a letter between A, B or C
        String letter = "";
        Random rn = new Random();
        int random_number = rn.nextInt(3)+1;
        switch(random_number) {
            case 1: letter = "A";
            break;
            case 2: letter = "B";
            break;
            case 3: letter = "C";
            break;
            default: System.out.println("AGENT : There was an error, normally this message can't appear !");
        }
        return letter;
    }
    private void A1(){
        try {
            System.out.println("AGENT : D'abord A1.");
            agent_thread.sleep(DURATION_AGENT_JOBS);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }
    private void A2(){
        try {
            System.out.println("AGENT : Puis A2.");
            agent_thread.sleep(DURATION_AGENT_JOBS);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }
    private void A3(){
        try {
            System.out.println("AGENT : Enfin A3.");
            agent_thread.sleep(DURATION_AGENT_JOBS);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }
    private void B1(){
        try {
            System.out.println("AGENT : D'abord B1.");
            agent_thread.sleep(DURATION_AGENT_JOBS);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }
    private void B2(){
        try {
            System.out.println("AGENT : Puis B2.");
            agent_thread.sleep(DURATION_AGENT_JOBS);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }
    private void B3(){
        try {
            System.out.println("AGENT : Enfin B3.");
            agent_thread.sleep(DURATION_AGENT_JOBS);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }
    private void C1(){
        try {
            System.out.println("AGENT : D'abord C1.");
            agent_thread.sleep(DURATION_AGENT_JOBS);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }
    private void C2(){
        try {
            System.out.println("AGENT : Puis C2.");
            agent_thread.sleep(DURATION_AGENT_JOBS);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }
    private void C3(){
        try {
            System.out.println("AGENT : Enfin C3.");
            agent_thread.sleep(DURATION_AGENT_JOBS);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }
}
