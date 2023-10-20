public class Main {
    public static void main(String[] args) {
        String word = "radars"; // Замените это слово на ваше слово

        boolean result = isPalindromeRecursive(word, 0, word.length() - 1);

        if(result)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static boolean isPalindromeRecursive(String word, int left, int right) {
        // если осталась одна буква или нет букв, это палиндром
        if (left >= right) {
            return true;
        }

        // если буквы по краям не совпали это не палиндром
        if (word.charAt(left) != word.charAt(right)) {
            return false;
        }

        // срезаем буквы
        return isPalindromeRecursive(word, left + 1, right - 1);
    }
}