package lesson.lesson02;

public class VariableType {
    private static void learnAboutNumber() {
        // For number without decimal points, use int if you know that your number will
        // be small, else use long
        int num1 = 5; // 4 bytes (32 bits), from -2^31 to 2^31 - 1; Primitive type for Integer
        long num2 = 9223372036854775807l; // 8 bytes(64 bits) from -2^63 to 2^63 - 1; Primitive type for Long
        // For factional number, I usually use double and rarely use float
        float num3 = 5.2f; // 4 bytes (32 bits), 6 to 7 decimal digits; Primitive type for Float
        double num4 = 3.1415; // 8 bytes(64 bits), 15 to 16 decimal points; Primitive type for Double

        // Type casting, long is too big for int, will overflow and give you incorrect
        // result
        num1 = (int) num2;
        System.out.println(String.format("num1: %d | num2: %d", num1, num2));
        // Arithmetic: smaller type will be converted to the larger type

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
        learnAboutNumber();
    }
}
