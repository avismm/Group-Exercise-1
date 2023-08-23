
//Maximum and minimum number in the array
public class HW8MaxAndMinNumbersInArray {
    public static void main(String[] args) {
        int [] nums={34,7,45,34,66,23,21};
        int maxNum=nums[0];
        for (int i = 0; i < nums.length; i++) {

        /* Under the current iteration of the for loop, we check whether the next element
        in the array is larger than the value that was previously declared or updated
        inside the maxNum variable. If true, we update the value inside the maxNum variable
             as the new maximum value of the array*/
            if (nums[i] > maxNum) {
                maxNum=nums[i];

            }

        }
        System.out.println("The maximum number is "+maxNum);
        System.out.println();

        int minNum=nums[0];
        for (int i = 0; i < nums.length; i++) {

             /* Under the current iteration of the for loop, we check whether the next element
        in the array is smaller than the value that was previously declared or updated
        inside the minNum variable. If true, we update the value inside the minNum variable
             as the new minimum value of the array*/
            if (nums[i] < minNum) {
                minNum=nums[i];

            }

        }
        System.out.println("The minimum number is "+minNum);
    }
}
