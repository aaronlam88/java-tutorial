package exercise.exercise02;

public class Student {
    private static IllegalArgumentException BAD_STRING = new IllegalArgumentException(
            "String is not in the right format. Expecting a csv string with 8 elementsF");

    private String id;
    private String firstName;
    private String lastName;
    private int quiz1;
    private int quiz2;
    private int quiz3;
    private int exam1;
    private int exam2;
    private Double average;
    private Character letterGrade;

    public Student(String str) {
        if (str == null) {
            throw BAD_STRING;
        }
        String[] tokens = str.split(",");
        if (tokens == null || tokens.length != 8) {
            throw BAD_STRING;
        }
        this.id = tokens[0].trim();
        this.firstName = tokens[1].trim();
        this.lastName = tokens[2].trim();
        this.quiz1 = Integer.parseInt(tokens[3]);
        this.quiz2 = Integer.parseInt(tokens[4]);
        this.quiz3 = Integer.parseInt(tokens[5]);
        this.exam1 = Integer.parseInt(tokens[6]);
        this.exam2 = Integer.parseInt(tokens[7]);
    }

    public Student(String id, String firstName, String lastName, int quiz1, int quiz2, int quiz3, int exam1,
            int exam2) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.quiz1 = quiz1;
        this.quiz2 = quiz2;
        this.quiz3 = quiz3;
        this.exam1 = exam1;
        this.exam2 = exam2;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getQuiz1() {
        return quiz1;
    }

    public void setQuiz1(int quiz1) {
        this.quiz1 = quiz1;
    }

    public int getQuiz2() {
        return quiz2;
    }

    public void setQuiz2(int quiz2) {
        this.quiz2 = quiz2;
    }

    public int getQuiz3() {
        return quiz3;
    }

    public void setQuiz3(int quiz3) {
        this.quiz3 = quiz3;
    }

    public int getExam1() {
        return exam1;
    }

    public void setExam1(int exam1) {
        this.exam1 = exam1;
    }

    public int getExam2() {
        return exam2;
    }

    public void setExam2(int exam2) {
        this.exam2 = exam2;
    }

}
