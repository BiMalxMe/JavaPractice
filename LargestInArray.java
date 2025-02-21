public class LargestInArray {
    public static void main(String[] args) {
        int[] arr= {-1,2,3,4,5,90};
        int lar = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]> lar){
                lar = arr[i];
            }
        }
        System.out.println(lar);
    }

}
