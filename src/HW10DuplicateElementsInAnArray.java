
//Write a program to print out duplicate elements from an Array of
//Strings
public class HW10DuplicateElementsInAnArray {
    public static void main(String[] args) {
        String[] elements = {"maize", "beef", "maize", "turkey", "chicken", "chicken"};
        for (int i = 0; i < elements.length-1; i++) {
            for (int j = i+1; j < elements.length; j++) {
                if( (elements[i].equals(elements[j])) && (i != j) ) { // comparing the rest of the elements with the current iteration of i
                    System.out.println(elements[j]+ " is a duplicate element in the array");
                }
            }
        }

    }
}
