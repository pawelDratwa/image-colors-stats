import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
            //Creating anonymous class, that executes color check part in constructor method.
            new ImageProcessing( ImageIO.read(new File("image.png")));
    }

}
