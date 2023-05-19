import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Sneak3 class represents the first sneak challenge in the game. It extends 
 * the Screen class and provides the introduction and choices for the challenge. 
 * The class creates buttons for the choices and handles mouse click events to 
 * perform actions based on the selected option. It also has a method to create 
 * and add an EnPisee object to the world.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sneak3 extends Screen
{
    // Declare private instance variables
    private EnPisee testEnPisee;
    private Buttons op1Button;
    private Buttons op2Button;
    private Buttons op3Button;
    private PlayerWeapon testPlayerWeapon;
    
    // Sneak3 class constructor
    public Sneak3()
    {
        // Call the superclass constructor with parameters (800, 600, 1)
        super(800, 600, 1);
        
        // Print the introduction and choices for the sneak challenge to the console        
        showText("You manage to reach the soft belly of the best. The Dragon, still sleeping ", 400, 20);
        showText("and unaware of your presence. Prey to your next decision", 400, 40);
        showText("1) Gut", 200, 130);
        showText("2) Tickle", 600, 130);
        showText("3) Stab", 200, 160);
        
        // Call the 'createButtons()' method to create buttons for the choices
        createButtons();
    }
    
    // Method to create buttons for the choices
    public void createButtons() {
        // Create instances of the 'Buttons' class with specific images and add them to the world at specific coordinates
        op1Button = new Buttons("Option1.png");
        addObject(op1Button, 100, 475);
        
        op2Button = new Buttons("Option2.png");
        addObject(op2Button, 100, 540);
        
        op3Button = new Buttons("Option3.png");
        addObject(op3Button, 275, 475);
    }
    
    // Method that is called continuously by Greenfoot for the actor to perform actions
    public void act() {
        // Check if the mouse click occurred on each button and perform corresponding actions based on the selected option
        
        if (Greenfoot.mouseClicked(op1Button)) {
            showText("OPTION 1 SELECTED", 400, 40);
            
            // Transition to the 'Gameover' world by setting the world to a new instance of 'Gameover'
            Greenfoot.setWorld(new EvilEnding());
        }
        
        if (Greenfoot.mouseClicked(op2Button)) {
            showText("OPTION 2 SELECTED: You begin tickling the beast. It erupts in roars of laughter!", 400, 40);
            showText("In it's uncontrollable laughter, it rolls over and crushes you", 400, 60);
            // Transition to the next sneak challenge (Sneak3) by creating a new instance of 'Sneak2' world
            Greenfoot.setWorld(new Gameover());
        }
        
        if (Greenfoot.mouseClicked(op3Button)) {          
            showText("OPTION 3 SELECTED: You stab your dagger into the beast. It's head snaps up", 400, 40);
            showText("and whirls around to face you. 'Ow!' It says, sounding heavily insulted. It", 400, 60);
            showText("blasts you with its lightening breath. Frying you to a crisp.", 400, 80);
            // Transition to the 'Gameover' world by setting the world to a new instance of 'Gameover'
            Greenfoot.setWorld(new Gameover());
        }
    }
    
    // Method to create the 'EnPisee' object
    public void createEnPisee() {
        // Create an instance of the 'EnPisee' class named 'testEnPisee' with the image "NPCvhappy.png"
        testEnPisee = new EnPisee("NPCvhappy.png");
        
        // Add the 'testEnPisee' object to the world at coordinates (200, 200)
        addObject(testEnPisee, 200, 200);
    }
    
    public void createPlayerWeapon() {
        // Create an instance of the 'PlayerWeapon' class named 'testPlayerWeapon' with the image "Shield.png"
        testPlayerWeapon = new PlayerWeapon("Shield.png");
        
        // Add the 'testPlayerWeapon' object to the world at coordinates (500, 500)
        addObject(testPlayerWeapon, 500, 500);
    }
}

