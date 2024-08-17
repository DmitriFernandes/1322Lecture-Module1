public class VariablesAndTypes {
    public static void main(String[] args){
        // Variables are reserved places in memory where a value is stored.
        // Variables must be declared and initialized before they can be used.
        // type identifier = value;
        // Initialization can occur at a later stage.
        //type identifier; type = value;
        // The first time a variable is given a value is called INITIALIZATION.
        // After the first time a variable is given a value, it is an ASSIGNMENT.

        // There are several primitive data types.
        byte b1;    // integer between 2^(-8) and (2^8) - 1
        short s1;   // integer between 2^(-16) and (2^16) - 1
        int i1;     // integer between 2^(-32) and (2^32) - 1
        long l1;    // integer between 2^(-64) and (2^64) - 1
        float f1;   // 32-bit floating point number, for numbers with decimal components
        double d1;  // 64-bit floating point number, for numbers with decimal components
        char c1 = ' ';  // a single character, enclosed by '
        boolean bool1 = true; //true or false

        // Besides the types above, there is String.
        // Strings are not considered to be primitive types, but we treat them as if they
        // are due to their common use.
        String str1 = "Alice";

        // Useful string methods:
        System.out.println(str1.length());
        System.out.println(str1.charAt(2));

        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println("Alice".toUpperCase()); // You can still call methods from a string literal
        System.out.println("   Alice   ".trim());
        System.out.println("Alice".substring(2,4));
        System.out.println("Enter your address".split("e")); // very useful method. More on it later
    }
}
