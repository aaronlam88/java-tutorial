package exercise.exercise02;

/**
 * You will need to implement this class to give the correct result
 */
public class GradeProcessor {
    /**
     * quiz average = (quiz1 + quiz2 + quiz3) / 3
     * @param student
     * @return
     */
    public static double quizAvg(Student student) {
        double quizAvg = 0.0;

        return quizAvg;
    }

    /**
     * quiz examAvg = (exam1 + exam2) / 3
     * @param student
     * @return
     */
    public static double examAvg(Student student) {
        double quizAvg = 0.0;

        return quizAvg;
    }

    /**
     * quizzes are 30% of the grade, and exams are 60% of the grade
     * @param quizAvg
     * @param examAvg
     * @return
     */
    public static double weightedAvg(double quizAvg, double examAvg) {
        double weightedAvg = 0.0;

        return weightedAvg;
    }

    /**
     * A: 90-100
     * B: 80-89
     * C: 70-79
     * D: 60-69
     * F: less than 60
     * @param weightedAvg
     * @return
     */
    public char letterGrade(double weightedAvg) {
        char letterGrade = 'F';

        return letterGrade;
    }
}
