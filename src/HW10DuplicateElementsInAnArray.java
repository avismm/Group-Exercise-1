
//Maximum and minimum number in the array
public class HW10DuplicateElementsInAnArray {
    public static void main(String[] args) {
        String[] elements = {"maize", "beef", "maize", "turkey", "chicken", "chicken"};
        for (int i = 0; i < elements.length-1; i++) {
            for (int j = i+1; j < elements.length; j++) {
                if( (elements[i].equals(elements[j])) && (i != j) ) {
                    System.out.println(elements[j]+ " is a duplicate element in the array");
                }
            }
        }

    }
}
