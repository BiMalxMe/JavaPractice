import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms : ");
        int n = sc.nextInt();

        int firstTerm = 0, secondTerm = 1,i;
        System.out.print( firstTerm + " "+secondTerm + " ");
        for(i=0;i<n;i++){
           int newNumber = firstTerm + secondTerm;
            System.out.print(newNumber + " ");
           firstTerm = secondTerm;
           secondTerm = newNumber;
       }
    }
}