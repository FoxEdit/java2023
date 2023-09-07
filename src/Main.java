public class Main {
    private static final short program = 1;

    public static void main(String[] args) {
        switch (program) {
            case 1:
                Dog oldRex = new Dog("Rex", 9);
                Dog youngRex = new Dog("Rex");
                Dog undefinedDog = new Dog();

                System.out.print(oldRex);
                System.out.print(youngRex.toString() + '\n');
                System.out.print(undefinedDog.toString() + '\n');

                break;
            case 2:
                Circle defaultOneCircle = new Circle();
                Circle defaultWithDefinedRadiusOneCircle = new Circle(5.0); // double
                Circle yellowWithRadiusOneCircle = new Circle(5.0, "yellow");

                System.out.print(defaultOneCircle.toString() + '\n');
                System.out.print(defaultWithDefinedRadiusOneCircle.toString() + '\n');
                System.out.print(yellowWithRadiusOneCircle.toString() + '\n');

                break;
            case 3:
                Book untitledBook = new Book();
                Book trattedBook = new Book("tales about something interesting");
                Book javaBook = new Book("Learn Java in 24 days!", 248);


                System.out.print(untitledBook.toString() + '\n');
                System.out.print(trattedBook.toString() + '\n');
                System.out.print(javaBook.toString() + '\n');

                break;
            default:
                System.out.print("unknown condition");
        }
    }
}
