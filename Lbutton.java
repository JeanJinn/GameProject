import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List; 
/**
 * Write a description of class Lbutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lbutton extends Actor
{
    int diff;
    boolean mouseOver = false;
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
        mouseOver();
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("buttonclick.mp3");
            Greenfoot.setWorld(new Game(diff));
        }    
    }

    public void mouseOver(){
       if (!mouseOver && Greenfoot.mouseMoved(this))  
        {  
            if(this.getDiff()==0)
                setImage("easy.jpg");  
            if(this.getDiff()==1)
                setImage("normal.jpg");
            if(this.getDiff()==2)
                setImage("hard.jpg");
            mouseOver = true;  
         }  
         if (mouseOver && Greenfoot.mouseMoved(null) && ! Greenfoot.mouseMoved(this))  
         {  
             setImage("diff-"+diff+".JPG");
             mouseOver = false;  
         } 

    } 

    public int getDiff(){
        return diff;
    }
}   

