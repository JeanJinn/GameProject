import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Junimo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Junimo extends Actor
{
    private GifImage gif;
    /**
     * Act - do whatever the Junimo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Junimo()
    {
        gif = new GifImage("junimo.gif");
        setImage(gif.getCurrentImage());
    }
    public void act()
    {
        setImage(gif.getCurrentImage());
    }    
}
