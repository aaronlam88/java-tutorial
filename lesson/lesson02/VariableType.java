package lesson.lesson02;

public class VariableType {
    private static void learnAboutNumber() {
        int num1 = 5; // from -2^31 to 2^31 - 1; See Integer as well
        long num2 = -1234567890; // from -2^63 to 2^63 - 1; See Long as well
        float num3 = 5.2;
        double num4;
    }

    // Learn about String
    // Main take away, String is immutable --> cannot be modify
    private static void learnAboutString() {
        // == String concat
        String s1 = "test";
        String s2 = "me";
        // == Only + is available
        System.out.println(s1 + " " + s2);
        // == Some build in function
        System.out.println(s1.toUpperCase() + " " + s2.toUpperCase());
        // == Immutable
        String s3 = "you";
        s3 = s3.toUpperCase();
        System.out.println("s3 = s3.toUpperCase() --> " + s3);
        // Note: because String is IMMUTABLE
        // So, a new String is created and assign to the old variable
        // s3 = "you"
        // s3.toUpperCase() --> "YOU"
        // null --> "you"; this will be garbage collected (learn more about GC later)
        // s3 --> "YOU"
        // == Compare
        // Try to avoid use '==' or '!=' for String, instead, used equal() function
        String s4 = new String("test");
        String s5 = new String("test");
        System.out.println(String.format("%s == %s ? %s", s1, s4, s1 == s4));
        System.out.println(String.format("%s == %s ? %s", s4, s5, s4 == s5));
        System.out.println(String.format("%s == %s ? %s", s1, s4, s1.equals(s4)));
        System.out.println(String.format("%s == %s ? %s", s4, s5, s4.equals(s5)));
    }

    public static void main(String[] args) {
        learnAboutString();
    }
}
