
//Maximum and minimum number in the array
public class HW8MaxAndMinNumbersInArray {
    public static void main(String[] args) {
        int [] nums={34,7,45,34,66,23,21};
        int maxNum=nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxNum) {
                maxNum=nums[i];

            }

        }
        System.out.println("The maximum number is "+maxNum);
        System.out.println();

        int minNum=nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minNum) {
                minNum=nums[i];

            }

        }
        System.out.println("The minimum number is "+minNum);
    }
}
