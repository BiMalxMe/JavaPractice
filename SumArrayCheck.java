
//It basically is a program written to check wheather the sum of array is equal to another or not

public class SumArrayCheck {

    public static boolean check(int[] first,int[] second){
        int sumFirst = 0, sumSecond = 0;
        int i;
        for(i=0;i<first.length;i++){
            sumFirst = first[i] + sumFirst;
        }
        for(i=0;i<first.length;i++){
            sumSecond = second[i] + sumSecond;
        }
        return sumFirst==sumSecond;
    };

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {5,4,3,2,1};

        boolean value = check(arr1,arr2);

        if(value){
            System.out.println("Sum is equal");
        }
        else{
            System.out.println("Sum is unequal");
        }

    }
}
