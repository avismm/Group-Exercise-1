//Write a Java Program to print the first 10 numbers of Fibonacci series
public class HW7FibonacciSeries {
    public static void main(String[] args) {
    int fibonacciNumber1,fibonacciNumber2;

    //Initializing the first and second values in the series
    fibonacciNumber1=1;
    fibonacciNumber2=1;

        for (int i = 1; i < 11; i++) {

            System.out.print(fibonacciNumber1+" ");

           /* the next number in a fibonacci series is the sum of the previous two numbers
            in the series*/
            int nextNumber = fibonacciNumber1 + fibonacciNumber2;

           /* Updating the values inside variables fibonacciNumber1 and fibonacciNumber2
            which will be used to compute the next number of the series in the proceeding
             iteration of the for loop*/
            fibonacciNumber1 = fibonacciNumber2;
            fibonacciNumber2 = nextNumber;

        }


        
    }
}
