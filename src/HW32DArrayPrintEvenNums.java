/*Create a 2D array or integer type where you will store odd and even
        numbers. Develop a program which will identify/print the even
        numbers only.*/
public class HW32DArrayPrintEvenNums {
    public static void main(String[] args) {
        int [][] nums={{29,87,50,89,10,12,90}};

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if(nums[i][j]%2==0){
                    System.out.print(nums[i][j]+" ");

                }

            }

        }

    }
}
