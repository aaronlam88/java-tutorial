package exercise.exercise02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IOHandler {
    /**
     * Read user's input using BufferReader Note: public -> this function can be
     * access by other class
     * 
     * @return user's input as String
     * @throws IOException
     */
    public static String readUserInputWithBufferedReader() throws IOException {
        // Read data using BufferReader from System.in
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Reading user's input into a String
        String input = reader.readLine();
        // Remember to close the BufferReader to prevent memory leak
        reader.close();
        return input;
    }

    /**
     * Read file into a List of String. Return empty list if error
     * 
     * @param filePath
     * @return
     */
    public static List<String> readFileIntoListOfStrings(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            List<String> lines = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
            return lines;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
