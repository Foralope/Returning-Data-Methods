/*
 * 
 * 
 * 
 */

package subroutine.returning.data;
import java.util.Scanner;
/**
 *
 * @author wizwa9381
 */
public class SubroutineReturningData {
    /**
     * This will multiply by one, I promise.
     * @param number This is the number to be multiplied by one.
     * @param userInput This detects user input.
     * @return number to the main program.
     */
    public static double multiplyingByOne (double number, Scanner userInput) {
        System.out.println("What is your number?");
        number = userInput.nextDouble();
        return number;
    }
    /**
     * This will find the cube root of a number.
     * @param number This is the number that gets cube rooted.
     * @param userInput This detects user input.
     * @return number to the main program.
     */
    public static double cubeRoot (double number, Scanner userInput) {
        System.out.println("What is the number you want to cube root?");
        number = userInput.nextDouble();
        number = Math.cbrt(number);
        return number;
    }
    /**
     * This calculates the perimeter of a rectangle.
     * @param length This is the length of the rectangle.
     * @param width This is the width of a rectangle.
     * @param userInput This detects user inputs.
     * @return length to the main program.
     */
    public static double perimeterOfARectangle (double length, double width, Scanner userInput) {
        System.out.println("What is the length of your rectangle?");
        length = userInput.nextDouble();
        System.out.println("What is the width of your rectangle?");
        width = userInput.nextDouble();
        length = width*2 + length*2;
        return length;
    }
    /**
     * This finds the average of four numbers.
     * @param averageFinder Stores the values that users input.
     * @param keyedInput Detects user input.
     * @param answer This is the answer to the average calculation.
     * @return answer to the main program. 
     */
    public static double averageOfFourNumbers (double [] averageFinder, Scanner keyedInput, double answer) {
        System.out.println("What is your first number?");
        averageFinder[0] = keyedInput.nextDouble();
        System.out.println("What is your second number?");
        averageFinder[1] = keyedInput.nextDouble();
        System.out.println("What is your third number?");
        averageFinder[2] = keyedInput.nextDouble();
        System.out.println("What is your fourth number?");
        averageFinder[3] = keyedInput.nextDouble();
        answer = (averageFinder[0] + averageFinder[1] + averageFinder[2] + averageFinder [3])/4;
        return answer;
    }
    /**
     * Finds the missing angle on a triangle.
     * @param angle The users angles.
     * @param answer The answer.
     * @param keyedInput A thing to detect user inputs.
     * @return answer because it's the answer.
     */
    public static double missingAngle (double angle, double answer, Scanner keyedInput) {
        System.out.println("What is the first angle?");
        angle = keyedInput.nextDouble();
        answer = 180 - angle;
        System.out.println("What is the second angle?");
        angle = keyedInput.nextDouble();
        answer = answer - angle;
        return answer;
    }
    /**
     * Square root calculating.
     * @param userInput The number to be square rooted.
     * @param keyedInput Scanner for user input.
     * @return userInput to the main program.
     */
    public static double squareRoot (double userInput, Scanner keyedInput) {
        System.out.println("What is the number you wish to square root?");
        userInput = keyedInput.nextDouble();
        userInput = Math.sqrt(userInput);
        return userInput;
    }
    /**
     * Calculating powers.
     * @param base Base of the power.
     * @param exponent Exponent of the power.
     * @param keyedInput Scanner for user inputs.
     * @return base to the main program.
     */
    public static double powers (double base, double exponent, Scanner keyedInput) {
        System.out.println("What is your base?");
        base = keyedInput.nextInt();
        System.out.println("What is your exponent?");
        exponent = keyedInput.nextInt();
        base = Math.pow(base,exponent);
        return base;
    }
    /**
     * Finding the area of a square.
     * @param sideLength Length of the sides, then squared to get the area.
     * @param keyedInput Scanner for computer input.
     * @return sideLength to the main program.
     */
    public static double areaOfASquare(double sideLength, Scanner keyedInput) {
        System.out.println("What're the side lengths?");
        sideLength = keyedInput.nextDouble();
        sideLength = Math.pow(sideLength,2);
        return sideLength;
    }
    /**
     * Volume of a cube finder.
     * @param sideLength Length of the side, then cubed to get the volume.
     * @param keyedInput Scanner for user inputs.
     * @return sideLength to the main program.
     */
    public static double volumeOfACube(double sideLength, Scanner keyedInput) {
        System.out.println("What are the lengths of your sides?");
        sideLength = keyedInput.nextDouble();
        sideLength = Math.pow(sideLength,3);
        return sideLength;
    }
    /**
     * Finding the perimeter of a square.
     * @param sideLength Length of the side, then multiplied by 4 for the perimeter.
     * @param keyedInput Scanner to get user inputs.
     * @return sideLength to the main program.
     */
    public static double perimeterOfASquare(double sideLength, Scanner keyedInput) {
        System.out.println("What are the lengths of your sides?");
        sideLength = keyedInput.nextDouble();
        sideLength = sideLength*4;
        return sideLength;
    }

    /**
     * @param args is where the main programming happens
     */
    public static void main(String[] args) {
        //Looping everything
        while (1 == 1){
            //Variables
            Scanner keyedInput = new Scanner(System.in);
            int userInput;
            double output = 0,output2 = 0;
            double [] averageFinder = new double [4];
            System.out.println("Input a number, 1 to 10 to access some math tools.");
            System.out.println("1. Perimeter of a square.");
            System.out.println("2. Volume of a cube.");
            System.out.println("3. Area of a square.");
            System.out.println("4. Powers.");
            System.out.println("5. Square root.");
            System.out.println("6. Missing angle of a triangle.");
            System.out.println("7. Average of 4 numbers.");
            System.out.println("8. Perimeter of a rectangle.");
            System.out.println("9. Cube root.");
            System.out.println("10. Multiplying by one.");
            System.out.println("11. Exit the program.");
            userInput = keyedInput.nextInt();
            switch (userInput) {
                case 1:
                    output = perimeterOfASquare (output,keyedInput);
                    System.out.println("The perimeter of your square is "+output+" units.");
                    break;
                case 2:
                    output = volumeOfACube (output,keyedInput);
                    System.out.println("The volume of the cube is "+output+" units^3.");
                    break;
                case 3:
                    output = areaOfASquare (output,keyedInput);
                    System.out.println("The volume of the square is "+output+" units^2.");
                    break;
                case 4:
                    output = powers (output,output2,keyedInput);
                    System.out.println("The powers answer is "+output+".");
                    break;
                case 5:
                    output = squareRoot (output,keyedInput);
                    System.out.println("The answer is "+output+".");
                    break;
                case 6:
                    output2 = missingAngle (output,output2,keyedInput);
                    System.out.println("The missing angle is "+output2+" degrees.");
                    break;
                case 7:
                    output = averageOfFourNumbers (averageFinder,keyedInput,output);
                    System.out.println("The average is "+output+".");
                    break;
                case 8:
                    output = perimeterOfARectangle (output,output2,keyedInput);
                    System.out.println("The perimeter of the rectangle is "+output+".");
                    break;
                case 9:
                    output = cubeRoot (output,keyedInput);
                    System.out.println("The final answer is "+output+".");
                    break;
                case 10:
                    output = multiplyingByOne (output,keyedInput);
                    System.out.println("The final number is "+output+".");
                    break;
                case 11:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("That is not a valid option, please try again.");
            }
        }
    }
}