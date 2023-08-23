
//Write a java program to find the second-largest number in the array.
public class HW9SecondLargestNumbersInArray {
    public static void main(String[] args) {
        int [] nums={34,7,48,56,54,23,21};
        int largest=nums[0];
        int secondLargest=nums[0];
        for (int value : nums) { // for every integer in an array of nums.

            /*If the next element in the array is larger that the current largest integer,
            then replace the value of the "secondLargest" variable with the current value
            of the "largest" variable*/
            if (value > largest) {
                secondLargest = largest;

                /*If the next element in the array is larger than the previous largest integer,
                this element becomes the new largest integer and is stored inside the variable
                "largest".*/
                largest = value;
            } else if (value > secondLargest && value != largest) {
                secondLargest = value;
            }
        }
        System.out.println("The second largest element is: " + secondLargest);
        }


}
