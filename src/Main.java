public class Main {

    public static void main(String[] args) {
        //define 1 variable of each of the
        //following data types
        //byte	short		int 		long
        //float	double
        //char      boolean	String

        System.out.println(Long.MAX_VALUE); //these max and min value outputs can tell us
        System.out.println(Integer.MAX_VALUE); //how much we can store in a variable
        System.out.println(Long.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE);

        byte byteOne = 127;
        short shortOne = 2000; //we use short when we are working with smaller numbers, as it saves space
        int intOne = 200000000; //int has a +- 2 billion range, so we can use it for working with larger numbers
        long longOne = 300000000; //long also can work with large numbers, larger than int
        float floatOne = 5.555555f; //float does decimals to 7 places, with less space than double
        double doubleOne = 6.666666666666; //double does decimals to 16 places, with more space than float
        char charOne = 'A'; char charTwo = 65; //char stores characters as their unicode numbers
        boolean booleanOne = true; //booleans can store two things - true or false
        String stringOne = "Hello, World!"; //strings are used to store multiple words and characters

        System.out.println(byteOne);
        System.out.println(shortOne);
        System.out.println(intOne);
        System.out.println(longOne);
        System.out.println(floatOne);
        System.out.println(doubleOne);
        System.out.println(charOne);
        System.out.println(charTwo);
        System.out.println(booleanOne);
        System.out.println(stringOne + "\n");

    }
}
