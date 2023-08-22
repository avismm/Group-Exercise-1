
/*Create a program that uses an array to store a list of temperatures for
        a week, and then uses a loop to find the highest and lowest
        temperature for the week.*/
public class HW1HighestTemp {
    public static void main(String[] args) {
        double [] temp={34.6,78.3,45,30.4,44,32,33};
        double maxTemp=temp[0];
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > maxTemp) {
                maxTemp=temp[i];

            }

        }
        System.out.println(maxTemp);

    }
}
