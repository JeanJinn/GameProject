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
    int frameTimer = 90;
    public end()
    {    
        super(1400, 876, 1);
    }
    public void act(){
        animation();
    }
    public void stopped(){
        
        Menu.bgm.pause();
    }
    
     public void animation(){
        if(frameTimer>0){
            frameTimer--;
        }
       
        if(frameTimer==60){
             setBackground("junimobg1.png");
        }
        if(frameTimer==30){
            setBackground("junimobg2.png");
        }
          if(frameTimer==0){
            frameTimer=90;
        }
       
       
    }
}
