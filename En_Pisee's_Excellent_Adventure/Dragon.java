import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Dragon class represents a world in the game where the player reaches the
 * Dragon's lair. The player is presented with options through buttons and the 
 * game prints corresponding messages to the console based on the selected option.
 * The class also contains methods to create and add objects to the world, such 
 * as EnPisee, PlayerWeapon, and ItemsImages.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dragon extends Screen
{
    // Declare private instance variables
    private EnPisee testEnPisee;
    private PlayerWeapon testPlayerWeapon;
    private ItemsImages testItem;
    private Buttons op1Button;
    private Buttons op2Button;
    private Buttons op3Button;
    private Buttons op4Button;
    
    // Dragon class constructor
    public Dragon()
    {
        // Call the superclass constructor with parameters (800, 600, 1)
        super(800, 600, 1);
        
        // Print the introduction and choices for the Dragon's lair to the console        
        showText("Finally, you reach the Dragon's lair. The hulking beast lays resting atop its", 400, 20);
        showText("hoard. How do you approach?", 400, 40);
        showText("1) Insult the dragon", 200, 130);
        showText("2) Challenge", 600, 130);
        showText("3) Sneak up to dragon", 200, 160);
        
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
            showText("OPTION 1 SELECTED: 'WAKE UP YOU SCALEY GIT!' You yell. The Dragon opens one", 400, 40);
            showText("eye, looks at you, and with a yawn opens its maw and blasts you with", 400, 60);
            showText("its lightening breath. Killing you instantly.", 400, 80);
            Greenfoot.playSound("boop.mp3");
            // Transition to the 'Gameover' world by setting the world to a new instance of 'Gameover'
            Greenfoot.setWorld(new Gameover());
        }
        
        if (Greenfoot.mouseClicked(op2Button)) {
            showText("OPTION 2 SELECTED: 'I challenge thee, vile beast!' You bellow.", 400, 40);
            Greenfoot.playSound("boop.mp3");
            // Transition to the 'Challenge1' world by setting the world to a new instance of 'Challenge1'
            Greenfoot.setWorld(new Challenge1());
        }
        
        if (Greenfoot.mouseClicked(op3Button)) {            
            showText("OPTION 3 SELECTED: You duck down low and cautiously make your way behind the", 400, 40);
            showText("dragon.", 400, 60);
            Greenfoot.playSound("boop.mp3");
            // Transition to the 'Sneak1' world by setting the world to a new instance of 'Sneak1'
            Greenfoot.setWorld(new Sneak1());
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
