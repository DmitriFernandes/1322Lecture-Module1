import java.util.Scanner; // Import the Scanner library, if you intend to use it.

public class BasicIO {
    public static void main(String[] args){
        System.out.print("Prints something to the console.");
        System.out.println("Prints something to the console, then skips a line.");

        // For reading user input, first create a Scanner.
        // YOU ONLY NEED TO DO THIS ONCE.
        Scanner sc = new Scanner(System.in);

        // If you intend to ask the user for input, it is best to tell them what
        // exactly you want them to enter.
        System.out.print("Enter your name: ");

        // Read and store user input.
        String name = sc.nextLine();

        System.out.println("Hello " + name);

        // nextLine() always reads input as a string.
        // You can convert said string to other primitive data types
        System.out.print("Enter your age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Enter your weight: ");
        double weight = Double.parseDouble(sc.nextLine());
    }
}
