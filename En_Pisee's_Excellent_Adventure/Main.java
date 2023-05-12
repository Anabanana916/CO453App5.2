import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main extends Screen
{
    private Buttons op1Button; //rough code for now

    /**
     * Constructor for objects of class Main.
     * 
     */
    public Main()
    {
        super(800, 600, 1);
    }
    
    public void createButtons(Screen link) {
        op1Button = new Buttons("Option1.png", link);
        addObject(op1Button, 100, 475);
        
    }
    
}
