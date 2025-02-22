public class MergeTwoSortedArr {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 3, 2};
        int[] arr2 = {1, 4, 3};

        // Sort both arrays then it changes globally
        sortArray(arr1);
        sortArray(arr2);

        for (int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println(" ");
        for (int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        // Merge the two sorted arrays
        int[] mergedArray = mergeArrays(arr1, arr2);
        System.out.println(" ");
        // Print new sorted merged array
        for (int i=0;i<mergedArray.length;i++){
            System.out.print(mergedArray[i]+" ");
        }
    }

    public static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // adding and comparing coresspondingly
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i];
                i++;
            } else {
                mergedArray[k++] = arr2[j];
                j++;
            }
        }

        while (i < arr1.length) {
            mergedArray[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;
    }


}