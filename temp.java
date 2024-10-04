class NotEligible extends Exception {
    NotEligible() {
        super("Candidate is not eligible for vote");
    }
}

public class Slip29B {
    public static void main(String[] args) {
        try {
            // Check if command line argument is provided
            if (args.length == 0) {
                throw new ArrayIndexOutOfBoundsException();
            }

            int age = Integer.parseInt(args[0]);

            if (age < 18) {
                throw new NotEligible();
            } else {
                System.out.println("Candidate is eligible for voting");
            }

        } catch (NotEligible e) {
            System.out.println(e.getMessage());
            System.out.println("The age must be 18 or above");
        } catch (ArrayIndexOutOfBoundsException ee) {
            System.out.println("Please pass the arguments");
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number for age");
        } finally {
            System.out.println("Program run successfully");
        }
    }
}
