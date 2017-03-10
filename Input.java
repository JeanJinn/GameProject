import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Input here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Input extends Actor
{
    private String word = "";
    private static final GreenfootImage EMPTY_IMAGE = new GreenfootImage(1,1);
    /**
     * Act - do whatever the Input wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    public void setWord(String word) {
        this.word = word;
        if(word.isEmpty())
            setImage(EMPTY_IMAGE);
        else
            setImage(ImageConstructor.create(word));
    }
    
    public String getWord() {
        return word;
    }
}
