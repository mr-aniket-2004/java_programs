class NumberisZero extends Exception {
    NumberisZero() {
        System.out.println("Number is Zero");
    }
}

class invalidData extends Exception {
    invalidData() {
        System.out.println("Invalid data");
    }
}

public class Slip30B {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String s = args[0];
        StringBuffer str = new StringBuffer(s);
        try {
            if (n == 0) {
                throw new NumberisZero();
            } else {
                System.out.println("Original Number ---- "+n);
                str = str.reverse();
                if(str.equals(s))
                {
                    System.out.println("The number is palindrome");
                }
                else
                {
                    System.out.println("The number is not palindrome");
                }
            }
        } catch (NumberisZero e) {
            System.out.println("error found");
        } finally {
            System.out.println("complate the programme");
        }
    }
}
