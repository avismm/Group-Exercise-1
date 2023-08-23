
/*Create a program that uses an array to store a list of temperatures for
        a week, and then uses a loop to find the highest and lowest
        temperature for the week.*/
public class HW1HighestAndLowestTemp {
    public static void main(String[] args) {
        double [] temp={34.6,36.3,40,30.4,41.2,32,33};
        double maxTemp=temp[0];
        for (int i = 0; i < temp.length; i++) {

            /* Under the current iteration of the for loop, we check whether the next element
             in the array is larger than the value that was previously declared or updated
             inside the maxTemp variable. If true, we update the value inside the maxTemp variable
             as the new maximum temperature*/
            if (temp[i] > maxTemp) {
                maxTemp=temp[i];

            }

        }
        System.out.println("The maximum temperature is "+maxTemp);
        System.out.println();

        double minTemp=temp[0];
        for (int i = 0; i < temp.length; i++) {

           /* Under the current iteration of the for loop, we check whether the next element
             in the array is smaller than the value that was previously declared or updated
             inside the minTemp variable. If true, we update the value inside the minTemp variable
             as the new minimum temperature*/
            if (temp[i] < minTemp) {
                minTemp=temp[i];

            }

        }
        System.out.println("The minimum temperature is "+minTemp);

    }
}
