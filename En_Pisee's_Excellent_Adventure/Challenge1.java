import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Challenge1 class represents a world in the game where the player faces 
 * the Dragon's challenge. Similar to the Dragon class, the player is presented 
 * with options through buttons, and the game prints corresponding messages to 
 * the console based on the selected option. The class also contains methods to 
 * create and add objects to the world, such as EnPisee, PlayerWeapon, and ItemsImages.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Challenge1 extends Screen
{
    // Declare private instance variables
    private EnPisee testEnPisee;
    private PlayerWeapon testPlayerWeapon;
    private ItemsImages testItem;
    private Buttons op1Button;
    private Buttons op2Button;
    private Buttons op3Button;
    private Buttons op4Button;
    
    // Challenge1 class constructor
    public Challenge1()
    {
        // Call the superclass constructor with parameters (800, 600, 1)
        super(800, 600, 1);
        
        // Print the introduction and choices for the challenge to the console        
        showText("The Dragon stands atop its hoard, staring you down. Its chest inflates and", 400, 20);
        showText("its eyes glow an electric blue as it readies its lightning breath", 400, 40);
        showText("1) Dodge", 200, 130);
        showText("2) Charge", 600, 130);
        showText("3) Dance off", 200, 160);
        showText("4) Just a joke bro!", 600, 160);
        
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
        
        op4Button = new Buttons("Option4.png");
        addObject(op4Button, 275, 560);
    }
    
    // Method that is called continuously by Greenfoot for the actor to perform actions
    public void act() {
        // Check if the mouse click occurred on each button and perform corresponding actions based on the selected option
        
        if (Greenfoot.mouseClicked(op1Button)) {
            showText("OPTION 1 SELECTED: You run toward the dragon, diving to the left and narrowly", 400, 40);
            showText("missing the Dragon's lightning breath as it sizzles past you.", 400, 60);
            Greenfoot.playSound("boop.mp3");
            // Transition to the 'Challenge2' world by setting the world to a new instance of 'Challenge2'
            Greenfoot.setWorld(new Challenge2());
        }
        
        if (Greenfoot.mouseClicked(op2Button)) {
            showText("OPTION 2 SELECTED: You charge the Dragon, bellowing a battle cry. The Dragon", 400, 40);
            showText("rears back and electrocutes you with its lightning breath, turning you to ash", 400, 80);
            showText("before you even get close.", 400, 100);
            Greenfoot.playSound("boop.mp3");
            // Transition to the 'Gameover' world by setting the world to a new instance of 'Gameover'
            Greenfoot.setWorld(new Gameover());
        }
        
        if (Greenfoot.mouseClicked(op3Button)) {            
            showText("OPTION 3 SELECTED: You start dancing. Your moves, incredible. Timing, immaculate.", 400, 40);
            showText("It's almost as if dancing was your true calling. The dragon crushes you with its", 400, 80);
            showText("colossal tail mid. dance. It's a dragon fight! Not a dance contest.", 400, 100);
            Greenfoot.playSound("boop.mp3");
            // Transition to the 'Gameover' world by setting the world to a new instance of 'Gameover'
            Greenfoot.setWorld(new Gameover());
        }
        
        if (Greenfoot.mouseClicked(op4Button)) {
            showText("OPTION 4 SELECTED: With a look of disappointment, the dragon sighs and slaps you", 400, 40);
            showText("with its mighty claw. Sending you flying into the cave wall and killing you on", 400, 80);
            showText("impact.", 400, 100);
            Greenfoot.playSound("boop.mp3");
            // Transition to the 'Gameover' world by setting the world to a new instance of 'Gameover'
            Greenfoot.setWorld(new Gameover());
        }
    }
    
    // Method to create the 'EnPisee' object
    public void createEnPisee() {
        // Create an instance of the 'EnPisee' class named 'testEnPisee' with the image "NPCscared.png"
        testEnPisee = new EnPisee("NPCscared.png");
        
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
