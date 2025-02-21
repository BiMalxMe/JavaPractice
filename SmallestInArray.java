public class SmallestInArray {
    public static void main(String[] args) {
        int[] arr= {-1,2,3,4,5};
        int sm = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]<sm){
                sm = arr[i];
            }
        }
        System.out.println(sm);
    }

}
