public class Main {
    public static void main(String[] args) {
        Human John = new Human(
                Condition.bad,
                Condition.missing,
                Condition.good,
                Condition.neutral,
                Condition.great,
                Condition.terrible,
                Condition.great);

        System.out.println(John);
    }
}