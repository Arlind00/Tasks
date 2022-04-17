package day37_Tasks.Sport;

public class Basketball extends Sport {


    public boolean threeQuarterBrakes;



    public Basketball(int numberOfReferre, String rules, boolean threeQuarterBrakes) {
        super("Basketball", 5, numberOfReferre, rules);
        this.threeQuarterBrakes = threeQuarterBrakes;
    }



    public void Play() {
        System.out.println(" player is playing " + name);
    }

    public String toString() {
        return "Basketball{" +
                " name= " + name +
                ", numberOfPlayers= " + numberOfPlayers +
                ", numberOfReferre= " + numberOfReferre +
                ", rules=  " + rules +
                "threeQuarterBrakes= " + threeQuarterBrakes +
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