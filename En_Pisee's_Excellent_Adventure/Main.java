import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main extends Screen
{
    private EnPisee testEnPisee;
    private Buttons op1Button; //rough code for now
    private Buttons op2Button;
    private Buttons op3Button; 
    private Buttons op4Button;
    /**
     * Constructor for objects of class Main.
     * 
     */
    public Main()
    {
        super(800, 600, 1);
    }
    
    public void createButtons(Screen Intro) {
        op1Button = new Buttons("Option1.png", Intro);
        addObject(op1Button, 100, 475);
        
        op2Button = new Buttons("Option2.png", Intro);
        addObject(op2Button, 100, 540);
        
        op3Button = new Buttons("Option3.png", Intro);
        addObject(op3Button, 275, 475);
        
        op4Button = new Buttons("Option4.png", Intro);
        addObject(op4Button, 275, 540);
    }
    
    public void createEnPisee() {
        testEnPisee = new EnPisee("NPC.png");
        addObject(testEnPisee, 400, 300);
    }
}
