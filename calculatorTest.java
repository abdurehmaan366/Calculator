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

    public int sum (int a, int b) {
        return a + b;
    }

    public int subtraction (int a, int b) {
        return a - b;
    }

    public int product (int a, int b) {
        return a * b;
    }

    public int division (int a, int b) {
        return a / b;
    }
}

public class calculatorTest {
    public static void main(String[] args) {
        System.out.println("My Calculator (My first github trial)");
    }
}
