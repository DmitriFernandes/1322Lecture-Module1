public class Methods {
    // Methods are blocks of code which can take an input and potentially return an output.
    // They are used to increase code reusability and readability by avoiding repetition.
    //return_type name(parameters) { body }

    // Note that a method producing an output in the console and returning a value are two different concepts!

    // Methods inside your Driver class (i.e.: the class that contains main()) will almost always be public and static
    public static int adder(int a, int b){
        int result = a + b;

        // if a method is of a type besides void, it must always have the RETURN keyword, followed by
        // a value or expression whose type matches the method's return type.
        return result;
    }

    // Methods can be overloaded. In an overload, several methods share the same name, but have different parameters.
    // Changing a method's return type does NOT constitute an overload; it is a syntax error.
    public static int adder(String a, int b){
        return Integer.parseInt(a) + b;
    }

    public static int adder(String a, String b){
        return Integer.parseInt(a) + Integer.parseInt(b);
    }

    public static int adder(int a, String b){
        return a + Integer.parseInt(b);
    }

    // Methods of type void DO NOT RETURN ANYTHING.
    public static void age_verifier(int age){
        if(age >= 21){
            System.out.println("You are old enough to drink.");
            // A method of type void can still have the RETURN keyword. In this case, the keyword is
            // used simply to signal that the method is done executing. Any code below a RETURN
            // statement is ignored.
            return;
        }
        System.out.println("You are not old enough to drink.");
    }

    // Methods can have any number of parameters (i.e: input); from 0 to infinite.
    // Parameters have the following format:
    // type name, type name, ...
    public static void does_nothing(){
        System.out.println("I don't do anything");
    }

    public static void main(String[] args){
        // To call a method, simply call it by name.
        // You must pass it all the parameters it is expecting.
        age_verifier(21);
        age_verifier(20);

        // Passing parameters that a method isn't expecting is a syntax error.
        // does_nothing(12);

        // When calling an overloaded method, the computer determines which overload is
        // being called by the type of the parameters being passed.
        System.out.println(adder("12", 24));
    }
}
