import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreDisplay extends Actor
{
    int value;
    public ScoreDisplay() {
        this(0);
    }
    
    public ScoreDisplay(int score){
        setValue(score);
    }

    public void act() 
    {
        
    }    
    
    public void add(int val) {
        value += val;
        updateImage();
    }
    
    public void setValue(int val) {
        value = val;
        updateImage();
    }
    
    public int getValue() {
        return value;
    }
    
    public void updateImage() {
        setImage(ImageConstructor.create(String.format("%05d", value)));
    }
    
}
