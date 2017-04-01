import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class end here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class end extends World
{

    /**
     * Constructor for objects of class end.
     * 
     */
    public end()
    {    
        super(1400, 876, 1);
    }
    public void stopped(){
        Menu.bgm.pause();
    }
}
