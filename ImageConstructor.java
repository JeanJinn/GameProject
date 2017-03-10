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
    
    static {
        for(char c = 'a'; c <= 'z'; c++) {
            try {
                BufferedImage img = ImageIO.read(new File("images/" + c + ".jpg"));
                alphabets.put((Character)c ,img);
            } catch(IOException e) {
                System.out.println("Can't load alphabet " + c);
            }
        }
    }
    
    public static GreenfootImage create(String word) {
        int len = word.length() * 100;
        GreenfootImage img = new GreenfootImage(len, 100);
        BufferedImage buf = img.getAwtImage();
        Graphics graphic = buf.getGraphics();
        char[] chars = word.toCharArray();
        int offset = 0;
        for(char c : chars) {
            graphic.drawImage(alphabets.get(c), offset, 0, null);
            offset += 100;
        }
        return img;
    }
}
