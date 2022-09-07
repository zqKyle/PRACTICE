//when starting Java, must have "public class 'x' {}, where x = name of the file.
//can import stuff on top of the public class line.
//must end all statements with ; or {}
import java.lang.Math;

public class Main{
    public static void main(String [] args){

        //BASIC VARIABLES:
        int a = 7;
        int b = 8;
        int c = 9;
        double d = 7.0; //this is a float
        double e = 8.0;
        System.out.println(a); //printing func

        System.out.println((double)a/b); //to get a decimal return, use casting,//
        //one of the 2 arg must be a double or cast result of it double
        // NOTICE:
        System.out.println((double)(a/b));
        //In the line above, java takes a/b = 0 and turns 0 -> 0.0

        System.out.println(d/e);
        System.out.println((int)(d/e)); //returns an int

        //NOTE: (a*b) and (a**b) do not exist in java, use import
        System.out.println(Math.pow(a,b)); //this is multiplication, returns a double
        System.out.println(Math.sqrt(c));
        System.out.println(Math.E); //the variable e (2.71...)

        //STRINGS:
        char someChar = 'z'; //single quote is ONLY for characters
        System.out.println(someChar);

        String something = "Hello"; //double quotes for strings
        String someOtherThing = "Hello";
        System.out.println(something.equals(someOtherThing)); // to compare '==', use .equals

        StringBuilder bob = new StringBuilder(); //StringBuilder is used to create mutable strings
        bob.append("hello");
        String bob2 = bob.toString();
        System.out.println(something.equals(bob));
        //WHAT IS DIFFERENCE IN STRING A AND STRING B = NEW STRING A?
        System.out.println(something + " " + something);

        //ARRAYS:
        int [] arrayA = new int [10]; //specify type, then say its an array, then create the variable name = new 'type' and how large the array is

        arrayA[0] = 7;


        for(int element: arrayA){ //for loop to print the array
            //for element in arrayA: print element
            System.out.println(element);
        }
        for(int i = 0; i < arrayA.length; i++){ //for i in range: print i and increase i
            System.out.println(arrayA[i]);
        }
        //???
        final int [] some_nums = {0,1,2,3,4,5,6,7,8,9,10,11,12}; //adding 'final' creats tuple?
        //adding final lets others know that it should not be changed at all

        //BOOL:
        if (8==8) {
            System.out.println("it is 8"); //always surround put braces() around if statement
        }else if (9==9){
            System.out.println("it is 9");
        }else {
            System.out.println("its something else"); //this is going to return: "it is 8"
        }

        System.out.println(true && true); // print(true and true) -> true
        System.out.println(true || false); //print(true or false) -> true
        System.out.println(!true || !true);//print(not true or not true)

        System.out.println(7 > 8? "hello": " not hello"); //if 7 > 8: print hello, else: not hello


        //WHILE LOOPS:
        int count1 = 0;
        while(count1<10) {
            count1++;
            System.out.println("test");
        }
        //DO WHILE LOOPS (rarely used):
        //do while loop is post-tested, meaning it will check condition (count) after loop is executed

        ///SUM
    }
}
