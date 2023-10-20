
public class Main {
    public static void main(String[] args) {
        String number = "001111110";
        int count = countOnesInSequence(number, 0, 0);
        System.out.println("Число 1 встречается " + count + " раз(а) в последовательности.");
    }

    public static int countOnesInSequence(String input, int index, int onesCount) {
        if (index >= input.length()) {
            // Достигнут конец ввода, возвращаем количество единиц.
            return onesCount;
        }

        if (index + 1 < input.length()
                && input.substring(index, index + 2).equals("00")) {
            // Если найдены два нуля подряд, завершаем счет
            return onesCount;
        }

        char currentChar = input.charAt(index);

        if (currentChar == '1') {
            // Если текущий символ - '1', увеличиваем счетчик единиц.
            onesCount++;
        }

        // Рекурсивный вызов для следующего символа.
        return countOnesInSequence(input, index + 1, onesCount);
    }
}