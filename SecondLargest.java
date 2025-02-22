public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};

        int lar = arr[0];
        int slar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > lar) {
                // Largest will be at the lar
                slar = lar;
                lar = arr[i];
            } else if (arr[i] > slar) {
                //Just like if you beat the second person then you become the second haha
                slar = arr[i];
            }
        }

        System.out.println("Second largest is: " + slar);
    }
}
