import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Climb class represents a world in the game where the player encounters 
 * a dangerous cliffside while approaching a cave. The player is presented with 
 * options through buttons to decide how to proceed. When a button is clicked, 
 * the game prints a corresponding message to the console and transitions to 
 * another world based on the choice made. The class also contains methods to 
 * create and add objects to the world, such as EnPisee, PlayerWeapon, and 
 * ItemsImages.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Climb extends Screen
{
    // Declare private instance variables
    private EnPisee testEnPisee;
    private PlayerWeapon testPlayerWeapon;
    private ItemsImages testItem;
    private Buttons op1Button;
    private Buttons op2Button;
    private Buttons op3Button;
    private Buttons op4Button;
    
    // Climb class constructor
    public Climb()
    {
        // Call the superclass constructor with parameters (800, 600, 1)
        super(800, 600, 1);
        
        // Print the introduction and choices for climbing the cliff to the console        
        showText("You start getting closer to the cave, but the only way to get to the cave seems", 400, 20);
        showText("to be up a dangerous cliff side. What do you do?", 400, 40);
        showText("1) Scale unsafe cliff side", 200, 130);
        showText("2) Take the scenic route", 600, 130);
        showText("3) Wait for a lift", 200, 160);
        
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
        
        op3Button = new Buttons("Option3.png");
        addObject(op3Button, 275, 475);
        
    }
    
    // Method that is called continuously by Greenfoot for the actor to perform actions
    public void act() {
        // Check if the mouse click occurred on each button and perform corresponding actions based on the selected option
        
        if (Greenfoot.mouseClicked(op1Button)) {
            showText("OPTION 1 SELECTED: You attempt to scale the cliff, but a rock breaks as you push off and", 400, 40);
            showText("you fall and become a pizza splat on the ground.", 400, 40);
            
            // Transition to the 'Gameover' world by setting the world to a new instance of 'Gameover'
            Greenfoot.setWorld(new Gameover());
        }
        
        if (Greenfoot.mouseClicked(op2Button)) {
            showText("OPTION 2 SELECTED: You take the scenic route. Taking in the beautiful views as you safely make", 400, 40);
            showText("your way to the top.", 400, 40);
            
            // Transition to the 'Cave' world by setting the world to a new instance of 'Cave'
            Greenfoot.setWorld(new Cave());
        }
        
        if (Greenfoot.mouseClicked(op3Button)) {
            showText("OPTION 3 SELECTED: You wait for a lift, and a rock squishes you flat.", 400, 40);            
            
            // Transition to the 'Gameover' world by setting the world to a new instance of 'Gameover'
            Greenfoot.setWorld(new Gameover());
        }
    }
    
    // Method to create the 'EnPisee' object
    public void createEnPisee() {
        // Create an instance of the 'EnPisee' class named 'testEnPisee' with the image "NPChappy.png"
        testEnPisee = new EnPisee("NPChappy.png");
        
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
