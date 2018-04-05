package com.company;

import java.util.Random;

public class Environ {

    private int PROBABILITY_OF_WARNING;
    private int TIMER_ENVIRONMENT;
    private Thread environment_thread;
    private World world;
    private Agent agent;

    public Environ(World world, Agent agent, int PROBABILITY_OF_WARNING, int TIMER_ENVIRONMENT){
        this.environment_thread = new EnvironmentThread();
        environment_thread.start();
        this.world=world;
        this.agent=agent;
        this.PROBABILITY_OF_WARNING =PROBABILITY_OF_WARNING;
        this.TIMER_ENVIRONMENT=TIMER_ENVIRONMENT;
    }
    public class EnvironmentThread extends Thread {

        public void run(){
            while(true) {
                Danger();
                }
            }
        }

        private void Danger(){
         Random rn = new Random();
         int random_number = rn.nextInt(10);
         if (random_number <= PROBABILITY_OF_WARNING){
             world.setDanger(true);
             System.out.println("ENVIRONNEMENT : Il y a du DANGER !!!!");
             stopAgentIfActive();
         }
         else{
             world.setDanger(false);
             System.out.println("ENVIRONNEMENT : Pas de danger.");
         }
            try {
                System.out.println("ENVIRONNEMENT : Prochaine possibilité de danger dans 10 secondes.");
                environment_thread.sleep(TIMER_ENVIRONMENT);
            } catch(InterruptedException e) {
                System.out.println("got interrupted!");
            }
        }

        public void stopAgentIfActive() {
            if(world.getDoingThings()){
            agent.stopThread();
            System.out.println("ENVIRONNEMENT : L'agent était en train de faire quelque chose pendant le danger, il mérite d'être suspendu.");
            System.out.println("ENVIRONNEMENT : Mon rôle est terminé. Je me desactive. Fin de transmission.");
            environment_thread.stop();
            }
            else{
                System.out.println("ENVIRONNEMENT : L'agent ne faisait rien.");}
        }
    }

