import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

import java.util.Calendar;

/**
 * The ScoreBoard is used to display results on the screen. It can display some
 * text and several numbers.
 * 
 * @author M Kolling
 * @version 1.0
 */
public class ScoreBoard extends Actor
{
    public static final float FONT_SIZE = 100.0f;
    public static final int WIDTH = 910;
    public static final int HEIGHT = 560;
    
    /**
     * Create a score board with dummy result for testing.
     */
    public ScoreBoard()
    {
        this(0,0);
    }

    /**
     * Create a score board for the final result.
     */
    public ScoreBoard(int score,int maxScore)
    {
        makeImage("Game Over", Menu.playerName+" Score : ", score,maxScore);
    }

    /**
     * Make the score board image.
     */
    private void makeImage(String title, String prefix, int score,int maxScore)
    {
        GreenfootImage image = new GreenfootImage(WIDTH, HEIGHT);

        image.setColor(Color.BLACK);
        image.fillRect(0, 0, WIDTH, HEIGHT);
        Font font = image.getFont();
        image.setColor(Color.WHITE);
        image.setFont(new Font("Sabo Filled", 50));
        
        image.drawString(title, 330, 150);
        image.drawString(prefix + score, 270, 300);
        image.drawString("Max score : " +  maxScore, 270, 450);
        setImage(image);
    }
}
