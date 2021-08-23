import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;

public class ImageProcessing {
    public ImageProcessing(BufferedImage image) {

        //arrays list that will contain all pixel's colors that given image have.
        ArrayList<MyColor> colorsList = new ArrayList<>();

        //get all of pixels colors
        for(int i = 0; i < image.getWidth();i++)
            for(int j = 0; j<image.getHeight();j++)
                colorsList.add(new MyColor(
                        (image.getRGB(i, j) & 0xff0000) >> 16,
                        (image.getRGB(i, j) & 0xff00) >> 8,
                        image.getRGB(i, j) & 0xff
                ));

        HashMap<ColorName , Integer > colorCounter = new HashMap<>();
        //this loop counts  how many each color (from enum) exists appears.
        for (ColorName colorName: ColorName.values()){
            colorCounter.put(colorName, (int)colorsList.stream()
                    .filter( myColor -> myColor.getColorName()
                            .equals(colorName))
                    .count());
            //Check if a specified color appears more often than 0.15%
            if((double) colorCounter.get(colorName) / (double) colorsList.size() * 100 >= 0.15 ) {
                //IF appears then print in console.
                System.out.printf("%s: %.2f%c", colorName.toString().toLowerCase(), (double) colorCounter.get(colorName) / (double) colorsList.size() * 100, '%');
                System.out.println();
            }
        }
    }
}
