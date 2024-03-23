import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Reads numbers from a file named data.dat and writes them to a file
 * named reverse.dat in reverse order.  The input file should contain
 * only real numbers.
 */
public class ReverseFileWithScanner {
    public static void main(String[] args) {
        // Scanner
        Scanner in;
        PrintWriter result;
        ArrayList<Double> numbers;  // An ArrayList for holding the data.

        numbers = new ArrayList<Double>();

        // get data from file
        try {
            in = new Scanner( new File("data.dat") );
            System.out.println(in.nextLine());
        }
        catch (FileNotFoundException e) {
            System.out.println("Can't find file data.dat!");
            return;  // End the program by returning from main().
        }

        // create an output file
        try {
            result = new PrintWriter(new FileWriter("reverse.dat"));
        } catch (IOException e) {
            System.out.println("Can't open file result.dat!");
            System.out.println("Error: " + e);
            in.close();  // Close the input file.
            return;        // End the program.
        }

        while (in.hasNextDouble()) {
            double inputNumber = in.nextDouble();
            numbers.add( inputNumber );
        }

        // Output the numbers in reverse order.

        for (int i = numbers.size()-1; i >= 0; i--)
            result.println(numbers.get(i));

        System.out.println("Done!");

        in.close();
        result.close();
    }
}
