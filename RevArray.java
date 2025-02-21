import java.util.Scanner;

public class RevArray {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5};

        System.out.println("Original array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println(" ");
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println("Reversed array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

    }
}