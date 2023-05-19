import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gameover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gameover extends Screen
{
    private EnPisee testEnPisee;
    private Buttons op1Button; //rough code for now
    private Buttons op2Button;
    private Buttons op3Button; 
    private Buttons op4Button;
    /**
     * Constructor for objects of class Gameover.
     * 
     */
    public Gameover()
    {
        super(800, 600, 1);
        showText("That's Game Over. Nice try! But you might want to consider your choices carefully.", 400, 40);
        showText("Return to Menu.", 390, 500);
        
        createEnPisee();
    }
    
    public void createButtons(Screen link) {
        op1Button = new Buttons("Option1.png");
        addObject(op1Button, 100, 475);
        
        
    }
    
    public void act() {
        // Method executed continuously during the game
        
        // Check if the mouse click occurred on the 'op1Button' object
        if (Greenfoot.mouseClicked(op1Button)) {
            // Print "OPTION 1 SELECTED" to the console
            showText("OPTION 1 SELECTED", 100, 400);
            
            // Transition to the 'Village' world by setting the world to a new instance of 'Village'
            Greenfoot.setWorld(new Main());
        }

    }
    
    public void createEnPisee() {
        testEnPisee = new EnPisee("NPC.png");
        addObject(testEnPisee, 400, 300);
    }
}
