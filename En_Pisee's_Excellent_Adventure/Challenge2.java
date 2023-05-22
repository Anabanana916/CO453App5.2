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
        showText("The Dragon growls. How dare this intruder insult them by not dying faster.", 400, 20);
        showText("They whirl around, their tail heading straight for you.", 400, 40);
        showText("1) Strike", 200, 130);
        showText("2) Dodge", 600, 130);
        showText("3) Leap", 200, 160);        
        
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
            showText("OPTION 1 SELECTED: You swing your mighty weapon, carving through the tail", 400, 40);
            showText("causing the Dragon to cry out in agony.", 400, 80);
            Greenfoot.playSound("boop.mp3");
            // Transition to the 'Challenge2' world by setting the world to a new instance of 'Challenge2'
            Greenfoot.setWorld(new Challenge3());
        }
        
        if (Greenfoot.mouseClicked(op2Button)) {            
            showText("OPTION 2 SELECTED: You drop and slide under the tail, narrowly avoiding", 400, 40);
            showText("the tail as you feel the air rush over you from the tail swipe.", 400, 80);
            Greenfoot.playSound("boop.mp3");
            // Transition to the 'Challenge2' world by setting the world to a new instance of 'Challenge2'
            Greenfoot.setWorld(new Challenge3());
        }
        
        if (Greenfoot.mouseClicked(op3Button)) {
            showText("OPTION 3 SELECTED: You leap into the air and get smacked by the tail. You", 400, 40);
            showText("fly into the air and just before you splat into the cave wall coating the", 400, 60);
            showText(" wall in a new color called 'hint of internal organs", 400, 80);
            Greenfoot.playSound("boop.mp3");
            // Transition to the 'Gameover' world by setting the world to a new instance of 'Gameover'
            Greenfoot.setWorld(new Gameover());
        }
    }
    
    // Method to create the 'EnPisee' object
    public void createEnPisee() {
        // Create an instance of the 'EnPisee' class named 'testEnPisee' with the image "NPC....png"
        testEnPisee = new EnPisee("NPC....png");
        
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
