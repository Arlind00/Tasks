package day20_Tasks;

public class Reverse_Classmates {

    public static void main(String[] args) {


        String[] classmates = {"Adolf Hitler", "Benito Musolini", "Vlad Tepes", "Jozef Stalin", "Ilic Lenin", "Elvis Presley", "Bobbie Gentry",
                "Frank Sinatra", "Agimi Vogel", "Ferid Zekolli"};

        String reverse;


        for (String each : classmates) {
            reverse = "";
            for (int i = each.length() - 1; i >= 0; i--) {
                reverse += each.charAt(i);
            }
            System.out.println(reverse);
        }


    }
}


/*
2. create string array, and store the names of your  classmates (10)
            reverse each student names and print them in separate line
                    ex:
        arr = {java, python, c#}

        output:
        avaJ
        nohtyp
        #c

 */