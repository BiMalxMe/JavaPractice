public class SumArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 15};
        int sum = 0;

        for(int i=0;i<array.length;i++) {
            sum += array[i];
        }

        System.out.println("Sum of all elements in the array: " + sum);
    }
}