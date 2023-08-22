/*Create a 2D array of integers. Develop a program which will calculate
        the sum of even and odd numbers for that array.*/
public class HW42DArraySumOddAndEven {
    public static void main(String[] args) {
        int[][] nums = {{29, 87, 50, 89, 10, 12, 90}};
        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (nums[i][j] % 2 != 0) {
                    sumOdd += nums[i][j];

                }

            }
            System.out.print("The sum of odd numbers is "+sumOdd);
        }
        System.out.println();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (nums[i][j] % 2 == 0) {
                    sumEven += nums[i][j];

                }

            }
            System.out.print("The sum of even numbers is "+sumEven);

        }
    }
}
