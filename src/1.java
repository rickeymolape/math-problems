import java.util.Random;

public class MathProblems {
    private static Random random = new Random();

    public static int randomNumber(int min, int max) {
        return random.nextInt((max - min) + 1) + min;
    }

    public static String generateMathProblem() {
        // Generate two random numbers between 1 and 10
        int num1 = randomNumber(1, 10);
        int num2 = randomNumber(1, 10);

        // Determine the operation (currently supports addition, subtraction, multiplication, and division)
        char operation = (char)(random.nextInt(4) + '+');

        // Build the problem string
        String problem = "What is " + num1 + " " + operation + " " + num2 + "?";

        return problem;
    }
}
