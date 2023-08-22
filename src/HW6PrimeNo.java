//Write a java program to check whether a given number is prime or
//not?
public class HW6PrimeNo {
    public static void main(String[] args) {
        int number = 9;
        boolean prime = false;
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                prime = true;
               break;
            }
        }
        if (!prime)
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");
        
    }
}
