package race;

import java.util.Scanner;

public class CreateRace {

    public static int intFromUser(String prompt){
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);

        while(true){
            try {
                return Integer.parseInt(scanner.nextLine());
            }catch(NumberFormatException ex){
                System.out.println("input must be a number");
            }
        }
    }

    public void createCar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("would you like to create a car or sports car?");
        System.out.print("1) car \n 2) sport car");


    }
}
