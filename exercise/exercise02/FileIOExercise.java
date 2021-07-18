package exercise.exercise02;

import java.util.List;

public class FileIOExercise {
    // a default file path
    // Note: static mean this variable is created without class construction
    private static final String defaultFilePath = "./exercise/exercise02/test.csv";

    public static void main(String[] args) {
        String filePath = defaultFilePath;
        if (args.length != 0) {
            filePath = args[0];
        }
        List<String> data = IOHandler.readFileIntoListOfStrings(filePath);
        for(String str : data) {
            System.out.println(str);
        }
    }
}
