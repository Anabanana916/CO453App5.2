import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sneak1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sneak1 extends Screen
{

    private EnPisee testEnPisee;
    private Buttons op1Button; //rough code for now
    private Buttons op2Button;
    private Buttons op3Button; 
    private Buttons op4Button;
    
    public Sneak1()
    {
            super(800, 600, 1);
    }
    
    public void createButtons(Screen main) {
        op1Button = new Buttons("Option1.png", main);
        addObject(op1Button, 100, 475);
        
        op2Button = new Buttons("Option2.png", main);
        addObject(op2Button, 100, 540);
        
        op3Button = new Buttons("Option3.png", main);
        addObject(op3Button, 275, 475);
        
        op4Button = new Buttons("Option4.png", main);
        addObject(op4Button, 275, 540);
    }
    
    public void createEnPisee() {
        testEnPisee = new EnPisee("NPCvhappy.png");
        addObject(testEnPisee, 200, 200);
    }
}
