import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Challenge3 class represents the third challenge in the game, where the 
 * player faces the Dragon's final charge. The class extends the Screen class 
 * and provides the introduction and choices for the challenge. It creates 
 * buttons for the choices and handles mouse click events to perform actions 
 * based on the selected option. Similar to the previous classes, it has 
 * methods to create and add objects to the world, such as EnPisee, 
 * PlayerWeapon, and ItemsImages.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Challenge3 extends Screen
{
    // Declare private instance variables
    private EnPisee testEnPisee;
    private PlayerWeapon testPlayerWeapon;
    private ItemsImages testItem;
    private Buttons op1Button;
    private Buttons op2Button;
    private Buttons op3Button;
    private Buttons op4Button;
    
    // Challenge3 class constructor
    public Challenge3()
    {
        // Call the superclass constructor with parameters (800, 600, 1)
        super(800, 600, 1);
        
        // Print the introduction and choices for the challenge to the console        
        showText("'ENOUGH!!' The Dragon bellows! 'I will not have you insult my", 400, 20);
        showText("presence any longer!!' It charges you, looking to swallow you", 400, 40);
        showText(" whole!", 400, 60);
        showText("1) Leap", 200, 130);
        showText("2) Dodge", 600, 130);
        showText("3) Charge", 200, 160);     
        
        createEnPisee();
        
        // Call the 'createButtons()' method to create buttons for the choices
        createButtons();
        createItems();
        createPlayerWeapon();
    }
    
    // Method to create buttons for the choices
    public void createButtons() {
        // Create instances of the 'Buttons' class with specific images and add them to the world at specific coordinates
        op1Button = new Buttons("Option1.png");
        addObject(op1Button, 100, 490);
        
        op2Button = new Buttons("Option2.png");
        addObject(op2Button, 100, 560);
        
        op3Button = new Buttons("Option3.png");
        addObject(op3Button, 275, 490);
        
    }
    
    // Method that is called continuously by Greenfoot for the actor to perform actions
    public void act() {
        // Check if the mouse click occurred on each button and perform corresponding actions based on the selected option
        
        if (Greenfoot.mouseClicked(op1Button)) {
            showText("OPTION 1 SELECTED", 400, 40);
            Greenfoot.playSound("boop.mp3");
            // Transition to the 'Challenge2' world by setting the world to a new instance of 'Challenge2'
            Greenfoot.setWorld(new NeutralEnd());
        }
        
        if (Greenfoot.mouseClicked(op2Button)) {
            showText("OPTION 2 SELECTED: You attempt to dodge again, but you only move yourself", 400, 40);
            showText("directly into the dragon's teeth as its jaw clamps down, carving your body", 400, 80);
            showText("in two.", 400, 100);
            Greenfoot.playSound("boop.mp3");
            // Transition to the 'Gameover' world by setting the world to a new instance of 'Gameover'
            Greenfoot.setWorld(new Gameover());
        }
        
        if (Greenfoot.mouseClicked(op3Button)) {
            showText("OPTION 3 SELECTED: You charge the beast, running straight into its teeth.", 400, 40);
            showText("Resulting in you becoming a hard-earned snack.", 400, 80);
            showText("in two.", 400, 100);
            Greenfoot.playSound("boop.mp3");
            // Transition to the 'Gameover' world by setting the world to a new instance of 'Gameover'
            Greenfoot.setWorld(new Gameover());
        }
    }
    
    // Method to create the 'EnPisee' object
    public void createEnPisee() {
        // Create an instance of the 'EnPisee' class named 'testEnPisee' with the image "NPCworry.png"
        testEnPisee = new EnPisee("NPCworry.png");
        
        // Add the 'testEnPisee' object to the world at coordinates (400, 300)
        addObject(testEnPisee, 400, 320);
    }
    
    // Method to create the 'PlayerWeapon' object
    public void createPlayerWeapon() {
        // Create an instance of the 'PlayerWeapon' class named 'testPlayerWeapon' with the image "Shield.png"
        testPlayerWeapon = new PlayerWeapon("Shield.png");
        
        // Add the 'testPlayerWeapon' object to the world at coordinates (500, 500)
        addObject(testPlayerWeapon, 500, 520);
    }
    
    // Method to create the 'ItemsImages' object
    public void createItems() {
        // Create an instance of the 'ItemsImages' class named 'testItem' with the image "Potion.png"
        testItem = new ItemsImages("Potion.png");
        
        // Add the 'testItem' object to the world at coordinates (700, 500)
        addObject(testItem, 700, 520);
    }
}

