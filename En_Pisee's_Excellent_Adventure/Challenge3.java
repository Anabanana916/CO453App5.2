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
        System.out.println("'ENOUGH!!' The Dragon bellows! 'I will not have you insult my presence any longer!!'");
        System.out.println("It charges you, looking to swallow you whole!");
        System.out.println("1) Leap into the maw of the beast");
        System.out.println("2) Dodge");
        System.out.println("3) Charge");
        
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
            System.out.println("You leap into the maw of the Dragon. He swallows you whole and you feel yourself slide");
            System.out.println("down the gullet of the beast. You don't have much time. You use all of your remaining");
            System.out.println("strength to slice and cut the innards of the Dragon. You hear their muffled screams of");
            System.out.println("pain, their cries of pain slowly being turned into gargled screams as blood fills their");
            System.out.println("throat. You fear that you may not survive the insides of the dragon, even though you");
            System.out.println("slew the beast. However, the potion you drank gave you the resilience to not only ");
            System.out.println("survive but cut your way out. You saved the village and lived to tell the tale. Thanks");
            System.out.println("to you, the village thrives. Your story is shared across the land, a statue erected in");
            System.out.println("the village square, and you are heralded as a hero.");
            
            // Transition to the 'Challenge2' world by setting the world to a new instance of 'Challenge2'
            Greenfoot.setWorld(new Challenge2());
        }
        
        if (Greenfoot.mouseClicked(op2Button)) {
            System.out.println("OPTION 2 SELECTED");
            System.out.println("You attempt to dodge again, but you only move yourself directly into the dragon's");
            System.out.println("teeth as its jaw clamps down, carving your body in two.");
            
            // Transition to the 'Gameover' world by setting the world to a new instance of 'Gameover'
            Greenfoot.setWorld(new Gameover());
        }
        
        if (Greenfoot.mouseClicked(op3Button)) {
            System.out.println("OPTION 3 SELECTED");
            System.out.println("You charge the beast, running straight into its teeth. Resulting in you becoming");
            System.out.println("a hard-earned snack.");
            
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

