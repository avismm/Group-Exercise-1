
/*Create an array of integer values. After the array is created, calculate
        the sum of all stored elements in that array.*/
public class HW2SumOfIntValues {
    public static void main(String[] args) {
        int [] nums={29,87,50,89,10,12,90};
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
                sum+=nums[i];
        }
        System.out.println(sum);

    }
}
