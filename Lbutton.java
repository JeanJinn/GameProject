import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lbutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lbutton extends Actor
{
    int diff;
    public Lbutton(int diff){
        this.diff = diff;
        setImage("diff-"+diff+".JPG");
    }
    /**
     * Act - do whatever the Lbutton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
            Greenfoot.setWorld(new Game(diff));
    }    
}
