import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class help here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class help extends Actor
{
    /**
     * Act - do whatever the help wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean mouseOver = false;
    public void act() 
    {
      
       if (!mouseOver && Greenfoot.mouseMoved(this))  
        {  
            setImage("help2.jpg");  
            mouseOver = true;  
         }  
         if (mouseOver && Greenfoot.mouseMoved(null) && ! Greenfoot.mouseMoved(this))  
         {  
             setImage("howto1.JPG");  
             mouseOver = false;  
         } 
         
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("buttonclick.mp3");
            getWorld().addObject(new howto(), 700, 438);
            getWorld().addObject(new CloseButton(), 1345, 52);
        }
    }    
}
