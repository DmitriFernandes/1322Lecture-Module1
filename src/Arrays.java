public class Arrays {
    public static void redactor(String[] names){
        for(int i = 0; i < names.length; i++){
            if(names[i] != null) {
                names[i] = "REDACTED";
            }
        }
    }

    public static void main(String[] args){
        // Unlike variables, arrays can hold any number of values of the same data type.
        // Arrays are declared like any other variable, but they need a []
        //type[] name = new type[size];

        String[] names = new String[5];

        // You can access a particular index in an array.
        // Note that arrays are 0-indexed: their first index is 0.
        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Charlie";
        names[3] = "David";
        names[4] = "Edward";

        // Attempting to access an index out of the array's range will cause a crash
        // names[5] = "Frank";

        // When interacting with arrays, it is usually best to use a loop
        for(int i = 0; i < names.length; i++){
            System.out.println("Person at position " + i + ": " + names[i]);
        }

        // NOTE: Once an array has been initialized at a certain size, its size cannot change!
        // If you need a larger array, you'll have to create a new array, transfer the contents
        // of the old array to the new array, and then rename the new array.
        String[] newNames = new String[names.length * 2];

        for(int i = 0; i < names.length; i++){
            newNames[i] = names[i];
        }

        names = newNames;

        // Be careful when using an array as an argument to a method!
        // Any changes that method makes will alter the original array!
        for(int i = 0; i < names.length; i++){
            System.out.print(names[i] + "\t");
        }
        System.out.println();

        redactor(names);

        for(int i = 0; i < names.length; i++){
            System.out.print(names[i] + "\t");
        }
        System.out.println();


        // Arrays can have more than one dimension
        String[][] fullNames = new String[10][2];

        for(int i = 0; i < fullNames.length; i++){
            if(names[i] != null){
                fullNames[i][0] = names[i];
                fullNames[i][1] = "Smith";
            }
        }

        for(int i = 0; i < fullNames.length; i++){
            System.out.println(fullNames[i][0] + " " + fullNames[i][1]);
        }

        // When using loops to traverse multidimensional arrays, you will generally need one nested loop per dimension.
        // The outermost loop will deal with rows, while the innermost loop will deal with columns.
        String[][] coordinates = new String[10][10];

        for(int i = 0; i < coordinates.length; i++){
            for(int j = 0; j < coordinates[i].length; j++){
                coordinates[i][j] = "(" + i + "," + j + ")";
            }
        }

        // Loops that strictly traverse a collection for reading can instead be replaced with
        // and enhanced for loop
        // for(type name : collection) { body }
        for (String[] coordinate : coordinates) {
            for (String s : coordinate) {
                System.out.print(s + "\t");
            }
            System.out.println();
        }
    }
}
