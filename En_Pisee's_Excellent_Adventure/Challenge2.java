import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Challenge2 class represents the second challenge in the game, where the 
 * player faces the Dragon's tail attack. The class extends the Screen class 
 * and provides the introduction and choices for the challenge. It also creates
 * buttons for the choices and handles mouse click events to perform actions 
 * based on the selected option. Similar to the previous classes, it has methods
 * to create and add objects to the world, such as EnPisee, PlayerWeapon, and ItemsImages.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Challenge2 extends Screen
{
    // Declare private instance variables
    private EnPisee testEnPisee;
    private PlayerWeapon testPlayerWeapon;
    private ItemsImages testItem;
    private Buttons op1Button;
    private Buttons op2Button;
    private Buttons op3Button;
    
    // Challenge2 class constructor
    public Challenge2()
    {
        // Call the superclass constructor with parameters (800, 600, 1)
        super(800, 600, 1);
        
        // Print the introduction and choices for the challenge to the console
        System.out.println("The Dragon growls. How dare this intruder insult them by not dying faster. They whirl around,");
        System.out.println("their tail heading straight for you.");
        
        System.out.println("1) Strike");
        System.out.println("2) Dodge");
        System.out.println("3) Leap");
        
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
            System.out.println("OPTION 1 SELECTED");
            System.out.println("You swing your mighty weapon, carving through the tail, causing the Dragon to");
            System.out.println("cry out in agony.");
            
            // Transition to the 'Challenge2' world by setting the world to a new instance of 'Challenge2'
            Greenfoot.setWorld(new Challenge2());
        }
        
        if (Greenfoot.mouseClicked(op2Button)) {
            System.out.println("OPTION 2 SELECTED");
            System.out.println("You drop and slide under the tail, narrowly avoiding the tail as you feel the air");
            System.out.println("rush over you from the tail swipe.");
            
            // Transition to the 'Challenge2' world by setting the world to a new instance of 'Challenge2'
            Greenfoot.setWorld(new Challenge2());
        }
        
        if (Greenfoot.mouseClicked(op3Button)) {
            System.out.println("OPTION 3 SELECTED");
            System.out.println("You leap into the air and get smacked by the tail. You fly into the air and just");
            System.out.println("before you splat into the cave wall, you swear you hear the Dragon say 'HOME RUN!'.");
            System.out.println("You then coat the wall in a new color called 'hint of internal organs'.");
            
            // Transition to the 'Gameover' world by setting the world to a new instance of 'Gameover'
            Greenfoot.setWorld(new Gameover());
        }
    }
    
    // Method to create the 'EnPisee' object
    public void createEnPisee() {
        // Create an instance of the 'EnPisee' class named 'testEnPisee' with the image "NPC....png"
        testEnPisee = new EnPisee("NPC....png");
        
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
