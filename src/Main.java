

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java ImageDisplayApp <image_path>");
            System.exit(1);
        }

        // /home/foxedit/dog.jpeg
        // /home/foxedit/samurai.jpg
        // /home/foxedit/frog.png
        String imagePath = args[0];

        ImageDisplayApp app = new ImageDisplayApp(imagePath);
        app.setVisible(true);
    }
}