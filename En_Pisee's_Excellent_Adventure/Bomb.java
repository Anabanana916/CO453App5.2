import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Bomb class represents a world in the game where the player encounters a lit bomb. 
 * The player is presented with options through buttons to decide how to handle the bomb. 
 * When a button is clicked, the game prints a corresponding message to the console and 
 * transitions to another world based on the choice made. The class also contains methods
 * to create and add objects to the world, such as EnPisee, PlayerWeapon, and ItemsImages.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Screen
{
    // Declare private instance variables
    private EnPisee testEnPisee;
    private PlayerWeapon testPlayerWeapon;
    private ItemsImages testItem;
    private Buttons op1Button;
    private Buttons op2Button;
    private Buttons op3Button;
    private Buttons op4Button;
    
    // Bomb class constructor
    public Bomb()
    {
        // Call the superclass constructor with parameters (800, 600, 1)
        super(800, 600, 1);
        
        // Print the introduction and choices for dealing with a lit bomb to the console        
        showText("You venture on. Eventually, coming across an ornate chest! You open the chest", 400, 20);
        showText("and reach inside an- OH MY GOD!!! IT'S A LIT BOMB!! Quick! Throw it away!!", 400, 40);
        showText("1) Throw bomb", 200, 130);
        showText("2) Hold on to bomb", 600, 130);
        
        createEnPisee();
        
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
        
    }
    
    // Method that is called continuously by Greenfoot for the actor to perform actions
    public void act() {
        // Check if the mouse click occurred on each button and perform corresponding actions based on the selected option
        
        if (Greenfoot.mouseClicked(op1Button)) {
            showText("OPTION 1 SELECTED: You hurl the bomb away and it explodes harmlessly.", 400, 40);
            
            // Transition to the 'Gameover' world by setting the world to a new instance of 'Gameover'
            Greenfoot.setWorld(new Climb());
        }
        
        if (Greenfoot.mouseClicked(op2Button)) {
            showText("OPTION 2 SELECTED: What? Why would yo-", 400, 40);
            showText("The bomb explodes in your hands. Sending pieces of you flying everywhere.", 400, 40);
            
            // Transition to the 'Gameover' world by setting the world to a new instance of 'Gameover'
            Greenfoot.setWorld(new Gameover());
        }
        
    }
    
    // Method to create the 'EnPisee' object
    public void createEnPisee() {
        // Create an instance of the 'EnPisee' class named 'testEnPisee' with the image "NPCworry.png"
        testEnPisee = new EnPisee("NPCworry.png");
        
        // Add the 'testEnPisee' object to the world at coordinates (400, 300)
        addObject(testEnPisee, 400, 300);
    }
    
    // Method to create the 'PlayerWeapon' object
    public void createPlayerWeapon() {
        // Create an instance of the 'PlayerWeapon' class named 'testPlayerWeapon' with the image "Shield.png"
        testPlayerWeapon = new PlayerWeapon("Shield.png");
        
        // Add the 'testPlayerWeapon' object to the world at coordinates (500, 500)
        addObject(testPlayerWeapon, 500, 500);
    }
    
    // Method to create the 'ItemsImages' object
    public void createItems() {
        // Create an instance of the 'ItemsImages' class named 'testItem' with the image "Potion.png"
        testItem = new ItemsImages("Potion.png");
        
        // Add the 'testItem' object to the world at coordinates (700, 500)
        addObject(testItem, 700, 500);
    }
}
