import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class playerName here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class playerName extends Actor
{
    /**
     * Act - do whatever the playerName wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage(Menu.playerName, 30, greenfoot.Color.WHITE, new greenfoot.Color(0,0,0,0)));
    }    
}
