//Write a Java Program to print the first 10 numbers of Fibonacci series
public class HW7FibonacciSeries {
    public static void main(String[] args) {
    int fibonacciNumber1,fibonacciNumber2;
    fibonacciNumber1=0;
    fibonacciNumber2=1;

        for (int i = 1; i < 11; i++) {

            System.out.print(fibonacciNumber1+" ");
            int nextNumber = fibonacciNumber1 + fibonacciNumber2;
            fibonacciNumber1 = fibonacciNumber2;
            fibonacciNumber2 = nextNumber;

        }


        
    }
}
