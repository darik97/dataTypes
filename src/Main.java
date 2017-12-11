import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer number = 10;
        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        String input = in.next();
        try {
            int numberIn = Integer.parseInt(input);
            if (numberIn < number) {
                System.out.printf("%d is less then %d\n", numberIn, number);
            } else if (numberIn > number){
                System.out.printf("%d is more then %d\n", numberIn, number);
            } else {
                System.out.printf("The input number is %d", numberIn);
            }
        } catch (NumberFormatException e) {
            System.out.println("Enter a number!");
        }
    }
}
