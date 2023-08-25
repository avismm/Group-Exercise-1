import java.util.Scanner;

//Write a java program to check whether a given number is prime or
//not?
public class HW6CheckingAPrimeNo {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int number;
        do{
            System.out.println("Please enter a number greater than 1"); // Prime numbers must be positive and greater than 1
            number=input.nextInt();
        }while(number<=1); // Repeats the loop if the input was less than zero or equal to 1

        boolean prime = false;
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                prime = true;
                break;
            }
        }
        if (!prime) {
            System.out.println(number + " is a prime number.");
    }else
            System.out.println(number + " is not a prime number.");
        
    }
}
