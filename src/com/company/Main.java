package com.company;

public class Main {

    public static void main(String[] args) {

        int PROBABILITY_OF_WARNING = 2; //On 10. Actually 2/10 to get danger.
        int TIMER_ENVIRONMENT = 10000; // In milliseconds. Actually the environnement could change every 10000 millisecond.
        int DURATION_AGENT_JOBS = 1500; // In milliseconds. Actually each jobs's duration is 2 mn.
        World world = new World();
        Agent agent = new Agent(world,DURATION_AGENT_JOBS);
        Environ environment = new Environ(world,agent,PROBABILITY_OF_WARNING,TIMER_ENVIRONMENT);
    }
}
