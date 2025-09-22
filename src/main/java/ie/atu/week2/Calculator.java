package ie.atu.week2;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

//Prompt the user for a second number
//Display the total to the screen
                Scanner scan1 = new Scanner(System.in);
//Please first number
        System.out.println("Please enter a number: ");
        double firstNum = scan1.nextDouble();
        System.out.println("You entered " + firstNum);

//Please enter second number
        System.out.println("Please enter a second number: ");
        double secondNum = scan1.nextDouble();
        System.out.println("You entered " + secondNum);
        if (secondNum == 0)
        {
            System.out.println("This could cause a divide by 0 error");
        }

        System.out.print("Choose an operation (add, subtract, multiply, divide) : ");
        String operation = scan1.next();


        boolean validOperation = true;
        double result = switch (operation) {
            case "add" -> {
                yield firstNum + secondNum;
            }
            case "subtract" -> {
                yield firstNum - secondNum;
            }

            case "multiply" -> {
               yield firstNum * secondNum;
            }

            case "divide" ->{
                yield firstNum / secondNum;
            }


                default -> {
                    System.out.println("Invalid operation.");
                    yield 0;

                }
        };
        System.out.println("The answer is: " + result);
    }
}
