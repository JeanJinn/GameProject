import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Word here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Word extends Actor
{
    public String data;
    public int speed = 0;
    
    public Word(){
        this(Words.getRandomWord());
    }
    
    public Word(String data){
        this.data = data;
        setImage(ImageConstructor.create(data));
        
    }
    
    @Override
    public void addedToWorld(World world) {
        speed = 5 + 2 * ((Game)world).getDiff();
    }
    
    /**
     * Act - do whatever the Word wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        turnTowards(getX(), 876);
        move(speed);
        setRotation(0);
        checkEdge();
    }    
    
    public void checkEdge() {
        if(getY() >= 700) {
            getWorld().removeObject(this);
            //getWorld().gameover();
        }
    }
    
    public String getData() {
        return data;
    }
}
