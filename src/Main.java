public class Main {
    public static void main(String[] args) {
        int N = 12345;
        printDigitsReverse(N);
    }

    public static void printDigitsReverse(int N) {
        if (N == 0) {
            return;
        } else {
            int lastDigit = N % 10;
            N /= 10;
            System.out.println(lastDigit); // Выводим цифру
            printDigitsReverse(N);
        }
    }
}