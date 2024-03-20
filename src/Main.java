import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // File Reader (We can't read file data)
        FileReader data;
        try {
            data = new FileReader("text.txt");
            System.out.println(data.read());
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Buffered Reader
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader("text.txt"));
            System.out.println(bufferedReader.readLine());
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Scanner
        Scanner in;

        try {
            in = new Scanner( new File("text.txt") );
            System.out.println(in.nextLine());
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        }

        // File Writer
        PrintWriter result;

        try {
            result = new PrintWriter(new FileWriter("result.dat"));
            System.out.println(result);
        }
        catch (IOException e) {
            System.out.println(e);
        }

    }
}