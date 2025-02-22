public class ExplicitTCDbToInt {
    public static void main(String[] args) {
        double doubleValue = 123.456;

        int intValue =  (int)doubleValue;

        System.out.println("Original  " + doubleValue);
        System.out.println("Casted  " + intValue);
    }
}