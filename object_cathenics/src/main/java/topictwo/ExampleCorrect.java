package topictwo;

public class ExampleCorrect {
    /**
    This example show the behavior for topic two that is "Don't use Else",
    in other words, don't use else, you might prefer early return. You can simplify the logic
     for to lead better with this role
     */

    public static void main(String[] args) {

        int number = 3;

        System.out.println(checkNumber(number));
    }

    private static String checkNumber(int number) {
        if (number % 2 == 0){
            return "é par";
        }
        return "é impar";
    }
}
