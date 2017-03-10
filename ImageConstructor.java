import greenfoot.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
import java.util.*;
import java.io.File;
import java.io.IOException;

public class ImageConstructor  
{
    public static java.util.HashMap<Character ,BufferedImage> alphabets = new HashMap<>();
    
    private static final int IMAGE_SIZE = 50;
    
    static {
        for(char c = 'a'; c <= 'z'; c++) {
            try {
                BufferedImage img = ImageIO.read(new File("images/" + c + ".jpg"));
                alphabets.put((Character)c ,img);
            } catch(IOException e) {
                System.out.println("Can't load alphabet " + c);
            }
        }
        for(char c = '0'; c <= '9'; c++) {
            try {
                BufferedImage img = ImageIO.read(new File("images/" + c + ".jpg"));
                alphabets.put((Character)c ,img);
            } catch(IOException e) {
                System.out.println("Can't load number " + c);
            }
        }
    }
    
    public static GreenfootImage create(String word) {
        int len = word.length() * IMAGE_SIZE;
        GreenfootImage img = new GreenfootImage(len, IMAGE_SIZE);
        BufferedImage buf = img.getAwtImage();
        Graphics graphic = buf.getGraphics();
        char[] chars = word.toCharArray();
        int offset = 0;
        for(char c : chars) {
            graphic.drawImage(alphabets.get(c), offset, 0, null);
            offset += IMAGE_SIZE;
        }
        return img;
    }
}
