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
/**
 * This code defines a class named "Bomb" that extends the "Screen" class.
 * It declares private instance variables for various objects.
 * 
 * The class constructor initializes the superclass with width 800, height 600, and pixel size 1.
 * It displays introduction and choices for dealing with a lit bomb on the screen.
 * It creates instances of buttons and adds them to the world.
 * It also creates instances of other objects and adds them to the world.
 * 
 * The 'act' method is called continuously by Greenfoot and checks for mouse clicks on the buttons.
 * It performs corresponding actions based on the selected option and transitions to other worlds accordingly.
 * 
 * The 'createEnPisee' method creates an instance of the 'EnPisee' class and adds it to the world.
 * 
 * The 'createPlayerWeapon' method creates an instance of the 'PlayerWeapon' class and adds it to the world.
 * 
 * The 'createItems' method creates an instance of the 'ItemsImages' class and adds it to the world.
 */
public class Bomb extends Screen
{
    private EnPisee testEnPisee;
    private PlayerWeapon testPlayerWeapon;
    private ItemsImages testItem;
    private Buttons op1Button;
    private Buttons op2Button;
    private Buttons op3Button;
    private Buttons op4Button;
    
    public Bomb()
    {
        super(800, 600, 1);
        
        showText("You venture on. Eventually, coming across an ornate chest! You open the chest", 400, 20);
        showText("and reach inside an- OH MY GOD!!! IT'S A LIT BOMB!! Quick! Throw it away!!", 400, 40);
        showText("1) Throw bomb", 200, 130);
        showText("2) Hold on to bomb", 600, 130);
        
        createEnPisee();
        
        createButtons();
        createItems();
        createPlayerWeapon();
    }
    
    public void createButtons() {
        op1Button = new Buttons("Option1.png");
        addObject(op1Button, 100, 490);
        
        op2Button = new Buttons("Option2.png");
        addObject(op2Button, 100, 560);
    }
    
    public void act() {
        if (Greenfoot.mouseClicked(op1Button)) {
            showText("OPTION 1 SELECTED: You hurl the bomb away and it explodes harmlessly.", 400, 40);
            Greenfoot.playSound("boop.mp3");
            Greenfoot.setWorld(new Climb());
        }
        
        if (Greenfoot.mouseClicked(op2Button)) {
            showText("OPTION 2 SELECTED: What? Why would yo-", 400, 40);
            showText("The bomb explodes in your hands. Sending pieces of you flying everywhere.", 400, 40);
            Greenfoot.playSound("boop.mp3");
            Greenfoot.setWorld(new Gameover());
        }
    }
    
    public void createEnPisee() {
        testEnPisee = new EnPisee("NPCworry.png");
        addObject(testEnPisee, 400, 320);
    }
    
    public void createPlayerWeapon() {
        testPlayerWeapon = new PlayerWeapon("Shield.png");
        addObject(testPlayerWeapon, 500, 520);
    }
    
    public void createItems() {
        testItem = new ItemsImages("Potion.png");
        addObject(testItem, 700, 520);
    }
}

