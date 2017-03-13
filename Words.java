import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import greenfoot.*;

public class Words  
{
    private static List<String> words;
    
    static {
        try {
            words = Files.readAllLines(FileSystems.getDefault().getPath("wordlist.txt"));
        } catch(IOException e) {
            words = new ArrayList<>();
            words.add("error");
        }
    }
    
    public static String getRandomWord() {
        return words.get(Greenfoot.getRandomNumber(words.size()));
    }
}
