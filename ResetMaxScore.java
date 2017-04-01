import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ResetMaxScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ResetMaxScore extends Actor
{
    /**
     * Act - do whatever the ResetMaxScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("buttonclick.mp3");
            ScoreDisplay.max=0;
            getWorld().removeObject(this);
        }
    }  
    
}
