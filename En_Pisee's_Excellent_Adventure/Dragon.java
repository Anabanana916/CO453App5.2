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
        System.out.println("Finally, you reach the Dragon's lair. The hulking beast lays resting atop its hoard.");
        System.out.println("How do you approach?");
        System.out.println("1) Insult the dragon");
        System.out.println("2) Challenge");
        System.out.println("3) Drink potion");
        System.out.println("4) Sneak up to dragon");
        
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
        
        op4Button = new Buttons("Option4.png");
        addObject(op4Button, 275, 540);
    }
    
    // Method that is called continuously by Greenfoot for the actor to perform actions
    public void act() {
        // Check if the mouse click occurred on each button and perform corresponding actions based on the selected option
        
        if (Greenfoot.mouseClicked(op1Button)) {
            System.out.println("OPTION 1 SELECTED");
            System.out.println("'WAKE UP YOU SCALEY GIT!' You yell. The Dragon opens one eye, looks at you,");
            System.out.println("and with a yawn opens its maw and blasts you with its fiery breath. Killing");
            System.out.println("you instantly.");
            
            // Transition to the 'Gameover' world by setting the world to a new instance of 'Gameover'
            Greenfoot.setWorld(new Gameover());
        }
        
        if (Greenfoot.mouseClicked(op2Button)) {
            System.out.println("OPTION 2 SELECTED");
            System.out.println("'I challenge thee, vile beast!' You bellow.");
            
            // Transition to the 'Challenge1' world by setting the world to a new instance of 'Challenge1'
            Greenfoot.setWorld(new Challenge1());
        }
        
        if (Greenfoot.mouseClicked(op3Button)) {
            System.out.println("OPTION 3 SELECTED");
            System.out.println("You chug the entirety of your potion, throw the glass down on the ground");
            System.out.println("and yell 'Awaken, vile beast! You shall not torment the good people of that");
            System.out.println("village any longer!'");
            
            // Transition to the 'Gameover' world by setting the world to a new instance of 'Gameover'
            Greenfoot.setWorld(new Gameover());
        }
        
        if (Greenfoot.mouseClicked(op4Button)) {
            System.out.println("OPTION 4 SELECTED");
            System.out.println("You duck down low and cautiously make your way behind the dragon. However,");
            System.out.println("you trip on an unseen rock and collapse onto the treasure. You hope the noise");
            System.out.println("did not wake the beast. You look up to see it staring down at you. 'Nice try.'");
            System.out.println("It scoffs before biting and swallowing you whole.");
            
            // Transition to the 'Sneak1' world by setting the world to a new instance of 'Sneak1'
            Greenfoot.setWorld(new Sneak1());
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
