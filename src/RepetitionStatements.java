public class RepetitionStatements {
    public static void main(String[] args){
        // Repetition statements allow for a block of code to be repeated multiple times.
        // This repetition will only occur if a condition is found to be TRUE.

        int counter = 0;

        // WHILE will check the condition BEFORE every iteration (read: lap).
        // The body will only be executed if the condition evaluates to TRUE.
        while(counter < 10){
            System.out.println("Counter: " + counter);
            counter++;
        }

        // WHILE will check the condition AFTER every iteration (read: lap).
        // The body will only be executed if the condition evaluates to TRUE.
        do{
            System.out.println("Counter: " + counter);
            counter++;
        }while(counter < 10);

        System.out.println("Counter after WHILE and DO-WHILE: " + counter);

        // FOR loops, sometimes called "counting" loops, are used to aggregate all of a loop's parameters
        // in a centralized location. This makes it easier to determine for how long the loop will run.
        //for(initializer; condition; increment) { body }
        // Note that the condition is checked BEFORE every iteration but the increment is applied AFTER the iteration.

        for(int x = 0, y = -1; x < counter && y > -20; x++, y*=2){
            System.out.println("x: " + x + " y: " + y);
        }

        // A loop can be placed inside of another loop, creating a nested loop.
        // Note that the inner loop will execute in its entirety before the outer loop proceeds to the next iteration.
        // This these cases, the outer loop usually deals with rows, while the inner loop deals with columns.
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.print(i + j + "\t");
            }
            System.out.println();
        }
    }
}
