
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Game here.
 * 
 * @author Jirapat N. 
 * @version (a version number or a date)
 */
public class Game extends World
{
    private SimpleTimer timer = new SimpleTimer();
    private static List<String> allowedKeys = new ArrayList<>();
    private Input input = new Input();
    private ScoreDisplay scoreDisplay = new ScoreDisplay();
    private boolean check = false;
    Queue<Heart> list = new LinkedList<>();
    
    static {
        for(char c = 'a'; c <= 'z'; c++)
            allowedKeys.add(c + "");
    }
    
    int diff;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Game() {
        this(0);
    }
    
    public Game(int diff)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1400, 876, 1);
        this.diff = diff;
        addObject(new Junimo(), 700, 750);
        addObject(new Restart(), 220, 70);
        addObject(new Bbutton(), 80, 70);
        addObject(input, 700, 50);
        addObject(scoreDisplay, 940, 800);
        int x = 1170;
        int y = 40;
        int offset = 90;
        for(int i = 0; i<3 ; ++i){
            Heart h = new Heart();
            list.add(h);
            addObject(h, x + offset*i, y);
        }
    }
    
    public void removerHeart(){
        if(list.peek() == null){
            gameover();
        }else{
            Greenfoot.playSound("downlife.wav");
            removeObject(list.poll());
        }
    }
    public void act() {
        if(check) return;
        if(timer.millisElapsed() >= (4000 - (1000 * diff))) {
            addObject(new Word(), 200 + Greenfoot.getRandomNumber(1000), 0);
            timer.mark();
        }
        String key = Greenfoot.getKey();
        if(key != null && !key.isEmpty()) {
            if(allowedKeys.contains(key)) {
                input.setWord(input.getWord() + key);
            } else if(key.equals("backspace") && !input.getWord().isEmpty()) {
                input.setWord(input.getWord().substring(0, input.getWord().length()-1));
            } else if(key.equals("enter")){
                List<Word> words = this.getObjects(Word.class);
                words.forEach((e) -> {
                    if(e.getData().equals(input.getWord())) {
                        this.removeObject(e);
                        scoreDisplay.add(input.getWord().length() * (diff+1));
                    }
                });
                input.setWord("");
            }
        }
    }
    
    public int getDiff() {
        return diff;
    }
    
    public void gameover(){
        Greenfoot.delay(10);
        addObject(new ScoreBoard(scoreDisplay.getValue()), 700, 438);
        check = true;
    }
    public void stopped(){
        Menu.bgm.pause();
    }
    
}
