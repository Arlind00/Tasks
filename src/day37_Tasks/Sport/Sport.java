package day37_Tasks.Sport;

public class Sport {


    public String name;
    public int numberOfPlayers;
    public int numberOfReferre;
    public String rules;



    public Sport(String name, int numberOfPlayers, int numberOfReferre, String rules) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfReferre = numberOfReferre;
        this.rules = rules;
    }




    public void Play(){
        System.out.println(" player is playing " + name );
    }

    public String toString() {
        return "Sport{" +
                "name= " + name + '\'' +
                ", numberOfPlayers= " + numberOfPlayers +
                ", numberOfReferre= " + numberOfReferre +
                ", rules= " + rules + '\'' +
                '}';
    }


}


/*
Sports Task:
	1. Create a class named Sport
			variables:
				name, numberOfPlayers, numberOfReferre, rules



			methods:
				setInfo()
				play()
				toString()

		2. create the following sub classes of Sport:
				1. Basketball
				2. Baseball
				3. Football
				4. AmericanFootball

			Add any missing variables or methods

			Note: you can search them on google

 */