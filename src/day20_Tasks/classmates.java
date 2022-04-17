package day20_Tasks;

public class classmates {

    public static void main(String[] args) {


        String[] classmates = {"Adolf Hitler", "Benito Musolini", "Vlad Tepes", "Jozef Stalin", "Ilic Lenin", "Elvis Presley", "Bobbie Gentry",
        "Frank Sinatra", "Agimi Vogel", "Ferid Zekolli"};


        for (String each : classmates) {        // runs through all members of array
            String initials = each.charAt(0) + "." + each.charAt(each.indexOf(" ") + 1 );
            System.out.println(initials);
        }

        }



    }

