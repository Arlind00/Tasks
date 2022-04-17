package day37_Tasks.Sport;


public class Baseball extends Sport {



    public Baseball(int numberOfReferre, String rules) {
        super("Baseball", 8, numberOfReferre, rules);
    }



    public void Play() {
        System.out.println(" player is playing " + name);
    }

    public void SortOfGame() {
        System.out.println(name + " is called softball for a reason");
    }

    public String toString() {
        return "Baseball{" +
                " name= " + name + '\'' +
                ", numberOfPlayers= " + numberOfPlayers +
                ", numberOfReferre= " + numberOfReferre +
                ", rules= " + rules + '\'' +
                '}';
    }
}
