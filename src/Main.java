import java.util.Scanner;

public class Main {

    /**
     *  Driving is expensive. Write a program with a car's gas mileage
     *  (miles/gallon) and the cost of gas (dollars/gallon)
     *  as floating-point input, and output the gas cost for
     *  20 miles, 75 miles, and 500 miles.
     *
     * Output each floating-point value with two digits after the decimal point, which can be achieved as follows:
     * System.out.printf("%.2f", yourValue);
     *
     * The output ends with a newline.
     *
     * Ex: If the input is:
     *
     * 20.0 3.1599
     * where the gas mileage is 20.0 miles/gallon and the cost of gas is $3.1599/gallon, the output is:
     *
     * 3.16 11.85 79.00
     * @param args
     */
    public static void main(String[] args) {

        // This is the scanner. We create the Scanner to read the user input.
        Scanner s = new Scanner(System.in);

        // declaring a double variable called miles per gallon and assign it to the userInput.
        double mpg = s.nextDouble();

        // declaring another double variable called gas per gallon and assign to to the userInput which is .nextDouble.
        double gpg = s.nextDouble();

        // declare another double variable called total to get the gas mileage.
        // notice that when you put 20.0 3.1599 in the input, we gets the 6.33 which is what we wanted
        // that will be the gas mileage and to find how much it costs, we divide Miles Per Gallon by gas per gallon to get
        // the price.
        double total = mpg/gpg;

        // print it using the print f statement to get the float of the number same as it wants in the instructions.
        //

        System.out.printf("%.2f " ,total);
//        System.out.printf("%.2f ", 20 / total);
//        System.out.printf("%.2f ", 75 / total);
//        System.out.printf("%.2f\n", 500 / total);

    }
}