package Fundamentals.FinalExam;

import java.util.Scanner;

public class ProblemOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();

        String entry = scan.nextLine();

        while(!entry.equals("Sign up")){
            String [] comm = entry.split(" ");

            switch (comm[0]){
                case"Case":
                    if (comm[1].equals("lower")){
                        name = name.toLowerCase();
                    } else {
                        name = name.toUpperCase();
                    }
                    System.out.println(name);
                    break;
                case"Reverse":
                    int startIndex = Integer.parseInt(comm[1]);
                    int endIndex = Integer.parseInt(comm[2]);
                    if ( startIndex>=0 && startIndex<name.length() && endIndex>=0 && endIndex<name.length()) {
                        String sub = name.substring(startIndex, endIndex+1);
                        sub = new StringBuilder(sub).reverse().toString();
                        System.out.println(sub);
                    }
                    break;
                case"Cut":
                    if (name.contains(comm[1])){
                        name = name.replace(comm[1], "");
                        System.out.println(name);
                    } else {
                        System.out.printf("The word %s doesn't contain %s.\n", name, comm[1]);;
                    }
                    break;
                case"Replace":
                   name =  name.replaceAll(comm[1], "*");
                    System.out.println(name);
                    break;
                case"Check":
                    if (name.contains(comm[1])){
                        System.out.println("Valid");
                    }else {
                        System.out.printf("Your username must contain %s.\n", comm[1]);
                    }
                    break;
            }


            entry = scan.nextLine();
        }

    }
}
