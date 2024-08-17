import java.util.Scanner;

public class SelectionStatements {
    public static void main(String[] args){
        // Selection statements allow the computer to decide whether a block of
        // code should be executed or not, depending on some condition.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your country of origin: ");
        String country = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(sc.nextLine());

        // IF blocks check a condition. If that condition is TRUE, the body is executed.
        if(age >= 21){
            System.out.println("You are old enough to drink.");
        }
        // ELSE-IFs will be checked if the IF or the ELSE-IF above evaluates to FALSE.
        // If the IF or ELSE-IF above evaluates to TRUE, this ELSE-IF will never be evaluated.
        // Will only be executed if evaluated to TRUE.
        else if(age >= 18){
            // You may have IFs inside of other IFs, which are called "nested IF statements"
            if(country.equalsIgnoreCase("germany") || country.equalsIgnoreCase("brazil")) {
                System.out.println("You are old enough to drink.");
            }
            else{
                System.out.println("You are not old enough to drink.");
            }
        }
        // An IF block can have between 0 and infinite ELSE-IFs.
        else if(age >= 16 && country.equalsIgnoreCase("germany")){
            System.out.println("You are old enough to drink.");
        }
        // ELSEs will only execute if all of the preceding IF and ELSE-IFs evaluated to FALSE
        else{
            System.out.println("You are not old enough to drink.");
        }


        // SWITCH statements will compare what is in its parenthesis and skip straight to the appropriate case.
        switch(country.toLowerCase()){
            case "united states":
                if(age >= 21){
                    System.out.println("You are old enough to drink.");
                }
                else{
                    System.out.println("You are not old enough to drink.");
                }
                break; // DO NOT FORGET THE BREAK
            case "brazil":
                if(age >= 18){
                    System.out.println("You are old enough to drink.");
                }
                else{
                    System.out.println("You are not old enough to drink.");
                }
                break;
            case "germany":
                if(age >= 16){
                    System.out.println("You are old enough to drink.");
                }
                else{
                    System.out.println("You are not old enough to drink.");
                }
                break;
            default: // This case will be executed if no other cases match
                System.out.println("Unknown drinking laws.");
                break;
        }

    }
}
