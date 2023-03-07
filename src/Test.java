import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    private final String[] question = new String[]
            {"1: Who invented the Java language and in what year?", "2: Advantage of Java?",
                    "3: How many keywords exist in java version 17", "4: Select the java build sequence",
                    "5: What is the name of the java mascot?"};
    private String[] answer = new String[]
            {"a", "a", "c", "b", "a"};
    private final String[] answer1 = new String[]
            {
                    "\na. James Gosling 1995 y",
                    "\nb. James Cameron 1993 y",
                    "\nc. Ryan Gosling 1994 y"};
    private final String[] answer2 = new String[]
            {"\na. Java code will work on any platform with Java support",
                    "\nb. Great for the front end of the program",
                    "\nc. High speed, compared to C and C++ languages."};
    private final String[] answer3 = new String[]
            {
                    "\na. 51",
                    "\nb. 52",
                    "\nc. 53"};
    private final String[] answer4 = new String[]
            {"\na. JDK -> JAR -> JAVAC -> JVM",
                    "\nb. JDK -> JRE -> JVM -> JAVAC",
                    "\nc. JDC -> JRA -> JVC -> JAVAC"};
    private final String[] answer5 = new String[]
            {"\na. Duke",
                    "\nb. Douglas",
                    "\nc. Don"};
    private final String[] answers = new String[]
            {Arrays.toString(answer1), Arrays.toString(answer2), Arrays.toString(answer3),
                    Arrays.toString(answer4), Arrays.toString(answer5)};

    private short point;

    public void answer() {
        for (int i = 0; i < question.length; i++) {
            System.out.println(question[i] + "\n" + answers[i]);
            String answerScan = a();
            if (!answerScan.contains(answer[i])) {
            } else {
                point += 20;
            }
        }
        if (point >= 80) {
            System.out.println("Good " + point);
        } else if (point >= 60) {
            System.out.println("Great " + point);
        } else if (point >= 40){
            System.out.println("Cool " + point);
        }else if (point < 0){
            System.out.println("Badly " + point);
        }

    }

    public static String a() {
        String a = "";
        while (true) {
            try {
                String b = new Scanner(System.in).nextLine().toLowerCase();
                if (b.contains("a") || b.contains("b") || b.contains("c")) {
                    a = b;
                    break;
                } else {
                    throw new CheckAnswer("Enter only a. b. c.");
                }
            }catch (InputMismatchException e){
                System.out.println("Enter only character");
            }
            catch (CheckAnswer e) {
                System.out.println(e.getMessage());
            }
        }
        return a;
    }


}
