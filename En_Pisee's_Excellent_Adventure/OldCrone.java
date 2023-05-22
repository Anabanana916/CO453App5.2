import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OldCrone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OldCrone extends Screen
{

    private EnPisee testEnPisee;
    private PlayerWeapon testPlayerWeapon;
    private Buttons op1Button; //rough code for now
    private Buttons op2Button;
    private Buttons op3Button; 
    private Buttons op4Button;
    public OldCrone()
    {
        // Constructor for the 'OldCrone' class
        // Call the superclass constructor with parameters (800, 600, 1)
        super(800, 600, 1);
        
        // Print the introduction and choices for interacting with the old crone to the console
        showText("You venture toward the Dragon's cave. An old crone approaches you, offering you", 400, 20);
        showText("aid. Do you accept?", 400, 40);
        showText("1) Accept", 200, 130);
        showText("2) Ignore", 600, 130);
        showText("3) Berate", 200, 160);
        
        
        createEnPisee();
        
        // Call the 'createButtons()' method to create buttons for the choices
        createButtons();
        createPlayerWeapon();
    }
    
    public void createButtons() {
        // Method to create buttons for the choices
        
        // Create an instance of the 'Buttons' class named 'op1Button' with the image "Option1.png"
        op1Button = new Buttons("Option1.png");
        
        // Add the 'op1Button' object to the world at coordinates (100, 475)
        addObject(op1Button, 100, 490);
        
        // Create an instance of the 'Buttons' class named 'op2Button' with the image "Option2.png"
        op2Button = new Buttons("Option2.png");
        
        // Add the 'op2Button' object to the world at coordinates (100, 540)
        addObject(op2Button, 100, 560);
        
        // Create an instance of the 'Buttons' class named 'op3Button' with the image "Option3.png"
        op3Button = new Buttons("Option3.png");
        
        // Add the 'op3Button' object to the world at coordinates (275, 475)
        addObject(op3Button, 275, 490);
    }
    
    public void act() {
        // Method that is called continuously by Greenfoot for the actor to perform actions
        
        // Check if the mouse click occurred on the 'op1Button' object
        if (Greenfoot.mouseClicked(op1Button)) {
            // Print "OPTION 1 SELECTED" to the console
            showText("OPTION 1 SELECTED: She hands you a potion. It glows with a mysterious power.", 100, 400);
            Greenfoot.playSound("boop.mp3");
            // Transition to the 'River' world by setting the world to a new instance of 'River'
            Greenfoot.setWorld(new River());
        }
        
        // Check if the mouse click occurred on the 'op2Button' object
        if (Greenfoot.mouseClicked(op2Button)) {
            // Print "OPTION 2 SELECTED" to the console
            showText("OPTION 2 SELECTED: You ignore the crone. She smelt funny anyway.", 100, 400);
            Greenfoot.playSound("boop.mp3");
            // Transition to the 'River' world by setting the world to a new instance of 'River'
            Greenfoot.setWorld(new River());
        }
        
        // Check if the mouse click occurred on the 'op3Button' object
        if (Greenfoot.mouseClicked(op3Button)) {
            // Print "OPTION 3 SELECTED" to the console
            showText("OPTION 3 SELECTED: 'Be gone from my sight, you foul smelling wench!' You sneer. The crone", 400, 20);
            showText("smiles. Her yellow teeth showing the many years of dental neglect as a", 400, 40);
            showText("strange, green smoke surrounds the pair of you. You feel strange. Prickly", 400, 60);
            showText("even. You can't see, but you have been turned into a cactus.", 400, 80);
            Greenfoot.playSound("boop.mp3");
            // Transition to the 'Gameover' world by setting the world to a new instance of 'Gameover'
            Greenfoot.setWorld(new Gameover());
        }
    }
        
    
    public void createEnPisee() {
        // Method to create the 'EnPisee' object
        
        // Create an instance of the 'EnPisee' class named 'testEnPisee' with the image "NPC.png"
        testEnPisee = new EnPisee("NPC.png");
        
        // Add the 'testEnPisee' object to the world at coordinates (400, 300)
        addObject(testEnPisee, 400, 320);
    }
    
    public void createPlayerWeapon() {
        // Method to create the 'PlayerWeapon' object
        
        // Create an instance of the 'PlayerWeapon' class named 'testPlayerWeapon' with the image "Shield.png"
        testPlayerWeapon = new PlayerWeapon("Shield.png");
        
        // Add the 'testPlayerWeapon' object to the world at coordinates (500, 500)
        addObject(testPlayerWeapon, 500, 520);
    }

}
