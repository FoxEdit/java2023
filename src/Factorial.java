public class Factorial {
    private final int factorial;

    public Factorial(int factorial) {
        this.factorial = factorial;
    }

    public int getResult() {
        int sum = 1;
        for (int i = 1; i <= factorial; ++i) {
            sum *= i;
        }

        return sum;
    }
}
