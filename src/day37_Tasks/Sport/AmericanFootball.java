package day37_Tasks.Sport;

public class AmericanFootball extends Sport{



    public AmericanFootball(int numberOfPlayers, int numberOfReferre, String rules) {
        super("AmericanFootball", numberOfPlayers, numberOfReferre, rules);
    }



    public void Play() {
        System.out.println(" player is playing " + name);
    }

    public void EggBall(){
        System.out.println(" In europe this game reightously is called EGG Ball");
    }

    public String toString() {
        return "AmericanFootball{" +
                " name= " + name     +
                ", numberOfPlayers= " + numberOfPlayers +
                ", numberOfReferre= " + numberOfReferre +
                ", rules= " + rules + '\'' +
                '}';
    }
}
