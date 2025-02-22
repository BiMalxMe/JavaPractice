public class SumCLI {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("An Error occurred");
            return;
        }

        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            int sum = num1 + num2;
            System.out.println("Sum: " + sum);
        } catch (Exception e) {
            System.out.println("Error: Both arguments must be valid integers");
        }
    }
}