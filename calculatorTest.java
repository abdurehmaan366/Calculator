import java.util.Scanner;

class calculator {

    int a;
    int b;

    // no args constructor
    public calculator () {

    }

    // 2 args constructor
    public calculator (int cpy_a, int cpy_b) {
        a = cpy_a;
        b = cpy_b;
    }

    public int sum () {
        return a + b;
    }

    public int subtraction () {
        return a - b;
    }

    public int product () {
        return a * b;
    }

    public int division () {
        return a / b;
    }
}

public class calculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("My Calculator (My first github trial)");
        System.out.println("Enter 2 numbers (Integers) with spaces: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println("Enter an operation to perform: ");
        System.out.println("1. Sum \n2. SUbtract \n3. Product \n4. Division");
        int op = sc.nextInt();


        calculator calc = new calculator(n1, n2);
        if (op == 1) {
            int result = calc.sum();
            System.out.println("Result: " + result);
            System.out.println("Sum successful...");
        }
        else if (op == 2) {
            int result = calc.subtraction();
            System.out.println("Result: " + result);
            System.out.println("Subtraction successful...");
        }
        else if (op == 3) {
            int result = calc.product();
            System.out.println("Result: " + result);
            System.out.println("Product successful...");
        }
        else if (op == 4) {
            int result = calc.division();
            System.out.println("Result: " + result);
            System.out.println("Division successful...");
        }
        else {
            System.out.println("Invalid input, try running the program again");
        }
    }
}
