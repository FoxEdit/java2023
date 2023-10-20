import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageDisplayApp extends Frame {
    private BufferedImage image;

    public ImageDisplayApp(String imagePath) {
        try {
            image = ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            System.out.println("Ошибка при открытии изображения!");
            System.exit(1);
        }

        setTitle("Image Display App");
        setSize(image.getWidth(), image.getHeight());
    }

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, this);
    }
}
