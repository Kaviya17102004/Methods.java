import java.util.Arrays;

public class ArrayMethodsExample {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 7, 1, 5};
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
        int index = Arrays.binarySearch(numbers, 5);
        System.out.println("Index of 5: " + index);
    }
}
