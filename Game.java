import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game here.
 * 
 * @author Jirapat N. 
 * @version (a version number or a date)
 */
public class Game extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Game()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1400, 876, 1);
        addObject(new Junimo(), 700, 750);
    }
}
