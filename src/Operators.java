public class Operators {
    public static void main(String[] args){
        // There are 3 main types of operators

        // Arithmetic operators: do math

        // Addition
        System.out.println("1 + 2 = " + (1 + 2)); // int + int = int
        System.out.println("1 + 2.0 = " + (1 + 2.0)); // int + float = float
        System.out.println("1.0 + 2 = " + (1.0 + 2)); // float + int = float

        // Strings can be glued together.
        // This is called a concatenation.
        System.out.println("\"1\" + \"2\" = " + "1" + "2");

        // Subtraction
        System.out.println("1 - 2 = " + (1 - 2));

        // Multiplication
        System.out.println("2 * 3 = " + 2 * 3);
        System.out.println("2 * 3.0 = " + 2 * 3.0);
        System.out.println("2.0 * 3 = " + 2.0 * 3);

        // Division
        System.out.println("8 / 2 = " + 8 / 2);
        System.out.println("8 / 2.0 = " + 8 / 2.0);
        System.out.println("8.0 / 2 = " + 8.0 / 2);

        // Modulus: calculates the REMAINDER of the division
        // between two operands.
        System.out.println("7 % 3 = " + 7 % 3);
        System.out.println("7 % 3.0 = " + 7 % 3.0);
        System.out.println("7.0 % 3 = " + 7.0 % 3);


        // Comparison operators: performs a comparison
        // Gives you either true or false.

        // Equality
        System.out.println("2 == 3 = " + (2 == 3));
        System.out.println("2 == 2 = " + (2 == 2));

        // Inequality
        System.out.println("2 != 3 = " + (2 != 3));
        System.out.println("2 != 2 = " + (2 != 2));

        System.out.println("2 > 3 = " + (2 > 3)); // Greater than
        System.out.println("2 >= 3 = " + (2 >= 3)); // Greater than or equal
        System.out.println("2 < 3 = " + (2 < 3)); // Less than
        System.out.println("2 <= 3 = " + (2 <= 3)); // Less than or equal


        // Logical operators: Apply boolean logic

        // NOT: Inverses true into false and vice-versa
        System.out.println("not true = " + (! true));
        System.out.println("not false = " + (! false));

        // AND: will be true only if ALL inputs are true
        System.out.println("true and true = " + (true && true));
        System.out.println("true and false = " + (true && false));
        System.out.println("false and true = " + (false && true));
        System.out.println("false and false = " + (false && false));

        // OR: will be true as long as one of the inputs is true
        System.out.println("true or true = " + (true || true));
        System.out.println("true or false = " + (true || false));
        System.out.println("false or true = " + (false || true));
        System.out.println("false or false = " + (false || false));


        // There is no limit as to the number of operators
        // an expression can have
        System.out.println("5 + 9 + 4 - 2 + 3 + 5 - 4 + 8 - 6 = " + (5 + 9 + 4 - 2 + 3 + 5 - 4 + 8 - 6));
        System.out.println("true and false and false and true = " + (true && false && false && true));

        // Note that all operators have an order of precedence.
        // The computer will resolve your expression according to this order.
        // If two operators have the same level of precedence, they are
        // resolved left to right.

        // PARENTHESIS
        // ARITHMETIC:
        //   Power
        //   multiplication, division, modulus
        //   addition, subtraction, concatenation
        // COMPARISON:
        //   all operators have the same precedence
        // LOGICAL:
        //   not
        //   and
        //   or

        System.out.println("Very long expression: " + ((4 + 7 - 6) > (6 * 2 / 2 % 7) == (5 != 2) && (false || ! false)));

        float var1 = 12f;
        // Shorthand operators:
        var1 += 12; // equivalent to var1 = var1 + 12
        var1 -= 12; // equivalent to var1 = var1 - 12
        var1 *= 12; // equivalent to var1 = var1 * 12
        var1 /= 12; // equivalent to var1 = var1 / 12
        var1 %= 3 ;// equivalent to var1 = var1 % 3
    }
}
