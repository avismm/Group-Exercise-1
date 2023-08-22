
//Write a java program to find the second-largest number in the array.
public class HW9SecondLargestNumbersInArray {
    public static void main(String[] args) {
        int [] nums={34,7,45,34,66,23,21};
        int largest=nums[0];
        int secondLargest=nums[0];
        for (int num : nums) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        System.out.println("The second largest element is: " + secondLargest);
        }


}
