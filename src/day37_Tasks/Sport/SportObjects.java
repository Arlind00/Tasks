package day37_Tasks.Sport;

public class SportObjects {


    public static void main(String[] args) {


        Baseball baseball = new Baseball(8, "Has a lot of rules");
        Basketball basketball = new Basketball(3, "Has a lot of rules", true);
        Football football = new Football(6, "Has a lot of rules", true);
        AmericanFootball americanFootball = new AmericanFootball(20, 9, "Has a lot of rules");


        System.out.println(americanFootball);
        System.out.println(football);
        System.out.println(basketball);
        System.out.println(baseball);
        System.out.println();

        americanFootball.EggBall();
        americanFootball.Play();
        System.out.println();

        football.Play();
        football.Soccer();
        System.out.println();

        baseball.Play();
        baseball.SortOfGame();
        System.out.println();

        basketball.Play();


    }
}
