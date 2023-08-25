//Write a program to swap 2 numbers without a temporary variable
public class HW5SwappingTwoNumbers {
    public static void main(String[] args) {
    int num1, num2;
    num1=200;
    num2=600;
    num1=num1+num2;// replaces the value of num1 with the sum of num1 and num2
    num2=num1-num2;//replaces the value of num2 with num1
    num1=num1-num2;//replaces the value of num1 with num2

        System.out.println("The new value of 'num1' after the swap is "+num1);
        System.out.println("The new value of 'num2' after the swap is "+num2);

    }
}
