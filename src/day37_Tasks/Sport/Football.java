package day37_Tasks.Sport;

public class Football extends Sport {


    public boolean hasHalfTime;


    public Football(int numberOfReferre, String rules, boolean hasHalfTime) {
        super("Football", 11, numberOfReferre, rules);
        this.hasHalfTime = hasHalfTime;
    }


    public void Play() {
        System.out.println(" player is playing " + name);
    }

    public void Soccer() {
        System.out.println("In europe football is also called soccer");
    }

    public String toString() {
        return "Football{" +
                " name= " + name +
                ", numberOfPlayers= " + numberOfPlayers +
                ", numberOfReferre= " + numberOfReferre +
                ", rules= " + rules +
                "hasHalfTime= " + hasHalfTime +
                '}';
    }
}


/*
2. create the following sub classes of Sport:
				1. Basketball
				2. Baseball
				3. Football
				4. AmericanFootball

			Add any missing variables or methods

			Note: you can search them on google
 */