import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main extends Screen
{
    private Buttons testButton; //rough code for now
    /**
     * Constructor for objects of class Main.
     * 
     */
    public Main()
    {
        super(800, 600, 1);
    }
    
    public void createButtons(Screen test) {
        testButton = new Buttons("Option1.png", test);
        addObject(testButton, 100, 100);
    }
}
