import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
/**
 * Write a description of class start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class start extends Actor
{
    /**
     * Act - do whatever the start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean mouseOver = false;
    public void act() 
    {
       MouseInfo mouse = Greenfoot.getMouseInfo();  
         
       if (!mouseOver && Greenfoot.mouseMoved(this))  
       {  
           setImage("start2.jpg");  
           mouseOver = true;  
       }  
       if (mouseOver && Greenfoot.mouseMoved(null) && ! Greenfoot.mouseMoved(this))  
       {  
           setImage("startbutton.jpg");  
           mouseOver = false;  
       } 
         
       if(Greenfoot.mouseClicked(this)){
           Greenfoot.playSound("buttonclick.mp3");
           Menu world = (Menu)getWorld();
           world.playerName = JOptionPane.showInputDialog("Player name: ");
           world.removeHelp();
           world.removeReset();
           for(int i=0; i<3 ; i++){
               getWorld().addObject(new Lbutton(i), 700, (i+3)*150);
           }
           getWorld().removeObject(this);
           Greenfoot.delay(20);
       }
    }    
}
