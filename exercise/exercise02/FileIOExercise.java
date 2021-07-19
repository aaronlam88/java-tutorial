package exercise.exercise02;

import java.util.ArrayList;
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
        System.out.println("==== Input ====");
        List<String> data = IOHandler.readFileIntoListOfStrings(filePath);
        data.remove(0);
        List<Student> students = new ArrayList<>();
        for(String str : data) {
            System.out.println(str);
            students.add(new Student(str));
        }
        System.out.println("==== Result ====");
        // This currently will print the wrong result
        for(Student student : students) {
            System.out.println(student.toString());
        }
        // For each student, calculate the weighted average score and assign a letter grade
        // Call functions in GradeProcessor class to do the calculation
    }
}
