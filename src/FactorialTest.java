public class FactorialTest {
    static Factorial factorial;
    static String result;
    public static void main(String[] args) {
        factorial = new Factorial(4);
        result =  factorial.getResult() == 24 ? "TEST 1 PASSED\n" : "TEST 1 FAILED\n";
        System.out.println(result);

        factorial = new Factorial(1);
        result =  factorial.getResult() == 1 ? "TEST 2 PASSED\n" : "TEST 2 FAILED\n";
        System.out.println(result);

        factorial = new Factorial(8);
        result =  factorial.getResult() == 40320 ? "TEST 3 PASSED\n" : "TEST 3 FAILED\n";
        System.out.println(result);
    }
}
