public class Main {
    private static final short program = 1;
    public static void main(String[] args) {
        switch (program) {
            case 1:
                Author author = new Author("John", "john@mail.ru", 'M');
                System.out.print(author);
                author.setEmail("john@gmail.com");
                System.out.println(author);

                break;
            case 2:
                Ball b1 = new Ball(100, 100);
                System.out.print(b1);
                b1.move(30, 15);
                System.out.print(b1);

                break;
        }
    }
}