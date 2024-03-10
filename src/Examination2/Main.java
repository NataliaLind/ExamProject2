package Examination2;

import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MyConverter converterLetMorse = new MyConverter();
        System.out.println("What do you want to do? \n 1 - convert to morsecode \n 2 - convert to letter/character/number \nMake a choice");
        try {
            String choice = scan.nextLine();
            String character = "";
            String result;

            if (Objects.equals(choice, "1")) {
                System.out.println("Write a letter/charater/number");
                character = scan.nextLine();
                result = converterLetMorse.getMorseCode(character);
                if (!Objects.equals(result, "")) {
                    System.out.println("This letter corresponds to " + result);
                }

            } else if (Objects.equals(choice, "2")) {
                System.out.println("Write morsecode");
                character = scan.nextLine();
                result = converterLetMorse.getLetter(character);
                if (!Objects.equals(result, "")) {
                    System.out.println("This morsecode corresponds to " + result);
                }
            } else {
                System.out.println("Wrong choice");

            }

        } catch (Exception e) {
            System.out.println("Something went wrong. Please try again.");

        }
    }
}


