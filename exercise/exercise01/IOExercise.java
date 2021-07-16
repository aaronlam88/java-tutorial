package exercise.exercise01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Scanner;

public class IOExercise {
    public IOExercise() {
        System.out.println("Start IOException");
    }

    /**
     * Read user's input using BufferReader
     * 
     * @return user's input as String
     * @throws IOException
     */
    private String readUserInputWithBufferedReader() throws IOException {
        // Read data using BufferReader from System.in
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Reading user's input into a String
        String input = reader.readLine();
        // Remember to close the BufferReader to prevent memory leak
        reader.close();
        return input;
    }

    /**
     * Read user's input using Scanner
     * 
     * @return user's input as String
     * @throws IOException
     */
    private String readuserInputWithScanner() {
        // Read data using Scanner from System.in
        Scanner in = new Scanner(System.in);
        // Reading user's input into a String
        String input = in.nextLine();
        // Remember to close the Scanner to prevent memory leak
        in.close();
        return input;
    }

    /**
     * main function to run this program
     * Note: args is for command line input
     * Note: need to throw Exception because of readUserInputWithBufferedReader
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // Construct an object so we can call function defined in this class
        // Note: "Start IOException" is printed after construction
        IOExercise ioExercise = new IOExercise();
        // Ask for user input
        System.out.print("Please enter your name: ");
        // Using defined function to read input
        String yourName = ioExercise.readUserInputWithBufferedReader();
        // Get current time with java.Instant
        Instant timeInstant = Instant.now();
        // Greeting user and print the current time
        // Use String.format to create a message %s will be replace by variable
        // Note: This time is UTC time and may not be the same as your local time
        String message = String.format("Hi %s, nice to meet your. ISO8601 time now is %s", yourName,
                timeInstant.toString());
        System.out.println(message);
        // Get your current local time
        LocalTime localTime = timeInstant.atZone(ZoneId.systemDefault()).toLocalTime();
        // Create a message string again
        // Note: %2d mean using 2 space to for digit, using to print int or long data type
        message = String.format("Your local time is %2d:%2d", localTime.getHour(), localTime.getMinute());
        System.out.println(message);
        // Finish this exercise by adding the following features
        // Greet the user with the following message
        // From 1am - 12pm --> Good Morning
        // From 1pm - 4pm --> Good Afternoon
        // From 5pm - 12am --> Good Night
        throw new Exception("Complete the not implemented features and remove this line");
    }
}
